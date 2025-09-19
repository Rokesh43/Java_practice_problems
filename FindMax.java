import java.util.*;
class FindMax 
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the num:");
		int num=sc.nextInt();
		
		int max=0,d=0;
		while (num>0)
		{
			d=num%10;
			
			if (d>max)
			{
				max=d;
			}
			num/=10;
		}
		System.out.println("Maximum digit:"+max);
	}
}
