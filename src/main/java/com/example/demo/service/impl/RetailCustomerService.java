package com.example.demo.service.impl;

import com.example.demo.dao.CustomerEntity;
import com.example.demo.dao.CustomerRepository;
import com.example.demo.model.NoDataFoundException;
import com.example.demo.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RetailCustomerService implements CustomerService {

//    public static final List<RetailCustomerDto> retailCustomerDto =  new ArrayList<>();
//
//    @Override
//    public CustomerDto returnCustomer(Integer customerId) {
//        CustomerDto customerDto= retailCustomerDto.stream().filter(it-> it.getCustomerId() == customerId).findFirst().orElseThrow(()-> new RuntimeException("retail customer not found"));
//        return customerDto;
//    }
//
//    @Override
//    public void saveCustomerInfo(CustomerDto customerDto) {
//        retailCustomerDto.add((RetailCustomerDto) customerDto);
//    }


    private final CustomerRepository customerRepository ;

    public RetailCustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public CustomerEntity returnCustomer(Integer customerId) {

        return customerRepository.findById(customerId).orElseThrow(()->new NoDataFoundException("Customer not found"));
    }

    @Override
    public void saveCustomerInfo(CustomerEntity customerEntity) {
        customerRepository.save(customerEntity);
    }
    @Override
    public void deleteCustomer(Integer customerId){
        customerRepository.deleteById(customerId);
    }


    @Override
    public void deleteAllCustomer(List<Integer> list){
        customerRepository.deleteAllById(list);
    }
}
