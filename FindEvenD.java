import java .util.*;
class FindEvenD
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String [] args)
	{
		System.out.println("Enter thr number :");
		int num=sc.nextInt();
		
		int count=0;
		int temp=num;
		
		while (temp>0)
		{
			temp=temp%10;
			if (temp%2==0)
		
				count++;
			else
			 temp=temp/10;
		}
		
		
		System.out.println("even number is :"+count);
		
	}
}
