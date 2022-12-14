package fileiodemo;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//java program to read byte data using InputStream class
public class InputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		InputStream input=new FileInputStream("d:/javatest/data1.txt");

        /*
         * A data input stream enable an application read primitive 
         * Java data types from an underlying input stream in a 
         * machine-independent way(instead of raw bytes).
 
         */
        DataInputStream inst=new DataInputStream(input);

        int count=input.available();
        System.out.println("The total no.of Bytes Available to read : "+count);

        byte[] ary=new byte[count];

        inst.read(ary);
        for(byte bt:ary)
        {
            char k=(char) bt;
            System.out.print(k+"-");
        }
	}

}
