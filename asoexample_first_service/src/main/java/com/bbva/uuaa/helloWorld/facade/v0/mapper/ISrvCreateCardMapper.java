package com.bbva.uuaa.helloWorld.facade.v0.mapper;

import com.bbva.uuaa.helloWorld.business.v0.dto.BCreateCardIn;
import com.bbva.uuaa.helloWorld.business.v0.dto.BCreateCardOut;
import com.bbva.uuaa.helloWorld.facade.v0.dto.CreateCardIn;
import com.bbva.uuaa.helloWorld.facade.v0.dto.CreateCardOut;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ISrvCreateCardMapper {

    @Mapping(target = "details.offerType", source = "createCardIn.details.offerType")
    @Mapping(target = "details.limitAmount.amount", source = "createCardIn.details.limitAmount.amount")
    @Mapping(target = "details.limitAmount.currency", source = "createCardIn.details.limitAmount.currency")
    @Mapping(target = "details.product.id", source = "createCardIn.details.product.id")
    @Mapping(target = "details.product.subproduct.id", source = "createCardIn.details.product.subproduct.id")
    BCreateCardIn mapIn(CreateCardIn createCardIn);

    @Mapping(target = "id", source = "bCreateCardOut.id")
    @Mapping(target = "nuip", source = "bCreateCardOut.nuip")
    @Mapping(target = "details.offerType", source = "bCreateCardOut.details.offerType")
    @Mapping(target = "details.limitAmount.amount", source = "bCreateCardOut.details.limitAmount.amount")
    @Mapping(target = "details.limitAmount.currency", source = "bCreateCardOut.details.limitAmount.currency")
    @Mapping(target = "details.minimumAmount.amount", source = "bCreateCardOut.details.minimumAmount.amount")
    @Mapping(target = "details.minimumAmount.currency", source = "bCreateCardOut.details.minimumAmount.currency")
    @Mapping(target = "details.maximumAmount.amount", source = "bCreateCardOut.details.maximumAmount.amount")
    @Mapping(target = "details.maximumAmount.currency", source = "bCreateCardOut.details.maximumAmount.currency")
    @Mapping(target = "details.product.id", source = "bCreateCardOut.details.product.id")
    @Mapping(target = "details.product.subproduct.id", source = "bCreateCardOut.details.product.subproduct.id")
    CreateCardOut mapOut(BCreateCardOut bCreateCardOut);
}
