import java.util.*;
class BinToDeci
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the Binary :");
		int number=sc.nextInt();
		
		int res=getDecimal(number);
		System.out.println(number+" Decimal value of "+res);
	}
	public static int getDecimal(int number)
	{
		int sum=0,x=1;
		
		while (number>0)
		{
			sum+=(number%10)*x;
			x*=2;
			number/=10;
		}
		return sum;
	}
}
