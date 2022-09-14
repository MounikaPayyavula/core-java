package abcd;

import java.util.ArrayList;
import java.util.Arrays;

public class Whizlabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		a.add("coke");
		a.add("pep");
		a.add("marin");
		System.out.println("total:"+a);
		String[] w1=new String[a.size()];
		String[] w2=a.toArray(w1);
		
		System.out.println("w1==w2:"+(w1==w2));
		System.out.println("ws1:"+Arrays.toString(w1));
		System.out.println("ws2:"+Arrays.toString(w2));
		
		w1=new String[1];
		w1[0]="Test Data";
		w2=a.toArray(w1);
		
		System.out.println("w1==w2:"+(w1==w2));
		System.out.println("ws1:"+Arrays.toString(w1));
		System.out.println("ws2:"+Arrays.toString(w2));
		
		
		
		

	}

}
