package com.bbva.uuaa.helloWorld.business.v0.impl;

import com.bbva.uuaa.helloWorld.business.v0.IBSrvCreateCard;
import com.bbva.uuaa.helloWorld.business.v0.dao.ISrvCreateCardDAO;
import com.bbva.uuaa.helloWorld.business.v0.dto.BCreateCardIn;
import com.bbva.uuaa.helloWorld.business.v0.dto.BCreateCardOut;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class BSrvCreateCard implements IBSrvCreateCard {

    @Resource(name = "srvCreateCardDAO")
    ISrvCreateCardDAO iSrvCreateCardDAO;
    @Override
    public BCreateCardOut business(BCreateCardIn bCreateCardIn, String nuip) {
        BCreateCardOut bCreateCardOut = new BCreateCardOut();
        bCreateCardOut = iSrvCreateCardDAO.createCardDAO(bCreateCardIn, nuip);
        return bCreateCardOut;
    }
}