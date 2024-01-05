package com.bbva.uuaa.helloWorld.facade.v0;

import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseCreated;
import com.bbva.uuaa.helloWorld.facade.v0.dto.CreateCardIn;
import com.bbva.uuaa.helloWorld.facade.v0.dto.CreateCardOut;
import com.bbva.uuaa.helloWorld.facade.v0.dto.Hello;

import javax.ws.rs.PathParam;

public interface ISrvHelloWorld {
	
	ServiceResponse<Hello> helloWorld ();

	ServiceResponseCreated<CreateCardOut> createCard(CreateCardIn createCardIn, @PathParam("nuip") String nuip);

}
