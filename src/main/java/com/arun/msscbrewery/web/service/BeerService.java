package com.arun.msscbrewery.web.service;

import com.arun.msscbrewery.web.model.BeerDto;
import com.arun.msscbrewery.web.model.BeerDtoV2;

import java.util.List;

public interface BeerService {

    BeerDto getBeerBasedOnId(String id);

    List<BeerDto> getAllBeer();

    BeerDto saveBeer(BeerDto beerDto);

    void updateBeer(String id, BeerDto beerDto);

    void deleteBeer(String id);

    BeerDtoV2 getBeerBasedOnIdV2(String id);

    List<BeerDtoV2> getAllBeerV2();

    BeerDtoV2 saveBeerV2(BeerDtoV2 beerDtoV2);
}
