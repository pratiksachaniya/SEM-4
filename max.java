 class max
{
	public static void main(String[] ar)
	{
		int a = Integer.parseInt(ar[0]);
		int b = Integer.parseInt(ar[1]);
		int c = Integer.parseInt(ar[2]);
		int max;
		max = a>b? (a>c? a : b) : (b>c)? b : c;
		System.out.println("Max Is "  + max);
		
	}	
}