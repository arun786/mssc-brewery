package com.arun.msscbrewery.web.service;

import com.arun.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerBasedOnId(String id) {

        //TODO
        return null;
    }

    @Override
    public List<CustomerDto> getAllCustomer() {
        //TODO
        return null;
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        //TODO
        return null;
    }

    @Override
    public void updateCustomer(String id, CustomerDto customerDto) {
        //TODO

    }

    @Override
    public void deleteCustomer(String id) {
        //TODO
    }
}
