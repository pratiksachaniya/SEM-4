class emi
{
	public static void main(String[] ar)
	{
		int amt = Integer.parseInt(ar[0]);
		int tax = (amt*10)/100;
		int total = amt + tax;
		int Emi = total/60;
		System.out.println("EMI IS :" + Emi + "Rs.");
		
		}
}