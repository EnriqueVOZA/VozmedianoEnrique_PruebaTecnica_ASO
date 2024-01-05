package com.bbva.uuaa.helloWorld.facade.v0.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

@Getter
@Setter
@NoArgsConstructor
public class Product {
    @Pattern(regexp = "TDC", message = "La cadena debe ser 'TDC'")
    private String id;
    @Valid
    private Subproduct subproduct;
}
