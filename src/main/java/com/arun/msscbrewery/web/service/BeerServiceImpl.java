package com.arun.msscbrewery.web.service;

import com.arun.msscbrewery.web.model.BeerDto;
import com.arun.msscbrewery.web.model.BeerDtoV2;
import org.springframework.stereotype.Service;

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
    public BeerDto saveBeer(BeerDto beerDto) {
        //TODO
        return null;
    }

    @Override
    public void updateBeer(String id, BeerDto beerDto) {
        //TODO
    }

    @Override
    public void deleteBeer(String id) {
        //TODO
    }

    @Override
    public BeerDtoV2 getBeerBasedOnIdV2(String id) {
        //TODO
        return null;
    }

    @Override
    public List<BeerDtoV2> getAllBeerV2() {
        //TODO
        return null;
    }

    @Override
    public BeerDtoV2 saveBeerV2(BeerDtoV2 beerDtoV2) {
        //TODO
        return null;
    }


}
