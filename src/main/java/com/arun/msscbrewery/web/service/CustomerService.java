package com.arun.msscbrewery.web.service;

import com.arun.msscbrewery.web.model.CustomerDto;

import java.util.List;

public interface CustomerService {

    CustomerDto getCustomerBasedOnId(String id);

    List<CustomerDto> getAllCustomer();

    void saveCustomer(CustomerDto customerDto);
}