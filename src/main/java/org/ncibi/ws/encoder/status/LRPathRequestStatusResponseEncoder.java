package org.ncibi.ws.encoder.status;

import java.beans.DefaultPersistenceDelegate;
import java.beans.XMLEncoder;
import java.util.List;

import org.ncibi.lrpath.LRPathResult;
import org.ncibi.ws.AbstractBeanXMLResponseEncoder;
import org.ncibi.ws.Response;
import org.ncibi.ws.request.RequestStatus;

public class LRPathRequestStatusResponseEncoder extends
            AbstractBeanXMLResponseEncoder<RequestStatus<List<LRPathResult>>>
{
    public LRPathRequestStatusResponseEncoder(Response<RequestStatus<List<LRPathResult>>> response)
    {
        super(response);
    }

    @Override
    protected void setupPersistenceDelegatesForResponseValue(XMLEncoder encoder)
    {
        String[] persistenceFields = new String[] { "task", "data" };
        encoder.setPersistenceDelegate(RequestStatus.class, new DefaultPersistenceDelegate(
                    persistenceFields));
    }
}
