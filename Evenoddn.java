import java.util.*;
class Evenoddn  
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("\t\t\tEnter thr Number : ");
		int value=sc.nextInt();
		
		if(value%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
}
