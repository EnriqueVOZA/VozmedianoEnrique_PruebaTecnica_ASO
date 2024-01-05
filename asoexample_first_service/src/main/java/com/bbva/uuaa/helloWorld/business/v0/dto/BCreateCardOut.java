package com.bbva.uuaa.helloWorld.business.v0.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BCreateCardOut {

    private String id;
    private String nuip;
    private BDetails details;

}
