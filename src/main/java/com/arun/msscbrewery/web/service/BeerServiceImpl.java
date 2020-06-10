package com.arun.msscbrewery.web.service;

import com.arun.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerBasedOnId(String id) {
        //TODO
        return BeerDto.builder().beerName("Mango Bobs").id(UUID.randomUUID()).upc(10l).beerStyle("LAGER").build();
    }

    @Override
    public List<BeerDto> getAllBeer() {
        //TODO
        BeerDto beerDto = BeerDto.builder().beerName("Mango Bobs").id(UUID.randomUUID()).upc(10l).beerStyle("LAGER").build();
        return Collections.singletonList(beerDto);
    }

    @Override
    public void saveBeer(BeerDto beerDto) {
        //TODO

    }
}
