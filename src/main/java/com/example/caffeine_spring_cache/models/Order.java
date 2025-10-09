package com.example.caffeine_spring_cache.models;

import java.util.List;

public class Order {
    private Long id;
    private String customerName;
    private List<OrderItem> items;
    private ShippingInfo shipping;
    private PaymentInfo payment;

    public void setId(Long id) {
        this.id = id;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public void setShipping(ShippingInfo shipping) {
        this.shipping = shipping;
    }

    public void setPayment(PaymentInfo payment) {
        this.payment = payment;
    }

    public Long getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public ShippingInfo getShipping() {
        return shipping;
    }

    public PaymentInfo getPayment() {
        return payment;
    }
}
