import java.util.*;
class Nvalue 
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number :");
		int a=sc.nextInt();
		
		System.out.print("Enter the Number :");
		int b=sc.nextInt();
		
		for (int i=a;i<=b ;i++ )
		{
			if (i%3==0 && i%5==0)
			{
				System.out.println(i+"-FizzBuzz");
			}
			else if (i%3==0)
			{
				System.out.println(i+"-Fizz");
			}
			else if (i%5==0)
			{
				System.out.println(i+"-Buzz");
			}
			
		}
		
	}
}
