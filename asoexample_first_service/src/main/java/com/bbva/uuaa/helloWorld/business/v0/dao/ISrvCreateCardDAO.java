package com.bbva.uuaa.helloWorld.business.v0.dao;

import com.bbva.uuaa.helloWorld.business.v0.dto.BCreateCardIn;
import com.bbva.uuaa.helloWorld.business.v0.dto.BCreateCardOut;

public interface ISrvCreateCardDAO {

    BCreateCardOut createCardDAO(BCreateCardIn bCreateCardIn, String nuip);
}
