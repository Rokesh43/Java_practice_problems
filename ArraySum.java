import java.util.*;
class ArraySum 
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the size :");
		int size=sc.nextInt();
		
		int []a=new int[size];
		
		for (int i=0;i<a.length;i++)
		{
			System.out.print("Enter the a["+i+"]:");
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		int res=arraySum(a);
		System.out.println("Result"+res);
	}
	public static int arraySum(int[]a)
	{
		int sum=0;
		for (int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
	
}
