package org.ncibi.task;

public enum TaskStatus
{
    QUEUED, RUNNING, DONE, CANCELED, ERRORED;
    
    public static TaskStatus toTaskStatus(String status)
    {
        for (TaskStatus ts : TaskStatus.values())
        {
            if (ts.toString().equalsIgnoreCase(status))
            {
                return ts;
            }
        }
        
        return null;
    }
}
