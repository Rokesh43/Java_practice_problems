import java.util.*;
class PrintNumber 
{
	static int start=1,end=5;
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number :");
		int number =sc.nextInt();
		solve();
	}
	public static void solve()
	{
		if (start<=end)
		{
			System.out.println(start);
			start++;
			solve();
		}
	}
}
