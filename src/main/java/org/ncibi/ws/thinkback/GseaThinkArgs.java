package org.ncibi.ws.thinkback;

import java.util.List;


public class GseaThinkArgs
{
    private int id;
	private String uuid;
    private ThinkbackAdjustmentMethod adjustmentMethod;
    private ThinkbackEnrichmentMethod enrichmentMethod = ThinkbackEnrichmentMethod.GSEA;
    private String dataset;   
    private String classfile;
    private String template;
    private String chipfile;
    private List<String> pathways;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

	public ThinkbackAdjustmentMethod getAdjustmentMethod() {
		return adjustmentMethod;
	}

	public void setAdjustmentMethod(ThinkbackAdjustmentMethod adjustTool) {
		this.adjustmentMethod = adjustTool;
	}

    public ThinkbackEnrichmentMethod getEnrichmentMethod()
    {
        return enrichmentMethod;
    }

    public void setEnrichmentMethod(ThinkbackEnrichmentMethod enrichmentMethod)
    {
        this.enrichmentMethod = enrichmentMethod;
    }

    public String getUuid()
    {
        return uuid;
    }

    public void setUuid(String uuid)
    {
        this.uuid = uuid;
    }

    public String getTemplate()
    {
        return template;
    }

    public void setTemplate(String template)
    {
        this.template = template;
    }

    public String getDataset()
    {
        return dataset;
    }

    public void setDataset(String dataset)
    {
        this.dataset = dataset;
    }

    public String getClassfile()
    {
        return classfile;
    }

    public void setClassfile(String classfile)
    {
        this.classfile = classfile;
    }

    public String getChipfile() {
		return chipfile;
	}

	public void setChipfile(String chipfile) {
		this.chipfile = chipfile;
	}

	public List<String> getPathways() {
		return pathways;
	}

	public void setPathways(List<String> pathways) {
		this.pathways = pathways;
	}
}
