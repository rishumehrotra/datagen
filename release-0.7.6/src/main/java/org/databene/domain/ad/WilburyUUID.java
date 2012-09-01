/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.databene.domain.ad;

/**
 *
 * @author rishu.mehrotra
 */
import java.util.UUID;
import java.util.Random;

/**
 * WilburyUUID has a method getUUID that generates a variant 2 (Leach-Salz)) time based (version 1) UUID.
 *
 */
public class WilburyUUID
{
    private static final long CLK_SEQ_14_MASK   = 0x0000000000003f00L; // Least  14  bits mask
    private static final long NODE_48_MASK      = 0x0000ffff000000ffL; // Least  48  bits mask
    private static final long ADVERSION_16_MASK = 0x0000ffff00000000L; // bit mask used for ad_version
    private static final long MCID_12_MASK      = 0x0000fff000000000L; // bit mask used for machine id (within a data center)
    private static final long LSIG_WO_INT_KEY   = 0xff00ffff000000ffL; // LSIG without int key
    private static final long TIME_32_LOW_MASK  = 0x00000000ffffffffL; // Least  32  bits mask
    private static final long TIME_16_MID_MASK  = 0x0000ffff00000000L; // Middle 16  bits mask
    private static final long TIME_12_HIG_MASK  = 0x0fff000000000000L; // High 12/16 bits mask
    private static final long LEAST_8_BITS_MASK = 0x00000000000000ffL; // Least 8 bits mask
    private static final long MID_16_BITS_MASK  = 0x0000000000ffff00L; // Mid 16 bits mask for integer
    private static final long HIGH_8_BITS_MASK  = 0x00000000ff000000L; // Highest 8 bits mask for integer
    private static final long DCID_7_BITS_MASK  = 0x00000000000000feL; // Highest 8 bits mask for integer
    private static final long CCTR_LOWER_4_MASK = 0x0000000f00000000L; // Lower 4 bits mask for cyclic counter
    private static final long CCTR_HIGH_3_MASK  = 0x0000000000000007L; // Higher 3 bits mask for cyclic counter

    private static final long VARIANT = 0xC000000000000000L; // Leach-Salz variant code
    private static final long VERSION = 0x0000000000001000L; // Version - Time based UUID

    public  static UUID  getUUID()
    {
        Random rand = new Random();

        long lsig, msig;                                       // Least significant and most significant

        long time      = System.currentTimeMillis();
        long clock_seq = rand.nextLong() & CLK_SEQ_14_MASK;    // Take the clock_seq to be random
        //long node      = rand.nextLong() & NODE_48_MASK;       // Let the node also be random

        lsig =   VARIANT                                       // 2 highest bits of variant
               | (clock_seq  << 48);                            // next 14 bits of clock_sequence
               //| node;                                         // next 48 bits for node

        msig =   ((time      &  TIME_32_LOW_MASK) << 32)       // first 32 bits for time_low
               | ((time      &  TIME_16_MID_MASK) >> 16)       // next  16 bits fo time_mid
               | VERSION                                       // next  4  bits of version
               | ((time      &  TIME_12_HIG_MASK ) >> 48);     // last 12 bits of time_high
        
        return new UUID(msig, lsig);
    }

    public static UUID setIntKey( String uuid, int key )
    {
        UUID u    = UUID.fromString(uuid);
        long lsig = u.getLeastSignificantBits();
        long msig = u.getMostSignificantBits();
        long lkey = (long)key;

        lsig =   (lsig & LSIG_WO_INT_KEY)
               | ((lkey & LEAST_8_BITS_MASK) << 48 )        // Put lower 8 bits in the low bits of clock_seq
               | ((lkey & MID_16_BITS_MASK)  << 8  )        // Put middle 16 bits in the high of node
               | ((lkey & HIGH_8_BITS_MASK)  >> 16 );       // Put highest 8 bits in the low of node

        return new UUID(msig, lsig);
    } 

    public static int getIntKey( String uuid )
    {
        UUID u = UUID.fromString( uuid );
        long lsig = u.getLeastSignificantBits();

        int  key  = (int)( 
                          ((lsig >> 48) & LEAST_8_BITS_MASK)
                        | ((lsig >> 8 ) & MID_16_BITS_MASK)
                        | ((lsig << 16) & HIGH_8_BITS_MASK)
                        );
        return key;
    }

    public static UUID extractUUID( String uuid )
    {
        UUID u = UUID.fromString( uuid );

        long lsig   = u.getLeastSignificantBits();
        long msig   = u.getMostSignificantBits();
        lsig  &= LSIG_WO_INT_KEY;

        return new UUID(msig, lsig);
    }
    
    public static void main(String[] args) {
        UUID u = UUID.randomUUID();
        System.out.println(u.toString());
    }

    public static UUID setDataCenterId(String uuid, byte value) {
        UUID u = UUID.fromString(uuid);
        long msig = u.getMostSignificantBits();
        long lsig = u.getLeastSignificantBits();
        byte revDCId = (byte) (Integer.reverse(value) >>> 27); // >>> 27 instad of >>> 25
        long new_lsig  = (lsig) | (revDCId << 3); // << 3 instad of << 1
        return new UUID(msig, new_lsig);
    }

    /*
     * Reversing the data center id so that the unused bits can be used by the 
     * cyclic counter. Need to convert byte to int before reversal.
     */
    public static byte getDataCenterId(String uuid) {
        UUID u = UUID.fromString(uuid);
        long lsig = u.getLeastSignificantBits();
        /* 
         * lsig & 0xfe will fetch 7 bits of dc id. Now since 2 bits of dc id is 
         * used by the cyclic counter, we should not be reading these bits. 
         * Hence do lsig & 0xf8
         */
        //byte revDCId = (byte) ((lsig & 0xfe) >> 1);
        byte revDCId = (byte) ((lsig & 0xf8) >> 1);
        int dcIdInt = revDCId << 25;
	    byte dcId = (byte) (Integer.reverse(dcIdInt));
        return dcId;
    }

    public static UUID setMachineId(String uuid, short value)
    {
        UUID u = UUID.fromString(uuid);
        long msig = u.getMostSignificantBits();
        long lsig = u.getLeastSignificantBits();
        lsig &= 0xFFFF000FFFFFFFFFL;
        long new_lsig = lsig | ((long) value << 36);
        return new UUID(msig,new_lsig);
    }

    public static short getMachineId(String uuid)
    {
        UUID u = UUID.fromString(uuid);
        long lsig = u.getLeastSignificantBits();
        return (short) ((lsig & MCID_12_MASK) >>> 36);
    }

    public static UUID setCyclicCounter(String uuid, byte value)
    {
    	UUID u = UUID.fromString(uuid);
    	long msig = u.getMostSignificantBits();
        long lsig = u.getLeastSignificantBits();
        lsig &= 0xFFFFFFF0FFFFFFF8L;
        long lower4BitsValue = ((long) value << 32) & CCTR_LOWER_4_MASK;
        long new_lsig = lsig | lower4BitsValue;
        new_lsig |= value >>> 4;
        return new UUID(msig,new_lsig);
    }

    public static byte getCyclicCounter(String uuid)
    {
    	UUID u = UUID.fromString(uuid);
        long lsig = u.getLeastSignificantBits();
        byte ctrValue = (byte)(((lsig & CCTR_LOWER_4_MASK) >>> 32) | ((lsig & CCTR_HIGH_3_MASK) << 4));
        return ctrValue;
    }
}
