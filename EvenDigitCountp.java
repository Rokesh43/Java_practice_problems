import java.util.*;
class Test29
{
	static Scanner sc=new Scanner (System.in);
	public static void main ("String [] args")
	{
		System.out.println("Enter the Number :");
		int num=sc.nextInt();
		
		int count=0;
		
		if (num==0)
		{
			count=1;
		}
		while (num>0)
		{
			int digit=num%10;
			if (digit%2==0)
			{
				count++;
			}
			num=num/10;
		}
		System.out.println("Even is"+num "="+count);
	}
}
