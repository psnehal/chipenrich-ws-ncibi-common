package org.ncibi.chipenrich;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
public class CreatePeakHtml {
public static void main(String[] args) throws IOException
{       		
        		CreatePeakHtml cph = new CreatePeakHtml();
        		String[] res = new String[0];
        		ArrayList<ChipEnrichResults> peaks = new ArrayList<ChipEnrichResults>();
        		peaks = cph.readRes();
        		/*
        		for(int i = 0; i<peaks.size();i++)
        		{
        			System.out.println("\n"+peaks.size()+"*********"+i+"\n"+
    				"1**"+peaks.get(i).getSetid()+"\n"+
    				"2++"+peaks.get(i).getDesc()+"\n");
    				        		}
        		System.out.println(peaks.get(0).getPmid());
        	//	System.out.println(peaks.get(16243).getPmid());
        		System.out.println(peaks.get(348).getPmid());
        		*/
        	}
        	
            
@SuppressWarnings("resource")
public ArrayList<ChipEnrichResults> readDep(){
               
                //System.out.println("1");
                File fileName= new File("/home/snehal/workspace2/LRPathBranch/chipenrich_peaks2.tab");
                //System.out.println("2");
                ArrayList<ChipEnrichResults> d = new ArrayList<ChipEnrichResults>();
                FileInputStream fstream;
        			try {
        	//			System.out.println("3");
        				fstream = new FileInputStream(fileName);
        				DataInputStream in = new DataInputStream(fstream);
        				BufferedReader br = new BufferedReader(new InputStreamReader(in));
        			   	String strLine;
        			   	int i=0;
        			   	while ((strLine = br.readLine()) != null)
        				{
        			   	 //System.out.println("4"+br.readLine()+"******************");
        			   			while((strLine = br.readLine()) != null)
        					      {
				        			    System.out.println("4"+strLine);
				        			    String tokens[] = strLine.split("\t");
				        			    for (int j =0; j<tokens.length;j++)
					        			{
					        				
					        				System.out.println(tokens[j]);
					        				
					        			}
				        				//System.out.println(tokens[1]);
				        				if (i!=0){
				        				//d.add(new ChipEnrichPeaks(tokens[0],tokens[1],tokens[2],tokens[3],tokens[4],tokens[5],tokens[6]));
				        				}
				        				i++;
        					      }//inner
        				    	 
        				}//outer
        				
        			 }
		             catch (FileNotFoundException e1) {
		            		e1.printStackTrace();
		            		} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
					 }
        			 return d;
        			
               
                }
            





public ArrayList<ChipEnrichResults> readRes(){
   //System.out.println("1");
    File fileName= new File("/home/snehal/workspace2/LRPathBranch/chipenrich_results2.tab");
    //System.out.println("2");
    //ArrayList<CreateResults> d1 = new ArrayList<CreateResults>();
    ArrayList<ChipEnrichResults> d = new ArrayList<ChipEnrichResults>();
    FileInputStream fstream;
		try {
			
			fstream = new FileInputStream(fileName);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
		   	String strLine;
		   	int i=0;
		   	while ((strLine = br.readLine()) != null)
			{
			    	while((strLine = br.readLine()) != null)
				      {
	        			//System.out.println("4");
			    		String tokens[] = strLine.split("\t");
			    		//System.out.println("length"+tokens.length+strLine);
	        			if(tokens.length <9)
	        			{
	        				tokens = append(tokens,"NA");
	        				System.out.println("Its error");
	        				//tokens[8]="NA";
	        					        				
	        			}
	        			//else
	        			//{
	        			for (int j =0; j<tokens.length;j++)
	        			{
	        				
	        				//System.out.println(tokens[j]);
	        				
	        			}
	        			if (i!=0){
	        			//	d.add(new ChipEnrichResults(tokens[0],tokens[1],tokens[2],tokens[3],tokens[4],tokens[5],tokens[6],tokens[7],tokens[8],tokens[9]));
	        			}
	        			i++;
	        			//System.out.println("*************************"+i);
				        //}
				      }//inner
			    	}//outer
			
			}
            catch (FileNotFoundException e1) {
        		e1.printStackTrace();
        		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    return d;
    }




static <T> T[] append(T[] arr, T element) {
    final int N = arr.length;
    arr = Arrays.copyOf(arr, N + 1);
    arr[N] = element;
    return arr;
}
}


			




