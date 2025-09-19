import java.util.*;
class AddFirstLastDigit 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number :");
		int num=sc.nextInt();
		
		int last=num%10;
		
		while (num>9)
		{
			num/=10;
		}
		System.out.println("Add First And Last Digit"+(num+last));
	}
}
