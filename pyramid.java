class pyramid
{
	public static void main(String ar[])
	{
		int N = Integer.parseInt(ar[0]);
		int j,k,i;
		
		for(i = 1; i <= N; i++)
		{
			for(j = N - i;  j > 0; j--)
			{
				System.out.print(" ");
			}
			for(k = 1; k<= i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}