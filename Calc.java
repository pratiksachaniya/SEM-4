class Complex
{
	static double ans;
	static double addNumber(double a,double b)
	{
		ans = a +b;
		return ans;
	}
	static double subNumber(double a,double b)
	{
		ans = a-b;
		return  ans;
	}
	static double multiNumber(double a,double b)
	{
		ans = a*b;
		return ans;
	}
	Complex()
	{
		ans = 0;
	}	
}
class Calc
{
	public static void main(String[] ar)
	{
		Complex cmplx = new Complex();
		double a = 10;
		double b = 20;
		double ans = cmplx.addNumber(a,b);
		//double ans = Complex.addNumber(a,b);
		System.out.println("Ans Is " + ans);
	}
	
}