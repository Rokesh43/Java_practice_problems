import java.util.*;
class Largestno
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("\t\t\tEnter the number:");
		int a=sc.nextInt();
		
		System.out.print("\t\t\tEnter the number:");
		int b=sc.nextInt();
		
		int res =a>b?a:b;
		System.out.println("Result:"res);
	}
}
