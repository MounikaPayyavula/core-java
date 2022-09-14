package codingpractice;

public class Game {
	static int max(String str)
	{
		int n=str.length();
		int res=-1;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(str.charAt(i)==str.charAt(j))
					res=Math.max(res, Math.abs(j-i-1));
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="AABAABAA";
		System.out.println(max(str));
				

	}

}
