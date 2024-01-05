package com.bbva.uuaa.helloWorld.business.v0.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Pattern;

@Getter
@Setter
@NoArgsConstructor
public class BDetails {

    private String offerType;

    private BAmountList limitAmount;
    private BAmountList minimumAmount;
    private BAmountList maximumAmount;
    private BProduct product;
}
