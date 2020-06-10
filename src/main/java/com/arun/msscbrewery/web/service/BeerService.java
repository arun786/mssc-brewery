package com.arun.msscbrewery.web.service;

import com.arun.msscbrewery.web.model.BeerDto;

import java.util.List;

public interface BeerService {

    BeerDto getBeerBasedOnId(String id);

    List<BeerDto> getAllBeer();

    void saveBeer(BeerDto beerDto);
}
