//package com.example.demo.controller;
//
//import com.example.demo.model.CorporateCustomerDto;
//import com.example.demo.model.CustomerDto;
//import com.example.demo.service.CustomerService;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/corporate-customers")
//public class CorporateCustomerController {
//
//    private final CustomerService customerService ;
//
//    public CorporateCustomerController(@Qualifier("corporateCustomerService") CustomerService customerService) {
//        this.customerService = customerService;
//    }
//
//    @GetMapping("/{customerId}")
//    public CorporateCustomerDto corporateCustomerInfo(@PathVariable  Integer customerId){
//        return (CorporateCustomerDto)customerService.returnCustomer(customerId);
//    }
//}
