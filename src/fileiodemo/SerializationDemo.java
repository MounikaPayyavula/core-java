package fileiodemo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("Micheal Stuff","Castle Street, Bangalore",11123445,101);

        try
        {
            FileOutputStream fout=new FileOutputStream("d:/javatest/employee.ser");
            ObjectOutputStream out=new ObjectOutputStream(fout);

            out.writeObject(e1); // creating persistent/ serialized object

            out.close();
            fout.close();
            System.out.println("Object Serialised");
        }
        catch(Exception ex)
        {
            System.err.println(ex);
        }

	}

}
