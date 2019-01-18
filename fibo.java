import java.util.Scanner;
class fibo
{
	public static void main(String ar[])
	{
		int no;
		int nxt = 0;
		int cur = 0;
		int tmp;
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Number:");
		no = sc.nextInt();
		
		while(no > 0)
		{
			System.out.print(nxt + ",");
			tmp = nxt;
			nxt = cur + nxt;
			cur = tmp;
			if(nxt ==0)
			nxt = 1;
			no--;
		}
		
		
	}	
}