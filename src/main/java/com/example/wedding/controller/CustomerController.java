package com.example.wedding.controller;

import com.example.wedding.request.CustomerRequest;
import com.example.wedding.response.CustomerResponse;
import com.example.wedding.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/wedding/customer")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @GetMapping()
    public ResponseEntity<?> getCustomers(){
        List<CustomerResponse> responses = customerService.getCustomers();
        return new ResponseEntity<>(responses, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<?> createCustomer(@RequestBody CustomerRequest request){
        customerService.createCustomer(request);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
