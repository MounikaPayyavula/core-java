package assignment;

public class Star1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		
		for(i=1;i<=5;i++)
		
		{
			for(j=1;j<=i;j++)
			{
				if(i==2)
				{
					continue;
				}
			
				System.out.print("* ");
			}
			if(i==2)
			{
				continue;
			}
			System.out.println();
		}
		for(i=1;i<=4;i++)
			
		{
			for(j=4;j>=i;j--)
			{
				if(i==3)
				{
					continue;
				}
			
				System.out.print("* ");
			}
			if(i==3)
			{
				continue;
			}
			System.out.println();
		}




	}

}
