package com.example.demo.model;

public class CorporateCustomerDto extends CustomerDto {

    String tin;


    public CorporateCustomerDto() {
    }
    public CorporateCustomerDto(Integer customerId) {
        super(customerId);

    }



    public CorporateCustomerDto(Integer customerId, String tin) {
        super(customerId);
        this.tin = tin;
    }




    public CorporateCustomerDto(Integer customerId, String customerFullName, String tin) {
        super(customerId, customerFullName);
        this.tin = tin;
    }

    public void setPinCode(String tin) {
        this.tin = tin;
    }

    @Override
    public String toString() {
        return "CorporateCustomerDto{" +
                "tin='" + tin + '\'' +
                ", customerId=" + customerId +
                ", customerFullName='" + customerFullName + '\'' +
                '}';
    }
}
