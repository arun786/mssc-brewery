package com.arun.msscbrewery.web.service;

import com.arun.msscbrewery.web.model.BeerDto;

public interface BeerService {

    BeerDto getBeerBasedOnId(String id);
}
