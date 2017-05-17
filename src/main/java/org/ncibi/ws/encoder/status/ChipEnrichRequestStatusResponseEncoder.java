package org.ncibi.ws.encoder.status;

import java.beans.DefaultPersistenceDelegate;
import java.beans.XMLEncoder;
import java.util.List;

import org.ncibi.chipenrich.ChipEnrichResults;

import org.ncibi.ws.AbstractBeanXMLResponseEncoder;
import org.ncibi.ws.Response;
import org.ncibi.ws.request.RequestStatus;

public class ChipEnrichRequestStatusResponseEncoder extends
            AbstractBeanXMLResponseEncoder<RequestStatus<List<ChipEnrichResults>>>
{
    public ChipEnrichRequestStatusResponseEncoder(Response<RequestStatus<List<ChipEnrichResults>>> response)
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
