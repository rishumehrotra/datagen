/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.databene.domain.rr;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import org.databene.domain.CarrierCountry;
import org.databene.domain.handset.Handset;
import org.databene.domain.selectedAds.SelectedAds;
import org.databene.domain.user.User;

/**
 *
 * @author rishu.mehrotra
 */
public class RR {
    
    protected Integer ver;
    protected String tid;
    protected Date date;
    protected Date ttime;
    protected Terminated terminated;
    protected Integer lTime;
    protected String host;
    protected List<String> bucket;
    
    //get all jsons and put them as a map here. Ask Karan tomorrow
    
    protected XHeaders xHeaders;
    protected Site site;
    
    
    protected Integer rqMkAdcountVar;
    protected Integer numCfAdsVar;
    
    //confirm this one
    protected List<String> allowedAds;
    protected Integer rqMkAdcount;
    protected String ub;
    protected String subBucket;
    protected List<Integer> vmSbC;
    protected String rqHPageURl;
    protected String ctrFileVer;
    protected String etuVer;
    protected String fileVersion;
    protected String wSCarrier;
    protected String rqXInmobiPhoneUseragent;
    protected Integer numCfAds;
    protected LocationSource locSrc;
    protected Integer rqMkAdSlot;
    protected Integer slotServed;
    protected List<rqSrcPart> rqSrcList;
    protected String rqMkVersion;
    protected String rqFormat;
    protected Boolean oOut;
    protected SelectedAds selectedAds;
    
    protected CarrierCountry carrierCountry;
    protected Handset handset;
    
    
    protected User user;

    public RR(Integer ver) {
        this.ver = ver;
        this.tid=UUID.randomUUID().toString();
    }

    

    public List<String> getBucket() {
        return bucket;
    }

    public void setBucket(List<String> bucket) {
        this.bucket = bucket;
    }

    public String getCtrFileVer() {
        return ctrFileVer;
    }

    public void setCtrFileVer(String ctrFileVer) {
        this.ctrFileVer = ctrFileVer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEtuVer() {
        return etuVer;
    }

    public void setEtuVer(String etuVer) {
        this.etuVer = etuVer;
    }

    public String getFileVersion() {
        return fileVersion;
    }

    public void setFileVersion(String fileVersion) {
        this.fileVersion = fileVersion;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getlTime() {
        return lTime;
    }

    public void setlTime(Integer lTime) {
        this.lTime = lTime;
    }

    public LocationSource getLocSrc() {
        return locSrc;
    }

    public void setLocSrc(LocationSource locSrc) {
        this.locSrc = locSrc;
    }

    public Integer getNumCfAds() {
        return numCfAds;
    }

    public void setNumCfAds(Integer numCfAds) {
        this.numCfAds = numCfAds;
    }

    public Integer getNumCfAdsVar() {
        return numCfAdsVar;
    }

    public void setNumCfAdsVar(Integer numCfAdsVar) {
        this.numCfAdsVar = numCfAdsVar;
    }

    public Boolean getoOut() {
        return oOut;
    }

    public void setoOut(Boolean oOut) {
        this.oOut = oOut;
    }

    public String getRqFormat() {
        return rqFormat;
    }

    public void setRqFormat(String rqFormat) {
        this.rqFormat = rqFormat;
    }

    public String getRqHPageURl() {
        return rqHPageURl;
    }

    public void setRqHPageURl(String rqHPageURl) {
        this.rqHPageURl = rqHPageURl;
    }

    public Integer getRqMkAdSlot() {
        return rqMkAdSlot;
    }

    public void setRqMkAdSlot(Integer rqMkAdSlot) {
        this.rqMkAdSlot = rqMkAdSlot;
    }

    public Integer getRqMkAdcount() {
        return rqMkAdcount;
    }

    public void setRqMkAdcount(Integer rqMkAdcount) {
        this.rqMkAdcount = rqMkAdcount;
    }

    public Integer getRqMkAdcountVar() {
        return rqMkAdcountVar;
    }

    public void setRqMkAdcountVar(Integer rqMkAdcountVar) {
        this.rqMkAdcountVar = rqMkAdcountVar;
    }

 

    public String getRqMkVersion() {
        return rqMkVersion;
    }

    public void setRqMkVersion(String rqMkVersion) {
        this.rqMkVersion = rqMkVersion;
    }

    public List<rqSrcPart> getRqSrcList() {
        return rqSrcList;
    }

    public void setRqSrcList(List<rqSrcPart> rqSrcList) {
        this.rqSrcList = rqSrcList;
    }

    public String getRqXInmobiPhoneUseragent() {
        return rqXInmobiPhoneUseragent;
    }

    public void setRqXInmobiPhoneUseragent(String rqXInmobiPhoneUseragent) {
        this.rqXInmobiPhoneUseragent = rqXInmobiPhoneUseragent;
    }

    public SelectedAds getSelectedAds() {
        return selectedAds;
    }

    public void setSelectedAds(SelectedAds selectedAds) {
        this.selectedAds = selectedAds;
    }

    public Integer getSlotServed() {
        return slotServed;
    }

    public void setSlotServed(Integer slotServed) {
        this.slotServed = slotServed;
    }

    public String getSubBucket() {
        return subBucket;
    }

    public void setSubBucket(String subBucket) {
        this.subBucket = subBucket;
    }

    public Terminated getTerminated() {
        return terminated;
    }

    public void setTerminated(Terminated terminated) {
        this.terminated = terminated;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getUb() {
        return ub;
    }

    public void setUb(String ub) {
        this.ub = ub;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getVer() {
        return ver;
    }

    public void setVer(Integer ver) {
        this.ver = ver;
    }

    public List<Integer> getVmSbC() {
        return vmSbC;
    }

    public void setVmSbC(List<Integer> vmSbC) {
        this.vmSbC = vmSbC;
    }

    public String getwSCarrier() {
        return wSCarrier;
    }

    public void setwSCarrier(String wSCarrier) {
        this.wSCarrier = wSCarrier;
    }

    @Override
    public String toString() {
        return "RR{" + "ver=" + ver + ", tid=" + tid + ", date=" + date + ", ttime=" + ttime + ", terminated=" + terminated + ", lTime=" + lTime + ", host=" + host + ", bucket=" + bucket + ", xHeaders=" + xHeaders + ", site=" + site + ", rqMkAdcountVar=" + rqMkAdcountVar + ", numCfAdsVar=" + numCfAdsVar + ", allowedAds=" + allowedAds + ", rqMkAdcount=" + rqMkAdcount + ", ub=" + ub + ", subBucket=" + subBucket + ", vmSbC=" + vmSbC + ", rqHPageURl=" + rqHPageURl + ", ctrFileVer=" + ctrFileVer + ", etuVer=" + etuVer + ", fileVersion=" + fileVersion + ", wSCarrier=" + wSCarrier + ", rqXInmobiPhoneUseragent=" + rqXInmobiPhoneUseragent + ", numCfAds=" + numCfAds + ", locSrc=" + locSrc + ", rqMkAdSlot=" + rqMkAdSlot + ", slotServed=" + slotServed + ", rqSrcList=" + rqSrcList + ", rqMkVersion=" + rqMkVersion + ", rqFormat=" + rqFormat + ", oOut=" + oOut + ", selectedAds=" + selectedAds + ", carrierCountry=" + carrierCountry + ", handset=" + handset + ", user=" + user + '}';
    }


    
 
}
