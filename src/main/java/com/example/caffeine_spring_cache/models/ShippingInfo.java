package com.example.caffeine_spring_cache.models;

public class ShippingInfo {
    private String address;
    private String carrier;

    public ShippingInfo(String address, String carrier) {
        this.address = address;
        this.carrier = carrier;
    }

    public String getAddress() {
        return address;
    }

    public String getCarrier() {
        return carrier;
    }
}
