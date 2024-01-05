package com.bbva.uuaa.helloWorld.facade.v0.mapper;

import com.bbva.uuaa.helloWorld.business.v0.dto.BAmountList;
import com.bbva.uuaa.helloWorld.business.v0.dto.BCreateCardIn;
import com.bbva.uuaa.helloWorld.business.v0.dto.BCreateCardOut;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDetails;
import com.bbva.uuaa.helloWorld.business.v0.dto.BProduct;
import com.bbva.uuaa.helloWorld.business.v0.dto.BSubproduct;
import com.bbva.uuaa.helloWorld.facade.v0.dto.AmountList;
import com.bbva.uuaa.helloWorld.facade.v0.dto.CreateCardIn;
import com.bbva.uuaa.helloWorld.facade.v0.dto.CreateCardOut;
import com.bbva.uuaa.helloWorld.facade.v0.dto.Details;
import com.bbva.uuaa.helloWorld.facade.v0.dto.Product;
import com.bbva.uuaa.helloWorld.facade.v0.dto.Subproduct;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-05T23:21:23+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_402 (IBM Corporation)"
)
@Component
public class ISrvCreateCardMapperImpl implements ISrvCreateCardMapper {

    @Override
    public BCreateCardIn mapIn(CreateCardIn createCardIn) {
        if ( createCardIn == null ) {
            return null;
        }

        BCreateCardIn bCreateCardIn = new BCreateCardIn();

        bCreateCardIn.setDetails( detailsToBDetails( createCardIn.getDetails() ) );

        return bCreateCardIn;
    }

    @Override
    public CreateCardOut mapOut(BCreateCardOut bCreateCardOut) {
        if ( bCreateCardOut == null ) {
            return null;
        }

        CreateCardOut createCardOut = new CreateCardOut();

        createCardOut.setDetails( bDetailsToDetails( bCreateCardOut.getDetails() ) );
        createCardOut.setId( bCreateCardOut.getId() );
        createCardOut.setNuip( bCreateCardOut.getNuip() );

        return createCardOut;
    }

    protected BAmountList amountListToBAmountList(AmountList amountList) {
        if ( amountList == null ) {
            return null;
        }

        BAmountList bAmountList = new BAmountList();

        bAmountList.setAmount( amountList.getAmount() );
        bAmountList.setCurrency( amountList.getCurrency() );

        return bAmountList;
    }

    protected BSubproduct subproductToBSubproduct(Subproduct subproduct) {
        if ( subproduct == null ) {
            return null;
        }

        BSubproduct bSubproduct = new BSubproduct();

        bSubproduct.setId( subproduct.getId() );

        return bSubproduct;
    }

    protected BProduct productToBProduct(Product product) {
        if ( product == null ) {
            return null;
        }

        BProduct bProduct = new BProduct();

        bProduct.setSubproduct( subproductToBSubproduct( product.getSubproduct() ) );
        bProduct.setId( product.getId() );

        return bProduct;
    }

    protected BAmountList amountListToBAmountList1(AmountList amountList) {
        if ( amountList == null ) {
            return null;
        }

        BAmountList bAmountList = new BAmountList();

        bAmountList.setAmount( amountList.getAmount() );
        bAmountList.setCurrency( amountList.getCurrency() );

        return bAmountList;
    }

    protected BDetails detailsToBDetails(Details details) {
        if ( details == null ) {
            return null;
        }

        BDetails bDetails = new BDetails();

        bDetails.setLimitAmount( amountListToBAmountList( details.getLimitAmount() ) );
        bDetails.setProduct( productToBProduct( details.getProduct() ) );
        bDetails.setOfferType( details.getOfferType() );
        bDetails.setMinimumAmount( amountListToBAmountList1( details.getMinimumAmount() ) );
        bDetails.setMaximumAmount( amountListToBAmountList1( details.getMaximumAmount() ) );

        return bDetails;
    }

    protected AmountList bAmountListToAmountList(BAmountList bAmountList) {
        if ( bAmountList == null ) {
            return null;
        }

        AmountList amountList = new AmountList();

        amountList.setAmount( bAmountList.getAmount() );
        amountList.setCurrency( bAmountList.getCurrency() );

        return amountList;
    }

    protected AmountList bAmountListToAmountList1(BAmountList bAmountList) {
        if ( bAmountList == null ) {
            return null;
        }

        AmountList amountList = new AmountList();

        amountList.setAmount( bAmountList.getAmount() );
        amountList.setCurrency( bAmountList.getCurrency() );

        return amountList;
    }

    protected AmountList bAmountListToAmountList2(BAmountList bAmountList) {
        if ( bAmountList == null ) {
            return null;
        }

        AmountList amountList = new AmountList();

        amountList.setAmount( bAmountList.getAmount() );
        amountList.setCurrency( bAmountList.getCurrency() );

        return amountList;
    }

    protected Subproduct bSubproductToSubproduct(BSubproduct bSubproduct) {
        if ( bSubproduct == null ) {
            return null;
        }

        Subproduct subproduct = new Subproduct();

        subproduct.setId( bSubproduct.getId() );

        return subproduct;
    }

    protected Product bProductToProduct(BProduct bProduct) {
        if ( bProduct == null ) {
            return null;
        }

        Product product = new Product();

        product.setSubproduct( bSubproductToSubproduct( bProduct.getSubproduct() ) );
        product.setId( bProduct.getId() );

        return product;
    }

    protected Details bDetailsToDetails(BDetails bDetails) {
        if ( bDetails == null ) {
            return null;
        }

        Details details = new Details();

        details.setLimitAmount( bAmountListToAmountList( bDetails.getLimitAmount() ) );
        details.setMinimumAmount( bAmountListToAmountList1( bDetails.getMinimumAmount() ) );
        details.setMaximumAmount( bAmountListToAmountList2( bDetails.getMaximumAmount() ) );
        details.setProduct( bProductToProduct( bDetails.getProduct() ) );
        details.setOfferType( bDetails.getOfferType() );

        return details;
    }
}
