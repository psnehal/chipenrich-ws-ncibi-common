package org.ncibi.ws.thinkback;

public class GseaResult {

	private String ConceptId;
	private String ConceptType;
	private String ConceptName;
	private int numUniqueGenes;
	private double coeff;
	private double oddsRatio;
	private double pValue;
	private double fdr;

	public GseaResult() { }
	
    public String toString() {
    	
        return "LRPathResult [ConceptId=" + this.ConceptId + ", ConceptName=" + this.ConceptName
                    + ", ConceptType=" + this.ConceptType + ", coeff=" + this.coeff + ", fdr="
                    + this.fdr + ", numUniqueGenes=" + this.numUniqueGenes + ", oddsRatio="
                    + this.oddsRatio + ", pValue=" + this.pValue
                    + "]\n";
    }

	public String getConceptId() {
		return ConceptId;
	}

	public void setConceptId(String conceptId) {
		ConceptId = conceptId;
	}

	public String getConceptType() {
		return ConceptType;
	}

	public void setConceptType(String conceptType) {
		ConceptType = conceptType;
	}

	public String getConceptName() {
		return ConceptName;
	}

	public void setConceptName(String conceptName) {
		ConceptName = conceptName;
	}

	public int getNumUniqueGenes() {
		return numUniqueGenes;
	}

	public void setNumUniqueGenes(int numUniqueGenes) {
		this.numUniqueGenes = numUniqueGenes;
	}

	public double getCoeff() {
		return coeff;
	}

	public void setCoeff(double coeff) {
		this.coeff = coeff;
	}

	public double getOddsRatio() {
		return oddsRatio;
	}

	public void setOddsRatio(double oddsRatio) {
		this.oddsRatio = oddsRatio;
	}

	public double getpValue() {
		return pValue;
	}

	public void setpValue(double pValue) {
		this.pValue = pValue;
	}

	public double getFdr() {
		return fdr;
	}

	public void setFdr(double fdr) {
		this.fdr = fdr;
	}
}
