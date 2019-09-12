package lab1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Output {
	public void OutputFile(String[] A) throws IOException {
		String content = "Output file test"+ "\n"+"\n";
		
		//There is the place where we put the differents shifters sentence on the output file
        for (String h: A){
            content = content + h + "\n";
        }
        //The location of the file and its name
        File file = new File("C:/Users/titoe/Desktop/TestOutput.txt");
        
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(content);
        bw.close(); // Be sure to close BufferedWriter
	}
	public void OutputFileSortAsc(String[] A) throws IOException {
		String content = "Output file test"+ "\n"+"\n";
		String[] SortSentences = A;
		String ctrl = null;
		
		for (int i=0; i < A.length;i++){
			SortSentences[i]=SortSentences[i].toLowerCase();
		}
		
		//There is the place where we put the different shifters sentence on the output file
        for (int i =0; i < A.length; i++){
        	for (int j=0; j < A.length; j++){
        		if (SortSentences[i].compareTo(SortSentences[j])<0){
        			ctrl = SortSentences[i];
        			SortSentences[i] = SortSentences[j];
        			SortSentences[j] = ctrl;
        		}
        	}
        }
		for (String h: SortSentences){
            content = content + h + "\n";
        }
        //The location of the file and its name
        File file = new File("C:/Users/titoe/Desktop/TestOutput.txt");
        
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(content);
        bw.close(); // Be sure to close BufferedWriter
	}

	
}
