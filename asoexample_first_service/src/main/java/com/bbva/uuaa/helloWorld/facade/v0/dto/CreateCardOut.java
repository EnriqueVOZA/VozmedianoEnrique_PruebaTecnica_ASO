package com.bbva.uuaa.helloWorld.facade.v0.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateCardOut {
    private String id;
    private String nuip;
    private Details details;
}
