import java .util.*;
class  StartEnd
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		int res;
		System.out.print("Starting Number :");
		int start=sc.nextInt();
		
		System.out.print("Ending Number :");
		int end=sc.nextInt();
		
		while (start<=end)
		{
			int res=start++;
		}
		System.out.print(res%2);
	}
}
