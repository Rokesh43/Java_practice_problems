import java.util.*;
class Armstrong 
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("\t\t\tEnter the number :");
		int number=sc.nextInt();
		if (isArmstrong(number))
			System.out.println("Armstrong Number");
		else
			System.out.println("not Armstrong Number");
		
	}
	public static boolean isArmstrong(int number)
	{
		int count=0;
		for (int i=number;i>0;count++)
		{
		   i/=10;
		}
		
		int sum=0;
		for (int i=number;i>0;i/=10)
		{
			sum+=power(i%10,count);
		}
		
		return sum==number;
			
	}
	public static int power(int a,int b)
	{
		int ans=1;
		for (int i=1;i<=b;i++)
		{
			ans*=a;
		}
		return ans;
	}
}
