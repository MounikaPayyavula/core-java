package fileiodemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//java program to demonstrate DataOutputStream
//This program uses try-with-resources. It requires JDK 7 or later.
public class OutputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//writing data using output stream
        try( DataOutputStream dout=new DataOutputStream
                (new FileOutputStream("d:/javatest/data1.txt")))
                {
                    dout.writeDouble(1.1);
                    dout.writeInt(55);
                    dout.writeBoolean(true);
                    dout.writeChar('4');
                }
        catch(FileNotFoundException ex)
        {
            System.out.println("Cannot open output file"+ex);
        }

        // reading data back using input stream
        try( DataInputStream din=new DataInputStream
                (new FileInputStream("d:/javatest/data1.txt")))
        {
            double a=din.readDouble();
            int b=din.readInt();
            boolean c=din.readBoolean();
            char d=din.readChar();

            System.out.println("Values : "+a+"\n "+b+" \n"+c+"\n "+d);
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Cannot Open Input File"+ex);
        }

	}

}
