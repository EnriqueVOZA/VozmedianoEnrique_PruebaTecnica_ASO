package com.bbva.uuaa.helloWorld.facade.v0.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class AmountList {

     @NotNull
     private Double amount;


     @NotBlank
     private String currency;
}
