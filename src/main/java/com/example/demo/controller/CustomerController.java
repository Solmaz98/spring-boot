package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping
public class CustomerController {
    static final Map<Integer, String> myHashMap =new HashMap<>();
    int count =0;

    @GetMapping("/getName/{customerId}")
    public String getResponse(@PathVariable int customerId) {
        return myHashMap.get(customerId);

    }
//    @RequestParam String name ,


    @PostMapping("/customer/newCustomer")
    public void postCustomerInfo(@RequestBody String fullName) {
        count++;
        myHashMap.put(count ,fullName);
    }



    @GetMapping("/{customerId}")
    public String getCustomerInfo(@PathVariable int customerId) {
        return myHashMap.get(customerId);

    }



}
