import java.util.*;
class  Evenorodd
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		
		System.out.print("Enter the Value");
		int value=sc.nextInt();
		
		if(value%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("odd");
		}
		
	}
}
