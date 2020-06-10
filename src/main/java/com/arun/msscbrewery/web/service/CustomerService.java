package com.arun.msscbrewery.web.service;

import com.arun.msscbrewery.web.model.CustomerDto;

import java.util.List;

public interface CustomerService {

    CustomerDto getCustomerBasedOnId(String id);

    List<CustomerDto> getAllCustomer();

    CustomerDto saveCustomer(CustomerDto customerDto);

    void updateCustomer(String id, CustomerDto customerDto);
}
