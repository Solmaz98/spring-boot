package com.example.demo.controller;

import com.example.demo.dao.CustomerEntity;
import com.example.demo.service.CustomerService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/retail-customers")
public class RetailCustomerController {

    private final CustomerService customerService ;

    public RetailCustomerController(@Qualifier("retailCustomerService") CustomerService customerService) {
        this.customerService = customerService;
    }


        @GetMapping("{id}")
    public CustomerEntity getRetailCustomerInfoByHeader(@PathVariable Integer id){
        return  customerService.returnCustomer(id);
    }


    @DeleteMapping("/delete/{customerId}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteCustomer(@PathVariable Integer customerId)
    {
        customerService.deleteCustomer(customerId);
    }


    @PostMapping("/save")
    public void saveCustomerInfo(@RequestBody  CustomerEntity customerEntity)
    {

        customerService.saveCustomerInfo(customerEntity);
    }


    @PostMapping("/saveAll")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void saveCustomerInfo(@RequestBody List<CustomerEntity> customerEntityList)
    {
        for (CustomerEntity list:customerEntityList
             ) {
            customerService.saveCustomerInfo(list);
        }

    }

    @DeleteMapping("/deleteAll")
    public void deleteAllCustomer(@RequestBody List<Integer> listCustomer){
        customerService.deleteAllCustomer(listCustomer);
    }

//
//   @GetMapping("/{customerId}")
//    public RetailCustomerDto getRetailCustomerInfo(@PathVariable Integer customerId){
//       return (RetailCustomerDto) customerService.returnCustomer(customerId);
//   }
//
//    @GetMapping("/")
//    public RetailCustomerDto getRetailCustomerInfoByHeader(@RequestHeader Integer customerId){
//        return (RetailCustomerDto) customerService.returnCustomer(customerId);
//    }
//
//    @PostMapping("/newCustomer")
//@ResponseStatus(HttpStatus.CREATED)
//    public String postCustomerInfo(@RequestBody RetailCustomerDto retailObject ) {
//        customerService.saveCustomerInfo(retailObject);
//      return null;
//    }

}
