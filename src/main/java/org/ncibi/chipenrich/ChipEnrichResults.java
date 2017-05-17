package org.ncibi.chipenrich;
//Geneset.Type	Geneset.ID	Description	P.value	FDR	Effect	Odds.Ratio	Status	N.Geneset.Genes	
//N.Geneset.Peak.Genes	Geneset.Peak.Genes
public class ChipEnrichResults {
	
		private String gid;        
	    @Override
		public String toString() {
			return "ChipEnrichResults [getGtype()=" + getGtype()
					+ ", getGid()=" + getGid() + ", getDesc()=" + getDesc()
					+ ", getPvalue()=" + getPvalue() + ", getFdr()=" + getFdr()
					+ ", getOratio()=" + getOratio() + ", getStatus()="
					+ getStatus() + ", getNgg()=" + getNgg() + ", getNgpg()="
					+ getNgpg() + ", getGpg()=" + getGpg() + ", getNo()="
					+ getNo() + "]";
		}

		private String desc;
	    private String pvalue;
	    private String fdr;
	    private String effect;
	    private String oratio;
	    private String status;
	    private String ngg;
	    private String ngpg;
	    private String gpg;
	    private String no;
    

  
    
          
    public ChipEnrichResults(String gid, String gtype, String desc,String pvalue,String fdr,String effect,String oratio,String status,String ngg,String ngpg, String gpg)
    {
    		this.gtype = gtype;
    		this.gid = gid;
            this.desc = desc;
            this.pvalue = pvalue;
            this.fdr= fdr;
            this.effect= effect;
            this.oratio=oratio;
            this.status = status;
            this.ngg=ngg;
            this.ngpg=ngpg;
            
            this.gpg=gpg;
    }

		public ChipEnrichResults() {
		// TODO Auto-generated constructor stub
	}

		private String gtype;
        public String getGtype() {
			return gtype;
		}





		public void setGtype(String gtype) {
			this.gtype = gtype;
		}





		public String getGid() {
			return gid;
		}





		public void setGid(String gid) {
			this.gid = gid;
		}





		public String getDesc() {
			return desc;
		}





		public void setDesc(String desc) {
			this.desc = desc;
		}





		public String getPvalue() {
			return pvalue;
		}





		public void setPvalue(String pvalue) {
			this.pvalue = pvalue;
		}





		public String getFdr() {
			return fdr;
		}





		public void setFdr(String fdr) {
			this.fdr = fdr;
		}





		public String getEffect() {
			return effect;
		}

		public void setEffect(String effect) {
			this.effect = effect;
		}

		public String getOratio() {
			return oratio;
		}





		public void setOratio(String oratio) {
			this.oratio = oratio;
		}





		public String getStatus() {
			return status;
		}





		public void setStatus(String status) {
			this.status = status;
		}





		public String getNgg() {
			return ngg;
		}





		public void setNgg(String ngg) {
			this.ngg = ngg;
		}





		public String getNgpg() {
			return ngpg;
		}





		public void setNgpg(String ngpg) {
			this.ngpg = ngpg;
		}





		public String getGpg() {
			return gpg;
		}





		public void setGpg(String gpg) {
			this.gpg = gpg;
		}





		public String getNo() {
			return no;
		}





		public void setNo(String no) {
			this.no = no;
		}





		        
        


}
