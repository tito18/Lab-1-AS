package lab1;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class KWICCore {
	private List<String> inputLines = new ArrayList<>(); // Raw input lines for the input file
    private List<String> Sentences = new ArrayList<>(); // All shifted sentences

    public KWICCore(){
        try {
            URL url = getClass().getResource("TestInput.txt"); //Getting the file path from resources (relative path)
            Scanner reader = new Scanner(new File(url.getPath())); // Reader for the input path
            while(reader.hasNext()) inputLines.add(reader.nextLine()); // Read lines while there are more
        }catch (Exception e){
            System.out.print(e);
        }
    }

    public void Shifters(){
        Sentences = new ArrayList<>(); //Clear the list, new shifting
        for(String line: inputLines){
            List<String> shifter = new ArrayList<>(Arrays.asList(line.split(" "))); //Extract the words from the sentence
            for(int i=0; i < shifter.size(); i++){
                String newSentance = "";

                //Create a new sentence and add it to the list
                for (String word: shifter) newSentance += word + (word==shifter.get(shifter.size()-1)?"":" " );
                Sentences.add(newSentance);

                //Shift the words
                String tmp = shifter.get(0);
                shifter.add(tmp);
                shifter.remove(tmp);
            }
        }
    }

    //Output sentences unsorted
    public void OutpuFile(){
        Print(Sentences);
    }

    //Output sentences sorted ASC
    public void OutputFileSortAsc(){
        List<String> sorted = new ArrayList<String>(Sentences);
        //Sort sentences, having in mind caps letters
        sorted.sort((String x, String y) -> x.toLowerCase().compareTo(y.toLowerCase()));
        Print(sorted);
    }


    private void Print(List<String> output){
        String content = "";

        //There is the place where we put the differents shifters sentence on the output file
        for (String h : output) {
            content = content + h + "\n";
        }

        try {
            //The location of the file and its name
            File file = new File("TestOutput.txt");

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close(); // Be sure to close BufferedWriter
        }catch (Exception e){
            System.out.print(e);
        }
    }
}
