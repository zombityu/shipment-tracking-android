package com.example.shipmenttracking;

import com.google.type.DateTime;

import java.util.List;

public class ShipmentTracking {
    private String orderFrom;
    private String carrierTrackingUrl;
    private DateTime trackingDate;
    private String status;
    private DateTime statusChangeDate;
    private String statusChangeReason;
    private int weight;
    private DateTime estimatedDeliveryDate;
    private List<Address> addressFrom;
    private List<Address> addressTo;
    private List<Checkpoint> checkpoint;

    public ShipmentTracking() {
    }

    public ShipmentTracking(String orderFrom, String carrierTrackingUrl, DateTime trackingDate, String status, DateTime statusChangeDate, String statusChangeReason, int weight, DateTime estimatedDeliveryDate, List<Address> addressFrom, List<Address> addressTo, List<Checkpoint> checkpoint) {
        this.orderFrom = orderFrom;
        this.carrierTrackingUrl = carrierTrackingUrl;
        this.trackingDate = trackingDate;
        this.status = status;
        this.statusChangeDate = statusChangeDate;
        this.statusChangeReason = statusChangeReason;
        this.weight = weight;
        this.estimatedDeliveryDate = estimatedDeliveryDate;
        this.addressFrom = addressFrom;
        this.addressTo = addressTo;
        this.checkpoint = checkpoint;
    }

    public String getOrderFrom() {
        return orderFrom;
    }

    public void setOrderFrom(String orderFrom) {
        this.orderFrom = orderFrom;
    }

    public String getCarrierTrackingUrl() {
        return carrierTrackingUrl;
    }

    public void setCarrierTrackingUrl(String carrierTrackingUrl) {
        this.carrierTrackingUrl = carrierTrackingUrl;
    }

    public DateTime getTrackingDate() {
        return trackingDate;
    }

    public void setTrackingDate(DateTime trackingDate) {
        this.trackingDate = trackingDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DateTime getStatusChangeDate() {
        return statusChangeDate;
    }

    public void setStatusChangeDate(DateTime statusChangeDate) {
        this.statusChangeDate = statusChangeDate;
    }

    public String getStatusChangeReason() {
        return statusChangeReason;
    }

    public void setStatusChangeReason(String statusChangeReason) {
        this.statusChangeReason = statusChangeReason;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public DateTime getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    public void setEstimatedDeliveryDate(DateTime estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    public List<Address> getAddressFrom() {
        return addressFrom;
    }

    public void setAddressFrom(List<Address> addressFrom) {
        this.addressFrom = addressFrom;
    }

    public List<Address> getAddressTo() {
        return addressTo;
    }

    public void setAddressTo(List<Address> addressTo) {
        this.addressTo = addressTo;
    }

    public List<Checkpoint> getCheckpoint() {
        return checkpoint;
    }

    public void setCheckpoint(List<Checkpoint> checkpoint) {
        this.checkpoint = checkpoint;
    }
}
