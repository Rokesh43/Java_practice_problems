import java.util.*;
class  PrimeorNot
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number :");
		int number =sc.nextInt();
		boolean res =isPrimeNumber(number);
		
		if (res)
		{
			System.out.println("Prime Number");
		}
		else 
			System.out.println("Not a Prime Number");
	}
	public static boolean isPrimeNumber(int number)
	{
		if (number==1 ||number==0)
		{
			return false;
		}
		for (int i=2;i<number;i++ )
		{
			if (number%i==0)
			{
				return false;
			}		
		}
		return true;
	}
}
