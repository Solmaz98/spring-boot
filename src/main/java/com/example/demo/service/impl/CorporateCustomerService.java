//package com.example.demo.service.impl;
//
//import com.example.demo.model.CorporateCustomerDto;
//import com.example.demo.model.CustomerDto;
//import com.example.demo.model.RetailCustomerDto;
//import com.example.demo.service.CustomerService;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//@Service
//public class CorporateCustomerService implements CustomerService {
//
//    public static final List<CorporateCustomerDto> corporateCustomerDto = new ArrayList<>();
//    @Override
//    public   CustomerDto returnCustomer(Integer customerId) {
////        CorporateCustomerDto customerDto = corporateCustomerDto.get(customerId);
////        return customerDto;
//        CustomerDto customerDto= corporateCustomerDto.stream().filter(it-> it.getCustomerId() == customerId).findFirst().orElseThrow(()-> new RuntimeException("corporate customer not found"));
//        return customerDto;
//    }
//
//    @Override
//    public void saveCustomerInfo(CustomerDto customerDto) {
//        corporateCustomerDto.add((CorporateCustomerDto)customerDto);
//    }
//}
