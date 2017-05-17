package org.ncibi.ws.encoder.status;

import java.beans.DefaultPersistenceDelegate;
import java.beans.XMLEncoder;

import org.ncibi.ws.AbstractBeanXMLResponseEncoder;
import org.ncibi.ws.Response;
import org.ncibi.ws.request.RequestStatus;
import org.ncibi.ws.thinkback.ThinkBackResults;

public class ThinkBackRequestStatusResponseEncoder extends 
		AbstractBeanXMLResponseEncoder<RequestStatus<ThinkBackResults>> {

	
	public ThinkBackRequestStatusResponseEncoder(Response<RequestStatus<ThinkBackResults>> response) {
		
		super(response);
	}
	
	@Override
	protected void setupPersistenceDelegatesForResponseValue(XMLEncoder encoder) {

		String[] persistenceFields = new String[] { "task", "data" };
		encoder.setPersistenceDelegate(RequestStatus.class, new DefaultPersistenceDelegate(persistenceFields));
	}

}
