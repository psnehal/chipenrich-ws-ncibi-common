package org.ncibi.chipenrich;

//Test for Mapp file will incluse
//Ask can geneid be zero
/*For geneid they should numeric -->Done
 * and should not duplicate 
 * for mappability warning if file contains all zeros and 
 * should be in between 0 and 1--?Done
 * 
 */

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import javax.swing.text.html.HTMLDocument.Iterator;
public class MappaFileParser {
	
	private RangeCheck rc = new RangeCheck();
	public static void main(String[] args) throws IOException
	{
		MappaFileParser fc = new MappaFileParser();
		File file1= new File("mappa2.tab");
		//System.out.println(fc.fParser(file1));
		
		ArrayList<String> res = new ArrayList<String>();
		res= fc.fmParser(file1);
		for (int i = 0; i < res.size(); i++)
		{
			System.out.println(res.get(i));
		}
		
		
	}

public ArrayList<String> fmParser(File fileName)
{
					
			 String status ;
			//System.out.println("Output is"+sglist);
			//StringBuilder errorMsg = new StringBuilder();
			ArrayList<String> warning = new ArrayList<String>();
			ArrayList geneids = new ArrayList();
			ArrayList mappaV = new ArrayList();
			
			HashSet set = new HashSet();
			int count2 = 0;
			 
			
			FileInputStream fstream =null;
			DataInputStream in=null;
			BufferedReader br=null;
			
			try {
				 fstream = new FileInputStream(fileName);
				 in = new DataInputStream(fstream);
				 br = new BufferedReader(new InputStreamReader(in));
			   	 String strLine;
			   	
				int count = 1;
				while ((strLine = br.readLine()) != null)
				{
					System.out.println(strLine);
				    	//reads the first line
				         //strLine = br.readLine();
				    	  //Reads the second line
				    	 while((strLine = br.readLine()) != null)
					      {
				    		
					    	 String[] value = strLine.split("\t");
					    	 
					    	 //System.out.println("1");
					    	  String id  = value[0];//Name of the chromosome
					    	  String geneid = id.replaceAll("\"", "");
					    	    	 int check = isInteger(geneid);
							    	  if(!(check == 0))
							    	  {
							    		  geneids.add(check);
							    	  }
							    	  else{
							    		  System.out.println("inside check");
							    		  warning.add("Please add interger at position "+count+ " Wrong value is"+ value[0]);
							    	  }
							  String mappa = value[1];
					    	  Double check2 = isDouble(mappa);
					    	  if (check2 == 2.0)
					    	  {
					    		  System.out.println("inside check2");
					    		  warning.add("Please add double value at position "+count);
					    	 
					    	  }
					    	  else
					    	  {
					    		 mappaV.add(check2);
					    		 if (check2 <0 || check2 > 1)
					    		 {
					    			 warning.add("Mappability value should be in between 0 and 1. Error at position "+ count);
					    		 }
					    		 
					    	  }
					    	  count ++; 
					    	 // System.out.println("count at the end is"+count);
					  		  
					          
				    	 }//while		          
					    	          
					       
				         
				}//while
				
				
				//Check duplicates 
				
				for (int i = 0; i < geneids.size(); i++) {
					  boolean val = set.add(geneids.get(i));
					  if (val == false) {
						  System.out.println("inside val");
					  	warning.add(geneids.get(i) + "geneid is duplicate in the given file");
					  }
					 }
				count2 =Collections.frequency(mappaV, 0);
				System.out.println(mappaV.size());
				for(int j = 0; j<mappaV.size(); j++)
				{
					Double c =(Double) mappaV.get(j);
					if(c == 0.0 )
					{
						count2++;
					}
				}
				
				System.out.println(count2);
				
				if(mappaV.size() == count2)
				{
					warning.add("Mappability values are all zeros");
				}
					 
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (NumberFormatException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			finally {
				try {
					if (br != null)
						{
						br.close();
						in.close();
						fstream.close();
						}
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
			
			return warning;
			    
}


public int isInteger( String input )  
{  
	int id = 0;
   try  
   {  
	  // System.out.println("*************"+input);
      id =Integer.parseInt( input );  
        
   }  
   catch( Exception e)  
   {  
	  return 0;  
   }  
   return id;
}  
	
public Double isDouble( String input )  
{  
	Double mappaValue = 2.0;
	
try  
   {  
	  //System.out.println("*************"+input);
     mappaValue=  Double.parseDouble( input );  
      
   }  
   catch( Exception e)  
   {  
	 return mappaValue;  
   }  
   return mappaValue;
} 



}