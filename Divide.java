import java.util.*;
class  Divide
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the Value : ");
		int value = sc.nextInt();
		
		if(value%3==0 && value%5==0)
			System.out.println("FizzBuzz");
		else if(value%3==0)
			System.out.println("Fizz");
		else if(value%5==0)
			System.out.println("Buzz");
		else
			System.out.println("Not a div 3 and 5");
	}
}
