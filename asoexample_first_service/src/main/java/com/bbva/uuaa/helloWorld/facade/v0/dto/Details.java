package com.bbva.uuaa.helloWorld.facade.v0.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

@Getter
@Setter
@NoArgsConstructor

public class Details {
    @Pattern(regexp = "^[A-Z\\s_-]+$", message = "Debe estar en mayúsculas")
    private String offerType;
    @Valid
    private AmountList limitAmount;
    private AmountList minimumAmount;
    private AmountList maximumAmount;
    @Valid
    private Product product;
}
