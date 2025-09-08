import java.util.*;
class PrintAtoZ 
{
	static char start='A',end='Z';
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the Character :");
		char letter=sc.next().charAt(0);
		isCharacter();
	}
	public static void isCharacter()
	{
		if (start<=end)
		{
			System.out.print(start+" ");
			start++;
			isCharacter();
		}
	}
}
