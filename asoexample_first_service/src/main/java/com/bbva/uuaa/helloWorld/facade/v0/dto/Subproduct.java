package com.bbva.uuaa.helloWorld.facade.v0.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class Subproduct {
    @Size(max = 2, message = "Longitud máxima 2")
    private String id;
}
