package com.bbva.uuaa.helloWorld.business.v0.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class BSubproduct {
    @Size(max = 2, message = "La longitud máxima permitida es 2")
    private String id;
}
