package com.bbva.uuaa.helloWorld.facade.v0.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;

@Getter
@Setter
@NoArgsConstructor
public class CreateCardIn {
     @Valid
     Details details;
}
