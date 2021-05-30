package com.example.shipmenttracking;

public class Address {
    private String streetNr;
    private String streetName;
    private String streetType;
    private String postcode;
    private String city;
    private String stateOrProvince;
    private String country;

    public Address() {
    }

    public Address(String streetNr, String streetName, String streetType, String postcode, String city, String stateOrProvince, String country) {
        this.streetNr = streetNr;
        this.streetName = streetName;
        this.streetType = streetType;
        this.postcode = postcode;
        this.city = city;
        this.stateOrProvince = stateOrProvince;
        this.country = country;
    }

    public String getStreetNr() {
        return streetNr;
    }

    public void setStreetNr(String streetNr) {
        this.streetNr = streetNr;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetType() {
        return streetType;
    }

    public void setStreetType(String streetType) {
        this.streetType = streetType;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateOrProvince() {
        return stateOrProvince;
    }

    public void setStateOrProvince(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
