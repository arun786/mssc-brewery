package com.arun.msscbrewery.web.controller;

import com.arun.msscbrewery.web.model.BeerDto;
import com.arun.msscbrewery.web.service.BeerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/v1/beer")
    public ResponseEntity<List<BeerDto>> getAllBeer() {
        List<BeerDto> allBeer = beerService.getAllBeer();
        return ResponseEntity.ok(allBeer);
    }

    @PostMapping("/v1/beer")
    public ResponseEntity saveBeer(@RequestBody BeerDto beerDto) {
        BeerDto beer = beerService.saveBeer(beerDto);
        HttpHeaders headers = new HttpHeaders();
        headers.add("location","/api/v1/beer/" + beer.getId().toString());
        return new ResponseEntity(headers,HttpStatus.CREATED);
    }
}
