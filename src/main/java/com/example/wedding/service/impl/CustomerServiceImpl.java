package com.example.wedding.service.impl;

import com.example.wedding.entity.Customer;
import com.example.wedding.repository.ICustomerRepository;
import com.example.wedding.request.CustomerRequest;
import com.example.wedding.response.CustomerResponse;
import com.example.wedding.service.ICustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private ICustomerRepository customerRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void createCustomer(CustomerRequest request) {
        Customer customer = new Customer(request);
        customerRepository.save(customer);
    }

    @Override
    public List<CustomerResponse> getCustomers() {
        List<Customer> customers = customerRepository.findAll();
        List<CustomerResponse> responses = modelMapper.map(customers, new TypeToken<List<CustomerResponse>>() {
        }.getType());
        return responses;
    }
}
