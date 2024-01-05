package com.bbva.uuaa.helloWorld.facade.v0.impl;

import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseCreated;
import com.bbva.jee.arq.spring.core.servicing.annotations.SMC;
import com.bbva.jee.arq.spring.core.servicing.annotations.SN;
import com.bbva.jee.arq.spring.core.servicing.annotations.VN;
import com.bbva.uuaa.helloWorld.business.v0.IBSrvCreateCard;
import com.bbva.uuaa.helloWorld.business.v0.dto.BCreateCardIn;
import com.bbva.uuaa.helloWorld.business.v0.dto.BCreateCardOut;
import com.bbva.uuaa.helloWorld.facade.v0.ISrvHelloWorld;
import com.bbva.uuaa.helloWorld.facade.v0.dto.CreateCardIn;
import com.bbva.uuaa.helloWorld.facade.v0.dto.CreateCardOut;
import com.bbva.uuaa.helloWorld.facade.v0.dto.Hello;
import com.bbva.uuaa.helloWorld.facade.v0.mapper.ISrvCreateCardMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Service
@SN (registryID = "SN000000001", logicalID = "helloWorld")
@VN (vnn = "v0")
@Path ("/v0")
public class SrvHelloWorld implements ISrvHelloWorld {

	@Autowired
	private IBSrvCreateCard ibSrvCreateCard;

	@Override
	@GET
	@Path ("/hello")
	@Produces ({MediaType.APPLICATION_JSON})
	@SMC (registryID = "SMC000000001", logicalID = "hello")
	public ServiceResponse<Hello> helloWorld ()  {
		Hello hello = new Hello("Hello World!");
		return ServiceResponse.data(hello).build();
	}



	/*@Resource(name = "bSrvCreateCard") // Este ha sido el problema que mayor tiempo me ha llevado resolver, pasarlo de la 45 a la 30 y por probar usar @Autowired
	IBSrvCreateCard ibSrvCreateCard;*/
	@Override
	@POST
	@Path ("/simulations/{nuip}")
	@Produces ({MediaType.APPLICATION_JSON})
	@Consumes ({MediaType.APPLICATION_JSON})
	@SMC(registryID = "SMC000000002", logicalID = "simulations")
	public ServiceResponseCreated<CreateCardOut> createCard(@Valid CreateCardIn createCardIn, @PathParam("nuip") String nuip){
		ISrvCreateCardMapper iSrvCreateCardMapper = Mappers.getMapper(ISrvCreateCardMapper.class);
		BCreateCardIn bCreateCardIn = iSrvCreateCardMapper.mapIn(createCardIn);
		BCreateCardOut bCreateCardOut = ibSrvCreateCard.business(bCreateCardIn, nuip);
		CreateCardOut createCardOut = iSrvCreateCardMapper.mapOut(bCreateCardOut);
		return ServiceResponseCreated.data(createCardOut).build();
	}

}
