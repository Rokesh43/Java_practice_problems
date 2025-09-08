import java.util.*;
class DeciToBin
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number :");
		int number =sc.nextInt();
		
		String res=getBinary(number);
		System.out.println("Binary :"+res);
	}
	public static String getBinary (int number)
	{
		String ans ="";
		
		while (number>0)
		{
			ans=number%2+ans;
			number=number/2;
		}
		return ans;
	}
}
