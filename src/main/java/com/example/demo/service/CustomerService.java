package com.example.demo.service;

import com.example.demo.dao.CustomerEntity;

import java.util.List;

public interface CustomerService {
//    public CustomerDto returnCustomer(Integer customerId);
//    public void saveCustomerInfo(CustomerDto customerDto);



    public CustomerEntity returnCustomer(Integer customerId);
    public void saveCustomerInfo(CustomerEntity customerDto);
    public void deleteCustomer(Integer customerId);

    public void deleteAllCustomer(List<Integer> list);

}
