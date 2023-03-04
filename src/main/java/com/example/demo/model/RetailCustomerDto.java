package com.example.demo.model;

public class RetailCustomerDto extends CustomerDto{
    String pinCode;

    public RetailCustomerDto(Integer customerId) {
        super(customerId);

    }

    public RetailCustomerDto() {}


    public RetailCustomerDto(String pinCode) {
        this.pinCode = pinCode;
    }

    public RetailCustomerDto(Integer customerId, String pinCode) {
        super(customerId);
        this.pinCode = pinCode;
    }

    public RetailCustomerDto(Integer customerId, String customerFullName, String pinCode) {
        super(customerId, customerFullName);
        this.pinCode = pinCode;
    }

    public String getTin() {
        return pinCode;
    }

    public void setTin(String pinCode) {
        this.pinCode = pinCode;
    }


    @Override
    public String toString() {
        return "RetailCustomerDto{" +
                "pinCode='" + pinCode + '\'' +
                ", customerId=" + customerId +
                ", customerFullName='" + customerFullName + '\'' +
                '}';
    }
}
