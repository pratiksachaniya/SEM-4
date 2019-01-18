import java.util.Scanner;
class sumOfDigit
{
	public static void main(String ar[])
	{
		System.out.println("Enter Number:");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int sum = 0;
		
		while(no != 0)
		{
			sum += (no%10);
			no /= 10;
		}
		
		System.out.println("Sum Of Digit Is :" + sum);
	}		
}