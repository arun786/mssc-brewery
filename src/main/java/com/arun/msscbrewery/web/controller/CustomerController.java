package com.arun.msscbrewery.web.controller;

import com.arun.msscbrewery.web.model.BeerDto;
import com.arun.msscbrewery.web.model.CustomerDto;
import com.arun.msscbrewery.web.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {
    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/v1/customer/{id}")
    public ResponseEntity<CustomerDto> getCustomerBasedOnId(@PathVariable("id") String id) {
        CustomerDto customerBasedOnId = customerService.getCustomerBasedOnId(id);
        return ResponseEntity.ok(customerBasedOnId);
    }

    @GetMapping("/v1/customer")
    public ResponseEntity<List<CustomerDto>> getAllCustomer() {
        List<CustomerDto> allCustomer = customerService.getAllCustomer();
        return ResponseEntity.ok(allCustomer);
    }

    @PostMapping("/v1/customer")
    public ResponseEntity saveCustomer(@RequestBody CustomerDto customerDto) {
        CustomerDto customer = customerService.saveCustomer(customerDto);
        HttpHeaders headers = new HttpHeaders();
        //TODO get the request URL
        headers.add("location", "/api/v1/customer/" + customer.getId().toString());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping("/v1/customer/{id}")
    public ResponseEntity updateCustomer(@PathVariable("id") String id, @RequestBody CustomerDto customerDto) {
        customerService.updateCustomer(id, customerDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
