import java.util.Scanner;
class Home
{
	static float electricBill,telephoneBill,grocery,total,part;
	static String[] plans= {"Plan 1 -15000","Plan 2 -22000","Plan 3 -5500","Plan 4 -18500","Plan 5 -11000"};

	public static class member
	{
		String name;
		float salary;
		int plan;
		Scanner sc =  new Scanner(System.in);
		member()
		{


			System.out.println("Enter Member Name:");
			this.name = sc.nextLine();
			
			System.out.println("Enter Member Salary:");
			this.salary = sc.nextFloat();
			
			for (int i = 0; i < plans.length; i++)
			{
				System.out.println(plans[i]);
			}
			System.out.println("Enter Member Plan:");
			this.plan = sc.nextInt();
		}
	}
	
	
	public static void main(String args[])
	{
		System.out.println(plans[1]);
		
		member m1 = new member();
		member m2 = new member();
		member m3 = new member();
		
		Scanner sc =  new Scanner(System.in);
		//Family Expenses
		System.out.println("Enter Electric Bill Amont:");
		float electricBill = sc.nextFloat();
		
		System.out.println("Enter Telephone Bill Amont:");
		float telephoneBill = sc.nextFloat();
		
		System.out.println("Enter Grocery Amont:");
		float grocery = sc.nextFloat();

		total = electricBill + telephoneBill + grocery;
		float totalContributes = getContributes(m1) + getContributes(m2) + getContributes(m3);

		if(total < totalContributes)
		{
			System.out.println("Family Expenses can be Collected");
			checkMember(m1);
			checkMember(m2);
			checkMember(m3);
		}
		else
		{
			System.out.println("Can't Family Expenses can be Collected");
		}

	}
	
	public static float getContributes(member m)
	{
		return (m.salary*25)/100;
	} 

	public static void checkMember(member m)
	{
		float contribute = getContributes(m);
		String[] planDiv = plans[m.plan - 1].split("-");	
		float planAmount = Float.parseFloat(planDiv[1]);

		float pureSalary = m.salary - contribute;
		if(planAmount > pureSalary)
		{
			System.out.println(m.name + " is unable to bear the family contribution with " + plans[m.plan - 1]);
		}
	}
}