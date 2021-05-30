package com.example.shipmenttracking;

import com.google.type.DateTime;

public class Checkpoint {
    private String status;
    private String message;
    private DateTime trackingDate;
    private String checkPost;
    private String city;
    private String stateOrProvince;
    private String country;
    private String postcode;

    public Checkpoint() {
    }

    public Checkpoint(String status, String message, DateTime trackingDate, String checkPost, String city, String stateOrProvince, String country, String postcode) {
        this.status = status;
        this.message = message;
        this.trackingDate = trackingDate;
        this.checkPost = checkPost;
        this.city = city;
        this.stateOrProvince = stateOrProvince;
        this.country = country;
        this.postcode = postcode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DateTime getTrackingDate() {
        return trackingDate;
    }

    public void setTrackingDate(DateTime trackingDate) {
        this.trackingDate = trackingDate;
    }

    public String getCheckPost() {
        return checkPost;
    }

    public void setCheckPost(String checkPost) {
        this.checkPost = checkPost;
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

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
}
