package basics;

public class NestedLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=5;i++)                        // 1   2     3   -number
		{
			for(j=1;j<=i;j++)                     // 1    2    3    -times
			{
				System.out.print(j+"\t");
			}
			System.out.println();
		}

	}

}
