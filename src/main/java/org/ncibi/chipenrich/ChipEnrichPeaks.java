package org.ncibi.chipenrich;
//chrom	peak_start	peak_end	peak_midpoint geneid	gene_symbol	gene_locus_start	
//gene_locus_end	nearest_tss	  dist_to_tss	nearest_tss_gene	nearest_tss_gene_strand

public class ChipEnrichPeaks {
			private String chrom;
		    private String peakS;
		    private String peakE;
		    private String pmid;
		    private String geneid;
		    private String geneSym;	
		    private String lstart;
		    private String lend;
	        private String ntss;
	        private String dtss;
	        private String ntssgene;
	        private String tssgs;
	        
	        

	        public ChipEnrichPeaks(String chrom, String peakS,String peakE,String pmid,String geneid,String geneSym,String lstart,
	        		String lend,String ntss,String dtss,String ntssgene,String tssgs)
	        {
	        	this.chrom =chrom;
			    this.peakS = peakS;
			    this.peakE= peakE;
			    this.geneid = geneid;
			    this.pmid=pmid;
			    this.geneSym = geneSym;	
			    this.lstart = lstart;
			    this.lend= lend;
		        this.ntss = ntss;
		        this.dtss=dtss;
		        this.ntssgene= ntssgene;
		        this.tssgs=tssgs;
		        
	                 }



			public String getChrom() {
				return chrom;
			}



			public void setChrom(String chrom) {
				this.chrom = chrom;
			}



			public String getPeakS() {
				return peakS;
			}



			public void setPeakS(String peakS) {
				this.peakS = peakS;
			}



			public String getPeakE() {
				return peakE;
			}



			public void setPeakE(String peakE) {
				this.peakE = peakE;
			}



			public String getPmid() {
				return pmid;
			}



			public void setPmid(String pmid) {
				this.pmid = pmid;
			}



			public String getGeneSym() {
				return geneSym;
			}



			public void setGeneSym(String geneSym) {
				this.geneSym = geneSym;
			}



			public String getLstart() {
				return lstart;
			}



			public void setLstart(String lstart) {
				this.lstart = lstart;
			}



			public String getLend() {
				return lend;
			}



			public void setLend(String lend) {
				this.lend = lend;
			}



			public String getNtss() {
				return ntss;
			}



			public void setNtss(String ntss) {
				this.ntss = ntss;
			}



			public String getDtss() {
				return dtss;
			}



			public void setDtss(String dtss) {
				this.dtss = dtss;
			}



			public String getTssgs() {
				return tssgs;
			}



			public void setTssgs(String tssgs) {
				this.tssgs = tssgs;
			}



			public String getGeneid() {
				return geneid;
			}



			public void setGeneid(String geneid) {
				this.geneid = geneid;
			}



			public String getNtssgene() {
				return ntssgene;
			}



			public void setNtssgene(String ntssgene) {
				this.ntssgene = ntssgene;
			}



			@Override
			public String toString() {
				return "ChipEnrichPeaks [chrom=" + chrom + ", peakS=" + peakS
						+ ", peakE=" + peakE + ", pmid=" + pmid + ", geneSym="
						+ geneSym + ", lstart=" + lstart + ", lend=" + lend
						+ ", ntss=" + ntss + ", dtss=" + dtss + ", tssgs="
						+ tssgs + ", getChrom()=" + getChrom()
						+ ", getPeakS()=" + getPeakS() + ", getPeakE()="
						+ getPeakE() + ", getPmid()=" + getPmid()
						+ ", getGeneSym()=" + getGeneSym() + ", getLstart()="
						+ getLstart() + ", getLend()=" + getLend()
						+ ", getNtss()=" + getNtss() + ", getDtss()="
						+ getDtss() + ", getTssgs()=" + getTssgs() + "]";
			}
	        
	              
	       
	        
	       
	       





	}
