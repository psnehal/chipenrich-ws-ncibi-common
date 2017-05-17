package org.ncibi.task;

public class CTask
{
    private String uuid;    
    private TaskStatus status;

    public CTask(String uuid, TaskStatus status)
    {
        this.uuid = uuid;
        this.status = status;
    }
    
    public CTask() {}

    public void setUuid(String uuid)
    {
        this.uuid = uuid;
    }
    
    public String getUuid()
    {
        return uuid;
    }

    public void setStatus(TaskStatus status)
    {
        this.status = status;
    }
    
    public TaskStatus getStatus()
    {
        return status;
    }
}
