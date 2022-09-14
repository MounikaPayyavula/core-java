package assignment;
/*
5 4 3 2 1
5 4 3 2
5 4 3 2
5 4 3
5 4
5
*/ 

public class NestedLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		
		for(i=1;i<=5;i++)
		
		{
			for(j=5;j>=i;j--)
			{
				/*if(i==2)
				{
					System.out.println(j+"\t");
				}*/
			
				System.out.print(j+"\t");
			}
			System.out.println();
		}

	}

}
