import java.util.Scanner;
class revno
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int no = sc.nextInt();
		int rev = 0;
		int tmp = no;
		
		while(tmp != 0)
		{
			rev = rev * 10;
			rev += tmp%10;
			tmp = tmp / 10;
		}	
		
		System.out.println("Revers Is " + rev);		
	}
}