class Bitwise
{
	public static void main(String[] args)
	{
		int a = 6;
		int b = 4;
		int ans = a | b;
		System.out.println("Ans Of A | B Is " + ans); 
		ans = a & b;
		System.out.println("Ans Of A & B Is " + ans); 
		ans = a ^ b;
		System.out.println("Ans Of A ^ B Is " + ans); 
		ans = ~a;
		System.out.println("Ans Of ~a Is " + ans);
		ans = a << 2;
		System.out.println("Ans Of A << 2 Is " + ans); 
		ans = a >> 2;
		System.out.println("Ans Of A >> 2 Is " + ans); 
		ans = a >>> 2;
		System.out.println("Ans Of A >>> 2 Is " + ans); 
			
	}	
}