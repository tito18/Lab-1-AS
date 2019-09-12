package lab1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shifter {
	
	private String sentence;
	
	public Shifter(String phrase) {
		sentence = phrase;
	}

	public String[] Shifters(){
		
		String[] shifter = sentence.split(" ");
	    String[] test=shifter;
	    String[] Sentences = new String[shifter.length];
	    String c = null;
	    
	  //Shifter algorithm One Sentence
	    for(int i = 0; i<shifter.length;i++){
	        Sentences[i]="";
	        for (String h: test){
	            Sentences[i] = Sentences[i] + h + " ";
	        }
	        
	        c = test[0];
	        
	        for(int j = 0; j<shifter.length ;j++){
	            
	            if (j<shifter.length-1){
	                test[j] = test[j+1];
	            }
	            if (j == shifter.length-1){
	                test[j] = c;
	            }
	        }
	    }
	    return Sentences;
	}
	
	public String[] Shifters2(){
		
		String[] lines = sentence.split("\n");
		
		String[][] shifter = new String[lines.length][];
		for(int f=0; f<lines.length;f++){
			shifter[f] = lines[f].split(" ");
		}
		
		int index=0;
		int ctrl=0;
		for (int i =0; i<lines.length;i++){
			index = index + shifter[i].length;
		}
		
		String[] Sentences = new String[index];
		
		
		for(int z=0; z<lines.length;z++){
			String[] test=shifter[z];
			String[] words= new String[test.length];
			
			String c = null;
						
		  //Shifter algorithm Two Sentence
		    for(int i = 0; i<test.length;i++){
		    	Sentences[ctrl]="";
		    	words[i]="";
		    
		        for (int h=0; h<test.length;h++){
		        	words[i] = words[i] + test[h]+"\n";
		        }
		        Sentences[ctrl] = words[i];
		        
		        ctrl++;
		        c = test[0];
		        
		        for(int j = 0; j<test.length ;j++){
		            
		            if (j<test.length-1){
		                test[j] = test[j+1];
		            }
		            if (j == test.length-1){
		                test[j] = c;
		            }
		        }
		    }
		}
		//System.out.println(Sentences.length);
		return Sentences;
	}
	
	public String[] Shifters3(){
		
		String[] lines = sentence.split("\n");
		String[] shifter = lines[0].split(" ");
		String[] shifter1 = lines[1].split(" ");
	    String[] test=shifter;
	    String[] test1=shifter1;
	    String[] Sentences = new String[shifter.length+shifter1.length];
	    String[] Sentences1 = new String[shifter1.length];
	    String c = null;
	    
	  //Shifter algorithm One Sentence
	    for(int i = 0; i<shifter.length;i++){
	        Sentences[i]="";
	        for (String h: test){
	            Sentences[i] = Sentences[i] + h + " ";
	        }
	        
	        c = test[0];
	        
	        for(int j = 0; j<shifter.length ;j++){
	            
	            if (j<shifter.length-1){
	                test[j] = test[j+1];
	            }
	            if (j == shifter.length-1){
	                test[j] = c;
	            }
	        }
	    }
	    for(int i = 0; i<shifter1.length;i++){
	        Sentences1[i]="";
	        for (String h: test){
	            Sentences1[i] = Sentences1[i] + h + " ";
	        }
	        
	        c = test1[0];
	        
	        for(int j = 0; j<shifter1.length ;j++){
	            
	            if (j<shifter1.length-1){
	                test1[j] = test1[j+1];
	            }
	            if (j == shifter1.length-1){
	                test1[j] = c;
	            }
	        }
	    }
	    
	    for(int i=0;i<shifter1.length; i++){
	    	Sentences[i+shifter.length]="";
	        Sentences[i+shifter.length] = Sentences[i+shifter.length] + Sentences1[i] + " ";
	        
	    }
	    
	    
	    return Sentences;
	}
	
}
