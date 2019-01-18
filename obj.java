import java.util.Scanner;
class SayHello
{
	String str;
	void hello()
	{
		System.out.println("Hello "  + str);
	}
	SayHello(String str)
	{
		this.str = str;
	}
}
class obj
{
	public static void main(String ar[])
	{
		SayHello s1 = new SayHello("Pratik Sachaniya");
		s1.hello();
		System.out.println("I'm Pratik");
	}	
}