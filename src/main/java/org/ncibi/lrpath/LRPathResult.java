package org.ncibi.lrpath;

import java.util.Vector;

public final class LRPathResult implements Comparable<Object>
{

	private String ConceptId;
	private String ConceptType;
	private String ConceptName;
	private int numUniqueGenes;
	private double coeff;
	private double oddsRatio;
	private double pValue;
	private double fdr;
	private double thinkPValue = -1;
	private Vector<String> sigGenes;
	
	public int compareTo(Object obj) {
         
         if (obj instanceof LRPathResult) {
             
        	 LRPathResult result = (LRPathResult) obj;
             if (this.pValue > result.getPValue())
                 return 1;
             else if (this.pValue < result.getPValue())
                 return -1;
         }
         return 0;
     }

	public LRPathResult()
	{

	}

	public String getConceptType()
	{
		return ConceptType;
	}

	public void setConceptType(String conceptType)
	{
		ConceptType = conceptType;
	}

	public String getConceptId()
	{
		return ConceptId;
	}

	public void setConceptId(String conceptId)
	{
		ConceptId = conceptId;
	}

	public String getConceptName()
	{
		return ConceptName;
	}

	public void setConceptName(String conceptName)
	{
		ConceptName = conceptName;
	}

	public int getNumUniqueGenes()
	{
		return numUniqueGenes;
	}

	public void setNumUniqueGenes(int numUniqueGenes)
	{
		this.numUniqueGenes = numUniqueGenes;
	}

	public double getCoeff()
	{
		return coeff;
	}

	public void setCoeff(double coeff)
	{
		this.coeff = coeff;
	}

	public double getOddsRatio()
	{
		return oddsRatio;
	}

	public void setOddsRatio(double oddsRatio)
	{
		this.oddsRatio = oddsRatio;
	}

	public double getPValue()
	{
		return pValue;
	}

	public void setPValue(double pValue)
	{
		this.pValue = pValue;
	}

	public double getFdr()
	{
		return fdr;
	}

	public void setFdr(double fdr)
	{
		this.fdr = fdr;
	}
	
	public double getThinkPValue()
	{
	    return this.thinkPValue;
	}
	
	public void setThinkPValue(double thinkPValue)
	{
	    this.thinkPValue = thinkPValue;
	}

	public Vector<String> getSigGenes()
	{
		return sigGenes;
	}

	public void setSigGenes(Vector<String> sigGenes)
	{
		this.sigGenes = sigGenes;
	}

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "LRPathResult [ConceptId=" + this.ConceptId + ", ConceptName=" + this.ConceptName
                    + ", ConceptType=" + this.ConceptType + ", coeff=" + this.coeff + ", fdr="
                    + this.fdr + ", numUniqueGenes=" + this.numUniqueGenes + ", oddsRatio="
                    + this.oddsRatio + ", pValue=" + this.pValue + ", sigGenes=" + this.sigGenes
                    + "]\n";
    }
}
