package fileiodemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//writes text to character output stram,buffering characters
//o/p is set to underlying character or byte

//Writing to a file using BufferedWriter in Java 
public class BufferedWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{ 
	        // Creating Writer obj in Append mode -true
	        FileWriter writer = new FileWriter("d:/javatest/names.txt"); 
	        BufferedWriter bwr = new BufferedWriter(writer);  


	        bwr.write("Mounika"); 
	        bwr.write("\n"); // bwr.newLine();
	        bwr.write("Lalli");
	        bwr.write("\n");
	        bwr.append("JAMES GOSLING");
	        
	        bwr.close(); 
	 
	        System.out.println("succesfully written to a file"); } 
	        catch (IOException ioe) { 
	        ioe.printStackTrace(); 
	 
	    }

	}

}
