package codingpractice;

import java.util.Arrays;

public class real {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n1=6;
			int n2=44;
			int n3=20;
			int[] arr=  {5,3,6,1,2,4};
			Arrays.sort(arr);
			int[] p=new int[n1];
			for(int i=0;i<n1;i++)
			{
				p[i]=arr[i];
				
			}
			int sm=0;
			for(int i=n1-1;i>=0;i--)
			{
				if(arr[i]<=n2)
				{
					sm+=p[i];
					n2-=arr[i];
					for(int j=0;j<i;j++)
					{
						arr[j]*=2;
					}
				}
			}
			
		         return sm*(int)Math.pow(2, n3);
		}
	  
		
	}



