package com.example.detailsofvehicles.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {

    private Object address;
    private Object address2;
    private String city;
    private String contactEmail;
    private Object contactFax;
    private Object contactPhone;
    private String country;
    private Object dBAs;
    private List<Object> equipmentItems = null;
    private String lastUpdated;
    private List<Object> manufacturerTypes = null;
    private Object mfrCommonName;
    private Integer mfrID;
    private String mfrName;
    private Object otherManufacturerDetails;
    private Object postalCode;
    private Object primaryProduct;
    private Object principalFirstName;
    private Object principalLastName;
    private Object principalPosition;
    private Object stateProvince;
    private String submittedName;
    private Object submittedOn;
    private Object submittedPosition;
    private List<Object> vehicleTypes = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Object getAddress() {
        return address;
    }

    public void setAddress(Object address) {
        this.address = address;
    }

    public Object getAddress2() {
        return address2;
    }

    public void setAddress2(Object address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public Object getContactFax() {
        return contactFax;
    }

    public void setContactFax(Object contactFax) {
        this.contactFax = contactFax;
    }

    public Object getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(Object contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Object getDBAs() {
        return dBAs;
    }

    public void setDBAs(Object dBAs) {
        this.dBAs = dBAs;
    }

    public List<Object> getEquipmentItems() {
        return equipmentItems;
    }

    public void setEquipmentItems(List<Object> equipmentItems) {
        this.equipmentItems = equipmentItems;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public List<Object> getManufacturerTypes() {
        return manufacturerTypes;
    }

    public void setManufacturerTypes(List<Object> manufacturerTypes) {
        this.manufacturerTypes = manufacturerTypes;
    }

    public Object getMfrCommonName() {
        return mfrCommonName;
    }

    public void setMfrCommonName(Object mfrCommonName) {
        this.mfrCommonName = mfrCommonName;
    }

    public Integer getMfrID() {
        return mfrID;
    }

    public void setMfrID(Integer mfrID) {
        this.mfrID = mfrID;
    }

    public String getMfrName() {
        return mfrName;
    }

    public void setMfrName(String mfrName) {
        this.mfrName = mfrName;
    }

    public Object getOtherManufacturerDetails() {
        return otherManufacturerDetails;
    }

    public void setOtherManufacturerDetails(Object otherManufacturerDetails) {
        this.otherManufacturerDetails = otherManufacturerDetails;
    }

    public Object getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Object postalCode) {
        this.postalCode = postalCode;
    }

    public Object getPrimaryProduct() {
        return primaryProduct;
    }

    public void setPrimaryProduct(Object primaryProduct) {
        this.primaryProduct = primaryProduct;
    }

    public Object getPrincipalFirstName() {
        return principalFirstName;
    }

    public void setPrincipalFirstName(Object principalFirstName) {
        this.principalFirstName = principalFirstName;
    }

    public Object getPrincipalLastName() {
        return principalLastName;
    }

    public void setPrincipalLastName(Object principalLastName) {
        this.principalLastName = principalLastName;
    }

    public Object getPrincipalPosition() {
        return principalPosition;
    }

    public void setPrincipalPosition(Object principalPosition) {
        this.principalPosition = principalPosition;
    }

    public Object getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(Object stateProvince) {
        this.stateProvince = stateProvince;
    }

    public String getSubmittedName() {
        return submittedName;
    }

    public void setSubmittedName(String submittedName) {
        this.submittedName = submittedName;
    }

    public Object getSubmittedOn() {
        return submittedOn;
    }

    public void setSubmittedOn(Object submittedOn) {
        this.submittedOn = submittedOn;
    }

    public Object getSubmittedPosition() {
        return submittedPosition;
    }

    public void setSubmittedPosition(Object submittedPosition) {
        this.submittedPosition = submittedPosition;
    }

    public List<Object> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<Object> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
