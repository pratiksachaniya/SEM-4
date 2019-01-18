import java.util.Scanner;
class ctof
{
	public static void main(String ar[])
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter temperature in Fahrenheit :");
		float f = sc.nextFloat();
		float c = ((f-32)*5)/9;
		System.out.println("temperature in Celsius Is :" + c);
		
	}	
}