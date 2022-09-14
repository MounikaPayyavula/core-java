package basics;

public class NestedLoopDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int weeks=3;
		int days=7;
		int i=1;
		
		//outer loop
		while(i<=weeks)
		{
			System.out.println("Week : "+i);
			 //inner loop
			
			for(int j=1;j<=days;++j)
			{
				System.out.println("\t"+"Day : "+j);
				
			}
			++i;
		}
		

	}

}
