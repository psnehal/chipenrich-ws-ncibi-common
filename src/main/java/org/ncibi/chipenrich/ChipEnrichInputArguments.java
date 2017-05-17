package org.ncibi.chipenrich;
//import java.lang.reflect.Array;
import java.util.Arrays;

public class ChipEnrichInputArguments {
	

	private String uploadfile;
	private String uploadMappafile;
	private String outname;
    private String email;
    private String sglist;
    private String ld;
    private String[] slist = null;
    private String ismappable;
    private String rc;
    private String qc;
    private String method;
    private String outpath;
    private String filter;
    private String peakthr;
    private String uploadCustomFile;
    
    public String getUploadCustomFile() {
		return uploadCustomFile;
	}
	public void setUploadCustomFile(String uploadCustomFile) {
		this.uploadCustomFile = uploadCustomFile;
	}
	
	
	public void setUploadFile( String value )
    {
    	uploadfile = value;
    	System.out.println("upload value = [ "+value+"  ]" );
    }
    public String getUploadFile() { return uploadfile; }
    
    
    public void setUploadMappaFile(String uploadMappafile) 
    {
		this.uploadMappafile = uploadMappafile;
		System.out.println("upload mappa value = [ "+uploadMappafile+"  ]" );
	}
    public String getUploadMappaFile() {return uploadMappafile;	}
	
    
    public void setOutName( String value )
    {
    	outname = value;
    }
    public String getOutName() { return outname; }
    
    
    
    public void setOutPath( String value )
    {
    	outpath = value;
    	System.out.println("Outpath =  ["+value+ "  ]");
    }
    public String getOutPath() { return outpath; }
    
    
    
     public void setSgList( String value )
    {
    	sglist = value;
    }
     public String getSgList() { return sglist; }
     
     
     
     public void setMethod(String method)
 	{
 		//System.out.println("************************************"+method);
 		this.method = method;
 	}
     public String getMethod(){ return method; }
    
     
    public void setLd( String value )
    {
        ld = value;
        //System.out.println("************************************"+value);
    }
    public String getLd() { return ld; }
   
    

    
    public void setSgSetList( String[] slist )
    {
    	System.out.println("Inside inputArguments and slists length is :"+slist.length);
    	System.out.println(Arrays.toString(slist));
        this.slist = slist;
    }
    public String[] getSgSetList() { return slist; }
   
    
    
    public void setIsMappable( String value )
    {
    	ismappable = value;
    	
    }
    public String getIsMappable() { return ismappable; }
    
    
    public void setRc( String value )
    {
    	rc = value;
    	System.out.println("RC inside ChipEnrichInputArguments"+rc+ uploadMappafile);
    }
    public String getRc() { return rc; }
       
    

    public void setQc( String value )
    {
        qc = value;
    }
    public String getQc() { return qc; }
    
    
    public void setEmail(String email)
	{
		//System.out.println("************************************"+email);
		this.email = email;
	}
    public String getEmail(){ return email; }
        
    public String getFilter() {
		return filter;
	}
	public void setFilter(String filter) {
		this.filter = filter;
	}
	public String getPeakThr() {
		return peakthr;
	}
	public void setPeakThr(String peakthr) {
		this.peakthr = peakthr;
	}
	public String toString()
    {
        return "ChipEnrichInputArguments [ " +
        		"  uploadfile=" + uploadfile +
        		", uploadMappafile=" + uploadMappafile +
        		", outpath ="+outpath+
        		", outname=" + outname + 
        		", email=" + email +
        		", sglist="+ sglist + 
        		", slist=" + slist+
        		", method=" + method+
        		", ld=" + ld +          		     		
        		", ismappable=" + ismappable + 
        		", rc=" + rc + 
        		", qc=" + qc+
        		", filter=" + filter+
        		", peakthr=" + peakthr+
        		"]";
    }
    

}