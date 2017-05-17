package org.ncibi.ws.thinkback;

import java.util.List;

import org.ncibi.ws.thinkback.ThinkBackResult;

public class ThinkBackResults {
	
	/**
	 * Information about the executed methods
	 */
	private ThinkbackEnrichmentMethod enrichMethod;
	private ThinkbackAdjustmentMethod adjustMethod;
	
	
	private String dataset;
	private String template;
	private String geneSetMatrix;
	private String chipData;
	
	private List<ThinkBackResult> tbResults;
	
	
	public ThinkBackResults() { }
	
	public ThinkBackResults(ThinkbackEnrichmentMethod em, ThinkbackAdjustmentMethod am, String d, String t, String gs, String c) {
		
		this.enrichMethod = em;
		this.adjustMethod = am;
		this.dataset = d;
		this.template = t;
		this.geneSetMatrix = gs;
		this.chipData = c;
	}

	public ThinkbackEnrichmentMethod getEnrichMethod() {
		return enrichMethod;
	}

	public void setEnrichMethod(ThinkbackEnrichmentMethod enrichMethod) {
		this.enrichMethod = enrichMethod;
	}

	public ThinkbackAdjustmentMethod getAdjustMethod() {
		return adjustMethod;
	}

	public void setAdjustMethod(ThinkbackAdjustmentMethod adjustMethod) {
		this.adjustMethod = adjustMethod;
	}

	public String getDataset() {
		return dataset;
	}

	public void setDataset(String dataset) {
		this.dataset = dataset;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public String getGeneSetMatrix() {
		return geneSetMatrix;
	}

	public void setGeneSetMatrix(String geneSetMatrix) {
		this.geneSetMatrix = geneSetMatrix;
	}

	public String getChipData() {
		return chipData;
	}

	public void setChipData(String chipData) {
		this.chipData = chipData;
	}

	public List<ThinkBackResult> getTbResults() {
		return tbResults;
	}

	public void setTbResults(List<ThinkBackResult> tbResults) {
		this.tbResults = tbResults;
	}
}
