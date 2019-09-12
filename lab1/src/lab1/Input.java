package lab1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Input {
	public String InputFile() throws IOException{
		String FileText = new Scanner
				(new File("C:/Users/titoe/Desktop/TestInput.txt"))
        	    .useDelimiter("\\A").next();
        return FileText;
	}
}
