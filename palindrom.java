import java.util.Scanner;
class palindrom
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
		if(rev == no)
		System.out.println("Number Is Palindrom");
		else
		System.out.println("Number Is Not Palindrom");		
	}
}