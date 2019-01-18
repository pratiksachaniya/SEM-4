import java.util.Scanner;
class A
{
	void show()
	{
		System.out.println("I'm Class A");
	}
	A()
	{
		System.out.println("Class A Was Created");
	}
}
class B  extends A
{
	void show()
	{
		super.show();
		System.out.println("I'm Class B");
	}
	B()
	{
		System.out.println("Class B was Created");
	}
}
class C extends B
{
	void show()
	{
		super.show();
		System.out.println("I'm Class C");
	}
	C()
	{
		System.out.println("Class C was Created");
	}
		
}
class inheri
{
	public static void main(String ar[])
	{
		C c1 = new C();
		c1.show();
	}	
}