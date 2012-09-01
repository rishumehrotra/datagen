/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.databene.domain.handset;

/**
 *
 * @author rishu.mehrotra
 */
public class Handset {
    
    protected Integer id;
    protected String externalId;
    protected String targetingArray;
    protected Integer manufacturerId;
    protected Integer deviceOSVersion;
    protected String newTargetingBitmap;
    protected String xUserAgent;
    protected DeviceParameters dparams;
    

    public Handset(Integer id, String externalId, String targetingArray, Integer manufacturerId, Integer deviceOSVersion, String newTargetingBitmap) {
        this.id = id;
        this.externalId = externalId;
        this.targetingArray = targetingArray;
        this.manufacturerId = manufacturerId;
        this.deviceOSVersion = deviceOSVersion;
        this.newTargetingBitmap = newTargetingBitmap;
    }

    public Integer getDeviceOSVersion() {
        return deviceOSVersion;
    }

    public void setDeviceOSVersion(Integer deviceOSVersion) {
        this.deviceOSVersion = deviceOSVersion;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Integer manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getNewTargetingBitmap() {
        return newTargetingBitmap;
    }

    public void setNewTargetingBitmap(String newTargetingBitmap) {
        this.newTargetingBitmap = newTargetingBitmap;
    }

    public String getTargetingArray() {
        return targetingArray;
    }

    public void setTargetingArray(String targetingArray) {
        this.targetingArray = targetingArray;
    }

    @Override
    public String toString() {
        return "Handset{" + "id=" + id + ", externalId=" + externalId + ", targetingArray=" + targetingArray + ", manufacturerId=" + manufacturerId + ", deviceOSVersion=" + deviceOSVersion + ", newTargetingBitmap=" + newTargetingBitmap + '}';
    }
    
    
}
