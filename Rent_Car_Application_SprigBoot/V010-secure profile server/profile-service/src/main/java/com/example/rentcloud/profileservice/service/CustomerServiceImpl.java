package com.example.rentcloud.profileservice.service;

import com.example.rentcloud.profileservice.repository.CustomerRepository;
import org.example.rentcloud.commons.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {

        return customerRepository.save(customer);
    }
}
