package fileiodemo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//Program to create a text based file
public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

		Writer w=new FileWriter("d:/javatest.txt");
		try
        {
            //w=new FileWriter("d:/javatest.txt");
            String content="She Sells Sea Shells In the Sea.";

            w.write(content); // write contents into file

            w.close();
            System.out.println("Character Data Written to File");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
		finally
		{
			w.close();
		}
	}

}
