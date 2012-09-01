/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.databene.domain.ccInfo;

/**
 *
 * @author rishu.mehrotra
 */
public class CarrierCountryInfo {
    
    protected Integer ccid;
    protected Integer countryId;
    protected Integer carrierId;
    protected char shortCode;
    protected Integer regionId;
    protected Integer cityId;
    protected Double latitude;
    protected Double longitude;
    protected Boolean isGeoEnabled;

    public CarrierCountryInfo(Integer ccid, Integer countryId, Integer carrierId, char shortCode, Integer regionId, Integer cityId, Double latitude, Double longitude, Boolean isGeoEnabled) {
        this.ccid = ccid;
        this.countryId = countryId;
        this.carrierId = carrierId;
        this.shortCode = shortCode;
        this.regionId = regionId;
        this.cityId = cityId;
        this.latitude = latitude;
        this.longitude = longitude;
        this.isGeoEnabled = isGeoEnabled;
    }

    public Integer getCarrierId() {
        return carrierId;
    }

    public void setCarrierId(Integer carrierId) {
        this.carrierId = carrierId;
    }

    public Integer getCcid() {
        return ccid;
    }

    public void setCcid(Integer ccid) {
        this.ccid = ccid;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Boolean getIsGeoEnabled() {
        return isGeoEnabled;
    }

    public void setIsGeoEnabled(Boolean isGeoEnabled) {
        this.isGeoEnabled = isGeoEnabled;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public char getShortCode() {
        return shortCode;
    }

    public void setShortCode(char shortCode) {
        this.shortCode = shortCode;
    }

    @Override
    public String toString() {
        return "CarrierCountryInfo{" + "ccid=" + ccid + ", countryId=" + countryId + ", carrierId=" + carrierId + ", shortCode=" + shortCode + ", regionId=" + regionId + ", cityId=" + cityId + ", latitude=" + latitude + ", longitude=" + longitude + ", isGeoEnabled=" + isGeoEnabled + '}';
    }
    

}
