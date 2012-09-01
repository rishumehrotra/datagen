/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.databene.domain.handset;

/**
 *
 * @author rishu.mehrotra
 */
public class DeviceParameters {
    
    protected Double deviceScreenDensity;
    protected String deviceScreenSize;
    protected String deviceBthw;
    protected String deviceMachineHw;
    protected String deviceModel;
    protected String deviceName;
    protected DeviceStorage deviceStorage;
    protected String deviceSystemName;
    protected Double deviceSystemVersion;
    protected String localization;
    protected String netType;
    protected Integer orientation;

    public String getDeviceBthw() {
        return deviceBthw;
    }

    public void setDeviceBthw(String deviceBthw) {
        this.deviceBthw = deviceBthw;
    }

    public String getDeviceMachineHw() {
        return deviceMachineHw;
    }

    public void setDeviceMachineHw(String deviceMachineHw) {
        this.deviceMachineHw = deviceMachineHw;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public Double getDeviceScreenDensity() {
        return deviceScreenDensity;
    }

    public void setDeviceScreenDensity(Double deviceScreenDensity) {
        this.deviceScreenDensity = deviceScreenDensity;
    }

    public String getDeviceScreenSize() {
        return deviceScreenSize;
    }

    public void setDeviceScreenSize(String deviceScreenSize) {
        this.deviceScreenSize = deviceScreenSize;
    }

    public DeviceStorage getDeviceStorage() {
        return deviceStorage;
    }

    public void setDeviceStorage(DeviceStorage deviceStorage) {
        this.deviceStorage = deviceStorage;
    }

    public String getDeviceSystemName() {
        return deviceSystemName;
    }

    public void setDeviceSystemName(String deviceSystemName) {
        this.deviceSystemName = deviceSystemName;
    }

    public Double getDeviceSystemVersion() {
        return deviceSystemVersion;
    }

    public void setDeviceSystemVersion(Double deviceSystemVersion) {
        this.deviceSystemVersion = deviceSystemVersion;
    }

    public String getLocalization() {
        return localization;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }

    public String getNetType() {
        return netType;
    }

    public void setNetType(String netType) {
        this.netType = netType;
    }

    public Integer getOrientation() {
        return orientation;
    }

    public void setOrientation(Integer orientation) {
        this.orientation = orientation;
    }
    
    
    
}
