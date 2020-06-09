package com.arun.msscbrewery.web.controller;

import com.arun.msscbrewery.web.model.BeerDto;
import com.arun.msscbrewery.web.service.BeerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api")
public class BeerController {

    private BeerService beerService;

    @Autowired
    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/v1/beer/{id}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("id") String id) {
        BeerDto beerBasedOnId = beerService.getBeerBasedOnId(id);
        return ResponseEntity.ok(beerBasedOnId);
    }
}
