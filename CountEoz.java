import java.util.*;
class CountEoz
{
	static Scanner sc =new Scanner (System.in);
	public static void main(String [] args)
	{
		System.out.print("Enter the Number");
		int num=sc.nextInt();
		
		int z_count=0,e_count=0,o_count=0;
		while (num>0)
		{
			int last=num%10;
			if (last==0)
				System.out.println("Zero count :"+last);
				
			else if (last%2==0)
				System.out.println("Even count :"+last);
				
			else
				System.out.println("Odd count :"+last);
				
			num/=10;
		}

	}
}
