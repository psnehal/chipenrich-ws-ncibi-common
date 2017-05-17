package org.ncibi.ws.request;

import org.ncibi.task.CTask;

public class RequestStatus<T>
{
    private final CTask task;
    private final T data;
    
    public RequestStatus(CTask task, T data)
    {
        this.task = task;
        this.data = data;
    }
    
    public CTask getTask()
    {
        return this.task;
    }
    
    public T getData()
    {
        return this.data;
    }

    @Override
    public String toString()
    {
        return "RequestStatus [task=" + task + ",\n    data=" + data + "]";
    }
    
}
