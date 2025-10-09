package com.example.caffeine_spring_cache.models;

public class PaymentInfo {
    private String method;
    private String status;

    public PaymentInfo(String method, String status) {
        this.method = method;
        this.status = status;
    }

    public String getMethod() {
        return method;
    }

    public String getStatus() {
        return status;
    }
}
