package com.example.wedding.service;


import com.example.wedding.request.CustomerRequest;
import com.example.wedding.response.CustomerResponse;

import java.util.List;

public interface ICustomerService {
    void createCustomer(CustomerRequest request);

    List<CustomerResponse> getCustomers();
}
