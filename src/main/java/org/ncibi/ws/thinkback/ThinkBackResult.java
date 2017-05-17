package org.ncibi.ws.thinkback;

public class ThinkBackResult {

	private String pathwayId;
	private String conceptGenId;
	private ThinkbackEnrichmentMethod baseTechnique;
	private ThinkbackAdjustmentMethod adjustedTechnique;
	private double baseScore;
	private double tbScore;
	private double adjustedScore;
	
	
	public ThinkBackResult() { }
	
	public ThinkBackResult(String pwayId, ThinkbackEnrichmentMethod _basetechnique, ThinkbackAdjustmentMethod _adjustedtechnique) {
		
		this.pathwayId = pwayId;
		this.baseTechnique = _basetechnique;
		this.adjustedTechnique = _adjustedtechnique;
	}
	
	public ThinkBackResult(String pwayId, String cgId, ThinkbackEnrichmentMethod _basetechnique, ThinkbackAdjustmentMethod _adjustedtechnique) {
		
		this.pathwayId = pwayId;
		this.conceptGenId = cgId;
		this.baseTechnique = _basetechnique;
		this.adjustedTechnique = _adjustedtechnique;
	}

	public String getPathwayId() {
		return pathwayId;
	}

	public void setPathwayId(String pathwayId) {
		this.pathwayId = pathwayId;
	}

	public String getConceptGenId() {
		return conceptGenId;
	}

	public void setConceptGenId(String conceptGenId) {
		this.conceptGenId = conceptGenId;
	}

	public ThinkbackEnrichmentMethod getBaseTechnique() {
		return baseTechnique;
	}

	public void setBaseTechnique(ThinkbackEnrichmentMethod tbTechnique) {
		this.baseTechnique = tbTechnique;
	}

	public ThinkbackAdjustmentMethod getAdjustedTechnique() {
		return adjustedTechnique;
	}

	public void setAdjustedTechnique(ThinkbackAdjustmentMethod tbTechnique) {
		this.adjustedTechnique = tbTechnique;
	}

	public double getBaseScore() {
		return baseScore;
	}

	public void setBaseScore(double baseScore) {
		this.baseScore = baseScore;
	}

	public double getTbScore() {
		return tbScore;
	}

	public void setTbScore(double tbScore) {
		this.tbScore = tbScore;
	}

	public double getAdjustedScore() {
		return adjustedScore;
	}

	public void setAdjustedScore(double adjustedScore) {
		this.adjustedScore = adjustedScore;
	}
}
