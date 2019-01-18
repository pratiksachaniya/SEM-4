import java.util.Scanner;
class AreaOfSquare
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Length:");
		int  len = sc.nextInt();
		System.out.println("Enter Width:");
		int width = sc.nextInt();
		
		System.out.println("Area Of Square Is :" + (len*len));
		System.out.println("Area Of Rectangle Is :" + (len*width));		
	}	
}