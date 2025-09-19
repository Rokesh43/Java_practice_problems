import java.util.*;
class ArrayAddEven 
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the Size :");
		int size=sc.nextInt();
		
		int [] a=new int[size];
		
		for (int i=0;i<a.length;i++)
		{
			System.out.print("Enter the a["+i+"]:");
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		int res=addEven(a);
		System.out.println("Result :"+res);
		
	}
	public static int addEven(int [] a)
	{
		int sum=0;
		
		for (int i=0;i<a.length;i++ )
		{
			if (i%2==0)
			{
				sum+=a[i];
			}
		}
		return sum;
	}
}
