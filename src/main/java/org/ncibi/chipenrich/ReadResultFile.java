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



public class ReadResultFile {
	ChipEnrichResults data = new ChipEnrichResults();

	public static void main(String[] args) throws IOException
				{    
		ReadResultFile rrf = new ReadResultFile();
		//rrf.readRes("/usr/share/chipFileStore/Variable/mar8test1_2/mar8test1_2_results.tab","chipenrich");
		rrf.readRes("/home/snehal/DataFiles/test_restartRserve_results.tab","chipenrich");
		//rrf.readPeaks("/usr/share/chipFileStore/Variable/mar8test1_2/mar8test1_2_peaks.tab");
	        		
	        	}
////Geneset.Type	Geneset.ID	Description	P.value	FDR	Effect	Odds.Ratio	Status	N.Geneset.Genes	
	//0					1			2			3	4		5			6		7	 8
	//N.Geneset.Peak.Genes	Geneset.Peak.Genes	        	
	//            9				10
	
	
	//Geneset.Type	Geneset.ID	Description	P.value	FDR	Effect	Odds.Ratio	Status	N.Geneset.Genes	N.Geneset.Peak.Genes Geneset.Peak.Genes
	public ArrayList<ChipEnrichResults> readRes(String filepath,String method){
	   System.out.println("1");
	    File fileName= new File(filepath);
	    System.out.println("2");
	    
	    ArrayList<ChipEnrichResults> d = new ArrayList<ChipEnrichResults>();
	    FileInputStream fstream;
			try {
				
				fstream = new FileInputStream(fileName);
				DataInputStream in = new DataInputStream(fstream);
				BufferedReader br = new BufferedReader(new InputStreamReader(in));
			   	String strLine;
			   	int i=1;
			   	while ((strLine = br.readLine()) != null)
				{
				    	while((strLine = br.readLine()) != null)
					      {
		        			//System.out.println("4"+strLine);
				    		String tokens[] = strLine.split("\t");
				    		//System.out.println(tokens.length);
				    	    if(tokens.length <11)
		        			{
		        				tokens = append(tokens,"NA");
		        				System.out.println("Its error");
		        				tokens[9]="NA";
		        					        				
		        			}
				    	    if(method.equals("fet"))
				    	    {
		        			d.add(new ChipEnrichResults(tokens[0],tokens[1],tokens[2],tokens[3],tokens[4],tokens[5],tokens[6],tokens[7],tokens[8],"0",tokens[9]));
		        			
				    	    }
				    	    else
				    	    {
		        			d.add(new ChipEnrichResults(tokens[0],tokens[1],tokens[2],tokens[3],tokens[4],tokens[5],tokens[6],tokens[7],tokens[8],tokens[9],tokens[11]));
		        			System.out.println(tokens[11]);
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

//geneid	chrom	peak_midpoint	locus_start	locus_end	dist_to_tss	gene_symbol
	
//chrom	peak_start	peak_end	peak_midpoint	geneid	gene_symbol	gene_locus_start	gene_locus_end	nearest_tss	dist_to_tss	nearest_tss_gene	nearest_tss_gene_strand
//	0		1			2			3			4			5			6					7				8				9			10				11							
	public ArrayList<ChipEnrichPeaks> readPeaks(String filepath){
	       
        
        File fileName= new File(filepath);
        ArrayList<ChipEnrichPeaks> d = new ArrayList<ChipEnrichPeaks>();
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
                               
                                String tokens[] = strLine.split("\t");
                                if(tokens.length <12)
    		        			{
    		        				tokens = append(tokens,"NA");
    		        				System.out.println("Its error");
    		        				tokens[11]="NA";
    		        					        				
    		        			}
                                if (i!=0){
                                d.add(new ChipEnrichPeaks(tokens[0],tokens[1],tokens[2],tokens[3],tokens[4],tokens[5],tokens[6],tokens[7],tokens[8],tokens[9],tokens[10],tokens[11]));
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
	static <T> T[] append(T[] arr, T element) {
	    final int N = arr.length;
	    arr = Arrays.copyOf(arr, N + 1);
	    arr[N] = element;
	    return arr;
	}
	}


				



