package com.REST_services.PaymentService.models;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;


public class PaymentDetails {

    private String id;
    @NotNull(message = "Amount is required")
    @DecimalMin(value = "0.01", message = "Amount must be positive")
    private double amount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
