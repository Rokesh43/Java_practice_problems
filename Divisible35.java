import java .util.*;
class Divisible35 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception 
	{
		System.out.print("\t\t\tEnter the value:");
		int value=sc.nextInt();
		
		String res=(value%3==0 && value%5==0)?"FizzBuzz":(value%3==0)?"Fizz":(value%5==0)?"Buzz":"Not divisible by 3 and 5";
		
		System.out.println("\t\t\tProcessing....");
		
		Thread.sleep(3000);
		
		System.out.println("Result:"+res);
	}
}
