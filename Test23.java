import java .util.*;
class  EvenPrint
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("Number a :");
		int a=sc.nextInt();
		System.out.print("Number b :");
		int b=sc.nextInt();
		
		while (a<=b)
		{
			a++;
			if (a%2==0)
			{
				System.out.println(a);
			}
		}
	}
}
