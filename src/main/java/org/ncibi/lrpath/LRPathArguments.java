package org.ncibi.lrpath;

import java.util.Arrays;

public class LRPathArguments
{
	private String database = "KEGG Pathway";
	private int ming = 10;
	private int maxg = 99999;
	private double oddsmax = 0.5;
	private double oddsmin = 0.001;
	private double sigcutoff = 0.05;
	private String species = "hsa";
	private String[] identifiers = null;
	private int[] geneids = new int[0];
	private double[] sigvals = new double[0];
	private double[] direction = new double[0];
	private String application;
	private String email;
	private String conceptName;

	public String[] getIdentifiers()
	{
		return identifiers;
	}

	public void setIdentifiers(String[] identifiers)
	{
		this.identifiers = identifiers;
	}

	public int getMing()
	{
		return ming;
	}

	public void setMing(int ming)
	{
		this.ming = ming;
	}

	public int getMaxg()
	{
		return maxg;
	}

	public void setMaxg(int maxg)
	{
		this.maxg = maxg;
	}

	public double getOddsmax()
	{
		return oddsmax;
	}

	public void setOddsmax(double oddsmax)
	{
		this.oddsmax = oddsmax;
	}

	public double getOddsmin()
	{
		return oddsmin;
	}

	public void setOddsmin(double oddsmin)
	{
		this.oddsmin = oddsmin;
	}

	public double getSigcutoff()
	{
		return sigcutoff;
	}

	public void setSigcutoff(double sigcutoff)
	{
		this.sigcutoff = sigcutoff;
	}

	public String getSpecies()
	{
		return species;
	}

	public void setSpecies(String species)
	{
		this.species = species;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getConceptName()
	{
		return conceptName;
	}

	public void setConceptName(String conceptName)
	{
		this.conceptName = conceptName;
	}

	public int[] getGeneids()
	{
		return this.geneids;
	}

	public void setGeneids(int[] geneids)
	{
		this.geneids = geneids;
	}

	public double[] getSigvals()
	{
		return this.sigvals;
	}

	public void setSigvals(double[] sigvals)
	{
		this.sigvals = sigvals;
	}

	public double[] getDirection()
	{
		return this.direction;
	}

	public void setDirection(double[] direction)
	{
		this.direction = direction;
	}

	public String getApplication()
	{
		return this.application;
	}

	public void setApplication(String application)
	{
		this.application = application;
	}

	public String getDatabase()
	{
		return this.database;
	}

	public void setDatabase(String database)
	{
		this.database = database;
	}

	@Override
    public String toString()
    {
        return "LRPathArguments [database=" + database + ", ming=" + ming + ", maxg=" + maxg + ", oddsmax="
                + oddsmax + ", oddsmin=" + oddsmin + ", sigcutoff=" + sigcutoff + ", species=" + species
                + ", identifiers=" + Arrays.toString(identifiers) + "\n, geneids=" + Arrays.toString(geneids)
                + "\n, sigvals=" + Arrays.toString(sigvals) + "\n, direction=" + Arrays.toString(direction)
                + "\n, application=" + application + ", email=" + email + ", conceptName=" + conceptName + "]";
    }

}
