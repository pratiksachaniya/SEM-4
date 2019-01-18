import java.util.Scanner;
class Cube
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No1:");
		int no1 = sc.nextInt();
		System.out.println("Enter No2:");
		int no2 = sc.nextInt();
		System.out.println("Enter No3:");
		int no3 = sc.nextInt();
		
		System.out.println("Square Of No1 Is " + (no1*no1));
		System.out.println("Cube Of NO1 Is "  + (no1*no1*no1*no1));
		System.out.println("Square Of No2 Is " + (no2*no2));
		System.out.println("Cube Of NO1 Is "  + (no2*no2*no2*no2));
		System.out.println("Square Of No3 Is " + (no3*no3));
		System.out.println("Cube Of NO1 Is "  + (no3*no3*no3*no3));
	}
}