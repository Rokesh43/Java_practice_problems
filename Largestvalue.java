import java.util.*;
class Largestvalue 
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.print("\t\t\tEnter the a number:");
		int a=sc.nextInt();
		
		System.out.print("\t\t\tEnter the b number:");
		int b=sc.nextInt();
		
		System.out.print("\t\t\tEnter the c number:");
		int c=sc.nextInt();
		
		String res=a>b?"A is greater value is:"+a:b>c?"B is greater value is:"+b:"C is greater value is:"+c;
		System.out.println("\t\t\tprocessing......");
		Thread.sleep(3000);
		
		System.out.println("Result:"+res);
			
	}
}
