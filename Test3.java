//user input is positive or negative or 0 zero print

import java .util.*;
class Test3
{
	static Scanner sc=new Scanner (System.in);
	public static void main (String [] args)
	{
		System.out.println("Enter the number :");
		char num =sc.next().charAt(0);
		
		String res =(num==0)?"zero":(num>0)?"Positive":"negative";
		
		
		System.out.println("Result -"+res);
		
	}
}