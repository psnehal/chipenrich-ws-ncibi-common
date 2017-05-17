package org.ncibi.ws.thinkback;

import java.util.List;

import org.ncibi.lrpath.LRPathArguments;

public class LRThinkArgs
{
    private LRPathArguments lrpathArgs;
    private List<String> pathways;
	private ThinkbackAdjustmentMethod adjustmentMethod;

    public LRPathArguments getLrpathArgs()
    {
        return lrpathArgs;
    }

    public void setLrpathArgs(LRPathArguments lrpathArgs)
    {
        this.lrpathArgs = lrpathArgs;
    }

    public ThinkbackAdjustmentMethod getAdjustmentMethod()
    {
        return adjustmentMethod;
    }

    public void setAdjustmentMethod(ThinkbackAdjustmentMethod adjustmentMethod)
    {
        this.adjustmentMethod = adjustmentMethod;
    }
    
    public List<String> getPathways() {
		return pathways;
	}

	public void setPathways(List<String> pathways) {
		this.pathways = pathways;
	}
}
