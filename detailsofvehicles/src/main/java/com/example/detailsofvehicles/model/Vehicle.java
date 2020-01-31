package com.example.detailsofvehicles.model;


public class Vehicle {

    private long Mfr_ID;
    private String Mfr_Name;
    private String City;
    private String State;
    private String Country;

    public long getMfr_ID() {
        return Mfr_ID;
    }

    public void setMfr_ID(long mfr_ID) {
        Mfr_ID = mfr_ID;
    }

    public String getMfr_Name() {
        return Mfr_Name;
    }

    public void setMfr_Name(String mfr_Name) {
        Mfr_Name = mfr_Name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }
}
