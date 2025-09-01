import java .util.*;
class  Timecheck
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		System.out.print("\t\t\tEnter the Time :");
		double value=sc.nextDouble();
		
		if(value>=6.00 && value<=12.00)
			System.out.println("Good Morning");
		else if(value>=12.01 && value<=15.00)
			System.out.println("Good Afternoon");
		else if(value>=15.01 && value<=19.00)
			System.out.println("Good Evening");
		else if (value>=19.01 && value<=24.00)
			System.out.println("Good Night");
		else if(value>24.00)
			System.out.println("Invalid Time");
		else
			System.out.println("Invalid");
		
		 
		
	}
}
