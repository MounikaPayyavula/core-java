package miscellaneous;

import com.wipro.training.microsoft.operatingSystem;
import com.wipro.training.oracle.Database;

//Demonstrate the use of packages
public class SoftwareList {

	public static void main(String[] args) {
		
		Database d1=new Database();
		d1.printSoftware();
		System.out.println("----------------------");
		operatingSystem op1=new operatingSystem();
		op1.listSoftware();

	}

}
