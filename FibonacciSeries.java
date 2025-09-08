import java.util.*;
class FibonacciSeries 
{
	static Scanner sc =new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number :");
		int number=sc.nextInt();
		
		boolean res=getFibonacci(number);
		
	}
	public static boolean getFibonacci(int number)
	{
		int first=0,second=1;
		for (int i=0;i<=number;i++ )
		{
			System.out.print(first+" ");
			int result=first+second;
			first=second;
			second=result;
		}
		return true;
	}
}
