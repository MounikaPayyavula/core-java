package codingpractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Real_estate {
	public static void main(String[] args) {
		
	
	int n1=4;
	int n2=46;
	int n3=20;
	int ar[]= {7,5,11,17};
	Arrays.sort(ar);
	ArrayList<Integer> w=new ArrayList<Integer>();
	Arrays.sort(ar);
	int z=0;
	for(int i=n1-1;i>=0;i--)
	{
		int temp=(int)(ar[i]*Math.pow(2, z));
		if(temp<n2)
		{
			w.add(ar[i]);
			n2-=(ar[i]*Math.pow(2, z));
			z+=1;
		}
		
	}
	int s=0;
	for(int i=0;i<=w.size()-1;i++)
	{
		int a=(int)w.get(i)*(int)Math.pow(2,n3);
		s+=a;
	}
	System.out.println(s);
	
}
	
	

}
