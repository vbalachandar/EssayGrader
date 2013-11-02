package subvb;

import java.util.ArrayList;
import java.util.List;

import edu.stanford.nlp.ling.HasWord;
import edu.stanford.nlp.tagger.maxent.MaxentTagger;

public class subvberr {
	public static ArrayList sverror(List<List<HasWord>> sentences,MaxentTagger tagger,ArrayList<String> alltags) {

	    //String[] alltags = new String[6];
	    ArrayList<String> svrule = new ArrayList<String>();
	    ArrayList<Integer> score = new ArrayList<Integer>();
	    
	    svrule.add(0,"NNPS, VBZ");
	    svrule.add(1,"NNS, VBZ");
	    svrule.add(2,"NNP, VBP");
	    svrule.add(3,"NN, VBP, VBD");
	    svrule.add(4,"NNS, VBZ, VBD");
	    svrule.add(5,"DT, NN");
	    svrule.add(6,"PRP, IN");
	    svrule.add(7,"NNS, VBN");
	    
		    
	/* for(int j=0;j<alltags.size();j++)
	 {
		 //System.out.println("List of Tags : "+j+"th"+alltags.get(j));//Sentences inside string array in Tag format
		
		 //System.out.println("Sentence:"+sentences.get(0));
	 }*/
	 
	 for(int j=0;j<alltags.size();j++)
	 {
		 if(alltags.get(j).contains("PRP"))
		 {
		        if(sentences.get(j).toString().contains("I")||sentences.get(j).toString().contains("You")||sentences.get(j).toString().contains("We")||sentences.get(j).toString().contains("They"))
			   
		        {
		        	if(alltags.get(j).contains("VBZ"))
		        	{
		        		 //System.out.println(j+1+"th Sentence has incorrect subject verb agreement.");
		        		 score.add(j+1);
		        	}
		        	
		        	if(sentences.get(j).toString().contains("I is") ||sentences.get(j).toString().contains("I are")||sentences.get(j).toString().contains("I has"))
		        	{
		        		//System.out.println(j+1+"th Sentence has incorrect subject verb agreement.");
		        		score.add(j+1);
		        	}
		        	
		        	if((sentences.get(j).toString().contains("We")||sentences.get(j).toString().contains("They")) && sentences.get(j).toString().contains("is"))
		        	{
		        		//System.out.println(j+1+"th Sentence has incorrect subject verb agreement.");
		        		score.add(j+1);
		        	}
		        }
		        
		        if(sentences.get(j).toString().contains("He")||sentences.get(j).toString().contains("She")||sentences.get(j).toString().contains("It"))
		        {
		        	if(alltags.contains("VBP"))
		        	{
		        		 //System.out.println(j+1+"th Sentence has incorrect subject verb agreement.");
		        		 score.add(j+1);
		        	}		        	        	
		        }
		        if(sentences.get(j).toString().contains("he")||sentences.get(j).toString().contains("she")||sentences.get(j).toString().contains("it"))
		        {
		        	if(alltags.contains("VBP"))
		        	{
		        		 //System.out.println(j+1+"th Sentence has incorrect subject verb agreement.");
		        		 score.add(j+1);
		        	}		        	        	
		        }
		        
		 }
		 
		 else if(alltags.get(j).contains("PRP$"))
		 {
			 if(alltags.get(j).contains("VBP"))
	     	{
	     		 //System.out.println(j+1+"th Sentence has incorrect subject verb agreement.");
	     		score.add(j+1);
	     	}
		 }
		 
		 else
		 {
	 
	for(j=0;j<alltags.size();j++)
	{
	for (int r=0;r<svrule.size();r++)
	 {
		 
		 if (alltags.get(j).contains(svrule.get(r)))
		 {
		  //System.out.println(r+1+"th Sentence has incorrect subject verb agreement.");
		  score.add(j+1);
		 }
	 }
	 }
	 } 
	 //for(int x=0;x<alltags.size();x++)
	  
  
	}
	 return score;
	 }
}
