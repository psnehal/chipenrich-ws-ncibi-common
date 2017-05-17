package org.ncibi.chipenrich;
//range should be added later on
import java.util.*;

public class RangeCheck {
	
private final static Map<String, int[]> hmHuman = new HashMap<String, int[]>();
private final static Map<String, int[]> hmMouse = new HashMap<String, int[]>();
private final static Map<String, int[]> hmRat = new HashMap<String, int[]>();
static
{
/*hg19: 
c(249250621,135534747,135006516,133851895,115169878,107349540,102531392,90354753,81195210,78077248,59128983,243199373,63025520,48129895,51304566,198022430,191154276,180915260,171115067,159138663,146364022,141213431,155270560,59373566)

mm9:
c(197195432,129993255,121843856,121257530,120284312,125194864,103494974,98319150,95272651,90772031,61342430,181748087,159599783,155630120,152537259,149517037,152524553,131738871,124076172,166650296,15902555)

 */

	int [] c1={0,249251621};
	int [] c10={0,135544747};
	int [] c11={0,135016516};
	int [] c12={0,133861895};
	int [] c13={0,115179878};
	int [] c14={0,107359540};
	int [] c15={0,102541392};
	int [] c16={0,90364753};
	int [] c17={0,81205210};
	int [] c18={0,78087248};
	int [] c19={0,59138983};
	int [] c2={0,243210373};
	int [] c20={0,63035520};
	int [] c21={0,48139895};
	int [] c22 = {0,51314566};
	int [] c3={0,198022430};
	int [] c4={0,191164276};
	int [] c5={0,180925260};
	int [] c6={0,171125067};
	int [] c7={0,159148663};
	int [] c8={0,146374022};
	int [] c9={0,141223431};
	int [] cx={0,155280560};
	int [] cy={0,59383566};
	

	

	hmHuman.put("chr1",c1);
	hmHuman.put("chr10",c10);
	hmHuman.put("chr11",c11);
	hmHuman.put("chr12",c12 );
	hmHuman.put("chr13",c13);
	hmHuman.put("chr14",c14);
	hmHuman.put("chr15",c15);
	hmHuman.put("chr16",c16);
	hmHuman.put("chr17",c17 );
	hmHuman.put("chr18",c18);
	hmHuman.put("chr19",c19);
	hmHuman.put("chr2",c2 );
	hmHuman.put("chr20",c20);
	hmHuman.put("chr21",c21 );
	hmHuman.put("chr22",c22);
	hmHuman.put("chr3",c3);
	hmHuman.put("chr4",c4);
	hmHuman.put("chr5",c5);
	hmHuman.put("chr6",c6);
	hmHuman.put("chr7",c7 );
	hmHuman.put("chr8",c8);
	hmHuman.put("chr9",c9);
	hmHuman.put("chrx",cx);
	hmHuman.put("chry",cy);
	
	int [] m1={0,197200432};
	int [] m10={0,130003255};
	int [] m11={0,121853856};
	int [] m12={0,121267530};
	int [] m13={0,120294312};
	int [] m14={0,125204864};
	int [] m15={0,103495974};
	int [] m16={0,98329150};
	int [] m17={0,95282651};
	int [] m18={0,90782031};
	int [] m19={0,61352430};
	int [] m2={0,181758087};
	int [] m3={0,159609783};
	int [] m4={0,155640120};
	int [] m5={0,152547259};
	int [] m6={0,149527037};
	int [] m7={0,152534553};
	int [] m8={0,131748871};
	int [] m9={0,124086172};
	int [] mx={0,166660296};
	int [] my={0,15912555};


	
	
	hmMouse.put("chr1",m1);
	hmMouse.put("chr10",m10);
	hmMouse.put("chr11",m11 );
	hmMouse.put("chr12",m12);
	hmMouse.put("chr13",m13);
	hmMouse.put("chr14",m14);
	hmMouse.put("chr15",m15);
	hmMouse.put("chr16",m16);
	hmMouse.put("chr17",m17 );
	hmMouse.put("chr18",m18);
	hmMouse.put("chr19",m19);
	hmMouse.put("chr2",m2 );
	hmMouse.put("chr3",m3);
	hmMouse.put("chr4",m4);
	hmMouse.put("chr5",m5);
	hmMouse.put("chr6",m6);
	hmMouse.put("chr7",m7 );
	hmMouse.put("chr8",m8);
	hmMouse.put("chr9",m9);
	hmMouse.put("chrx",mx);
	hmMouse.put("chry",my);
	
	
	int [] r1={0,267920886};
	int [] r10={0,110728848};
	int [] r11={0,87769784};
	int [] r12={0,46792294};
	int [] r13={0,111164910};
	int [] r14={0,112204335};
	int [] r15={0,109768846};
	int [] r16={0,90248779};
	int [] r17={0,97306363};
	int [] r18={0,87275094};
	int [] r19={0,59228465};
	int [] r2={0,258217540};
	int [] r20={0,55278282};
	int [] r3={0,171073335};
	int [] r4={0,187136005};
	int [] r5={0,173106209};
	int [] r6={0,147646619};
	int [] r7={0,143012779};
	int [] r8={0,129051809};
	int [] r9={0,113450463};
	int [] rx={0,160709376};
	
	hmRat.put("chr1",r1);
	hmRat.put("chr10",r10);
	hmRat.put("chr11",r11 );
	hmRat.put("chr12",r12);
	hmRat.put("chr13",r13);
	hmRat.put("chr14",r14);
	hmRat.put("chr15",r15);
	hmRat.put("chr16",r16);
	hmRat.put("chr17",r17 );
	hmRat.put("chr18",r18);
	hmRat.put("chr19",r19);
	hmRat.put("chr2",r2 );
	hmRat.put("chr20",r20);
	hmRat.put("chr3",r3);
	hmRat.put("chr4",r4);
	hmRat.put("chr5",r5);
	hmRat.put("chr6",r6);
	hmRat.put("chr7",r7 );
	hmRat.put("chr8",r8);
	hmRat.put("chr9",r9);
	hmRat.put("chrx",rx);

	
}



          
public List<String> checkHumanRange(String chrNo,int start, int stop,int count)
          {
           // Create a hash map
			List<String> errorMsgA = new ArrayList<String>();                                    	
			String errorMsg ="";
			// Get a set of the entries
			//Set<?> set = hmHuman.entrySet();
			// Get an iterator
			//Iterator i = set.iterator();
			// Display elements
			int pos = count+1;
			if(hmHuman.containsKey(chrNo))
			{
				//System.out.println("Inside validate"+chrNo);
				 int []check = hmHuman.get(chrNo);
				//System.out.println("check 1 "+check[1]+" start "+start+" check 0 "+check[0]+"+ stop "+stop+ "no  "+chrNo);
				 if(start < check[0] || start > check[1] || stop < check[0] || stop > check[1]){		 
					// System.out.println("inside human appending mesage " + chrNo + check[1]);   
					 errorMsg ="Error in " + chrNo +" at position " + pos +". Values should be in range of +"+check [0] +"-"+ check[1]+"\n";
			    	 errorMsgA.add(errorMsg);
				 }// System.out.println("outside if");
			 }
			//System.out.println("inside check humn**********"+errorMsg);
			return errorMsgA;
			
			
          }
          
          
          public List<String> checkMouseRange(String chrNo,int start, int stop, int count)
          {
        	
        	List<String> errorMsgA = new ArrayList<String>();
        	String errorMsg ="";
            // Get a set of the entries
  			//Set<?> set = hmHuman.entrySet();
  			// Get an iterator
  			//Iterator i = set.iterator();
  			// Display elements
        	int pos = count+1;
  			if(hmMouse.containsKey(chrNo))
			{
				//System.out.println("Inside validate"+chrNo);
				 int []check = hmMouse.get(chrNo);
				// System.out.println(chrNo+"start+"+start+"stop"+stop);
				 if(start < 0 || start > check[1] || stop < 0 || stop > check[1]){		 
					// System.out.println("inside human appending mesage " + chrNo + check[1]);   
					 errorMsg ="Error in " + chrNo +" at position " + pos +". Values should be in range of +"+check [0] +"-"+ check[1]+"\n";
			    	 errorMsgA.add(errorMsg);
				 }// System.out.println("outside if");
			 }
			//System.out.println("inside check humn**********"+errorMsg);
			return errorMsgA;
        	  
			}
          
          public List<String> checkRatRange(String chrNo,int start, int stop,int count)
          {
           // Create a hash map
			List<String> errorMsgA = new ArrayList<String>();                                    	
			String errorMsg ="";
			// Get a set of the entries
			//Set<?> set = hmHuman.entrySet();
			// Get an iterator
			//Iterator i = set.iterator();
			// Display elements
			int pos = count+1;
			if(hmRat.containsKey(chrNo))
			{
				//System.out.println("Inside validate"+chrNo);
				 int []check = hmRat.get(chrNo);
				//System.out.println("check 1 "+check[1]+" start "+start+" check 0 "+check[0]+"+ stop "+stop+ "no  "+chrNo);
				 if(start < check[0] || start > check[1] || stop < check[0] || stop > check[1]){		 
					// System.out.println("inside human appending mesage " + chrNo + check[1]);   
					 errorMsg ="Error in " + chrNo +" at position " + pos +". Values should be in range of +"+check [0] +"-"+ check[1]+"\n";
			    	 errorMsgA.add(errorMsg);
				 }// System.out.println("outside if");
			 }
			//System.out.println("inside check humn**********"+errorMsg);
			return errorMsgA;
			
			
          }
          
          
          
}