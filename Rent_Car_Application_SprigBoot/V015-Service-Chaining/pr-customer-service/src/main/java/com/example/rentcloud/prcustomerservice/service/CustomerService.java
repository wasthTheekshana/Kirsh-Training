package com.example.rentcloud.prcustomerservice.service;

import org.example.rentcloud.model.customer.Customer;

import java.util.List;

public interface CustomerService {

    Customer save(Customer customer);

    Customer findById(int id);

    List<Customer> findAll();

}
