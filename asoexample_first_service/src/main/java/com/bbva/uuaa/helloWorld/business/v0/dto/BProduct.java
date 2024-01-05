package com.bbva.uuaa.helloWorld.business.v0.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Pattern;

@Getter
@Setter
@NoArgsConstructor
public class BProduct {
     @Pattern(regexp = "TDC", message = "La cadena debe ser 'TDC'")
     private String id;

     private BSubproduct subproduct;
}
