package com.example.demo.model;

public class CustomerDto {
    Integer customerId;
    String customerFullName;

    public CustomerDto() {
    }

    public CustomerDto(Integer customerId) {
        this.customerId = customerId;
    }

    public CustomerDto(Integer customerId, String customerFullName) {
        this.customerId = customerId;
        this.customerFullName = customerFullName;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerFullName() {
        return customerFullName;
    }

    public void setCustomerFullName(String customerFullName) {
        this.customerFullName = customerFullName;
    }

    @Override
    public String toString() {
        return "CustomerDto{" +
                "customerId=" + customerId +
                ", customerFullName='" + customerFullName + '\'' +
                '}';
    }
}
