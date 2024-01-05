package com.bbva.uuaa.helloWorld.business.v0.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class BAmountList {

     @NotNull
     private Double amount;
     @NotNull
     @NotBlank
     private String currency;
}
