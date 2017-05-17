package org.ncibi.ws.lrpath;

import org.ncibi.lrpath.LRPathResult;
import org.ncibi.task.TaskStatus;

public class LRPathResponse
{
    private final TaskStatus taskStatus;
    private final LRPathResult[] results;
    
    public LRPathResponse(TaskStatus taskStatus, LRPathResult[] results)
    {
        this.taskStatus = taskStatus;
        this.results = results;
    }

    public TaskStatus getTaskStatus()
    {
        return taskStatus;
    }

    public LRPathResult[] getResults()
    {
        return results;
    }
}
