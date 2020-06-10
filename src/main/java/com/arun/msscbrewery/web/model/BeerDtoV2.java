package com.arun.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BeerDtoV2 {
    private UUID id;
    private String beerName;
    private BeerStyle beerStyle;
    private Long upc;
}
