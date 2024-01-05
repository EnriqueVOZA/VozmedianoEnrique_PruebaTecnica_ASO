package com.bbva.uuaa.helloWorld.business.v0;

import com.bbva.uuaa.helloWorld.business.v0.dto.BCreateCardIn;
import com.bbva.uuaa.helloWorld.business.v0.dto.BCreateCardOut;

public interface IBSrvCreateCard {

    BCreateCardOut business(BCreateCardIn bCreateCardIn, String nuip);
}
