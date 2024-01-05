package com.bbva.uuaa.helloWorld.business.v0.dao.impl;

import com.bbva.uuaa.helloWorld.business.v0.dao.ISrvCreateCardDAO;
import com.bbva.uuaa.helloWorld.business.v0.dto.*;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component(value = "srvCreateCardDAO")
public class SrvCreateCardDAO implements ISrvCreateCardDAO {
    @Override
    public BCreateCardOut createCardDAO(BCreateCardIn bCreateCardIn, String nuip) {
        //Set de bCreateCardOut
        BCreateCardOut bCreateCardOut = new BCreateCardOut();
        bCreateCardOut.setId(String.valueOf(generarNumeroAleatorioDe10Cifras()));
        bCreateCardOut.setNuip(nuip);
        //Set de details
        BDetails details = new BDetails();
        details.setOfferType(bCreateCardIn.getDetails().getOfferType());
        details.setLimitAmount(bCreateCardIn.getDetails().getLimitAmount());
        details.setProduct(bCreateCardIn.getDetails().getProduct());
        //AmountList minimo
        BAmountList minimo = new BAmountList();
        minimo.setAmount(bCreateCardIn.getDetails().getLimitAmount().getAmount()*(1-0.1));
        minimo.setCurrency(bCreateCardIn.getDetails().getLimitAmount().getCurrency());
        details.setMinimumAmount(minimo);
        //AmountList maximo
        BAmountList maximo = new BAmountList();
        maximo.setAmount(bCreateCardIn.getDetails().getLimitAmount().getAmount()*(1+0.05));
        maximo.setCurrency(bCreateCardIn.getDetails().getLimitAmount().getCurrency());
        details.setMaximumAmount(maximo);

        bCreateCardOut.setDetails(details);

        return bCreateCardOut;
    }


    public static long generarNumeroAleatorioDe10Cifras() {
        Random random = new Random();
        long numeroMinimo = 1000000000L;
        long numeroMaximo = 9999999999L;
        return numeroMinimo + (long) (random.nextDouble() * (numeroMaximo - numeroMinimo + 1));
    }
}
