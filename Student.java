import java.util.Scanner;
class Student
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String str = sc.next();
		System.out.println("Enter Fees:");
		float fs = sc.nextFloat();
		System.out.println("Enter No:");
		int no = sc.nextInt();
		
		System.out.println("---------------------------------");
		System.out.println("Name:" + str );
		System.out.println("Fees :" + fs);
		System.out.println("No    :" + no);
		
	}
}