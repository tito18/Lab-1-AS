package lab1;

import java.io.IOException;

public class main {

	public static void main(String[] args) throws IOException {
		
		Input InFiles = new Input();
		Shifter shif = new Shifter(InFiles.InputFile());
				
		for (String s: shif.Shifters2()){
			System.out.println(s);
		}
		//System.out.println();
		Output OutFiles = new Output();
		//String[] g = shif.Shifters2();
		//OutFiles.OutputFile(shif.Shifters());
		OutFiles.OutputFileSortAsc(shif.Shifters2());
	}
}

