import java .util.*;
class FindEven
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String [] args)
	{
		System.out.println("Enter thr number :");
		int num=sc.nextInt();
		
		int count=0;
		int temp=num;
		
		while (tem>0)
		{
			int tem=tem%10;
			if (tem%2==0)
			{
				count++;
			}
		}
		temp=temp/10;
	}
}

