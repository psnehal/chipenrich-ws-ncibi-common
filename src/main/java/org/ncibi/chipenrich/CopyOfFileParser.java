package org.ncibi.chipenrich;
import java.util.regex.Matcher;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
public class CopyOfFileParser {
	
	private RangeCheck rc = new RangeCheck();
	public static void main(String[] args) throws IOException
	{
		CopyOfFileParser fc = new CopyOfFileParser();
		//File file1= new File("C:/Users/snehal/Desktop/Data Files/bedFiles/E2f4.bed");
		File file1= new File("/home/snehal/DataFiles/ChipEnrich/Gm12878_CTCF_peaks.bed");

		//System.out.println(fc.fParser(file1,"human").toString());
		ArrayList<String> res = new ArrayList<String>();
		res=fc.fParser(file1,"mm9");
		for (int i=0;i<res.size();i++)
		{
		//	System.out.println(res.size()+"at last");
			System.out.println(res.get(i));
		}
		
		
	}

public ArrayList<String> fParser(File fileName, String sglist)
{
					
			String status ;
			System.out.println("Output is"+sglist);
			ArrayList<String> warning = new ArrayList<String>();
			List<String> warningRC = new ArrayList<String>();
			FileInputStream fstream =null;
			DataInputStream in=null;
			BufferedReader br=null;
			
			try {
				 fstream = new FileInputStream(fileName);
				 in = new DataInputStream(fstream);
				 br = new BufferedReader(new InputStreamReader(in));
			   	 String strLine;
			   	 String check_pattern ="^[a-z][a-z][a-z]+[0-9]|[0-1][0-9]|X|Y$";
			   	 String col1 ="^chr+[0-9]|[0-1][0-9]|X|Y$";
				 int count = 0;
				 ArrayList<String> check = new ArrayList<String>();
				 while ((strLine = br.readLine()) != null)
				 {
				    Pattern pattern = Pattern.compile(col1);
			        Matcher matcher = pattern.matcher(strLine);
			       // System.out.println(strLine);
					     if(matcher.find())
					     {    String[] value = strLine.split("\t");
					    	  String chrNm  = value[0];//Name of the chromosome
					    	  int startPos= Integer.parseInt(value[1]);
					    	  //System.out.println(value[1]);
					    	  int entPos = Integer.parseInt(value[2]);
					    	  Pattern p2 = Pattern.compile(col1);
						      Matcher m2 = p2.matcher(value[0]);
					    	  if(m2.find())
					    	  {
					    		  if(sglist.equals("hg19")){
							        	 	warningRC= rc.checkHumanRange(chrNm,startPos,entPos, count);
							        	 	//System.out.println(warningRC.size()+"warningRC in human");
							        		if(!(warningRC.isEmpty())){
								           		 warning.addAll(warningRC);}
								           		//System.out.println("warning with chro error"+warning.size());								        				}
							       }
							       else if (sglist.equals("mm9")) {   
							        	   warningRC =rc.checkMouseRange(chrNm,startPos,entPos,count);
							        	   //System.out.println(warningRC.size()+"warningRC in mouse");
							        	   if(!(warningRC.isEmpty())){
							        		   warning.addAll(warningRC);}
							       }
							       else if (sglist.equals("r4")) {   
						        	   warningRC =rc.checkRatRange(chrNm,startPos,entPos,count);
						        	   //System.out.println(warningRC.size()+"warningRC in mouse");
						        	   if(!(warningRC.isEmpty())){
						        		   warning.addAll(warningRC);}
						       }
					    	  }
					    	  else
					    	  {
					    		  status ="Error at first column with value : "+strLine + "\n";
						        	//errorMsg.append("Error at position: "+count+"  Error value is: "+value[0]+"\n");
						           warning.add(status);
						        	//System.out.println("warning size for patern check");
					    	  }
					     } 
					     
					     
				         
				}//while
				// System.out.println( count + "  "+  warning.size());
				
				
				    
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
			
}
