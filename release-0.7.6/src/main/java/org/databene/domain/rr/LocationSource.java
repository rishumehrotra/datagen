/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.databene.domain.rr;

/**
 *
 * @author rishu.mehrotra
 */
public enum LocationSource {
    
    WIFI("WIFI"),IP("ip"),LatLong("latlong");
    
    String locSrc;
    
    LocationSource(String locSrc)
    {
        this.locSrc=locSrc;
    }
    
    public String getLocationSource()
    {
        return this.locSrc;
    }
    
}
