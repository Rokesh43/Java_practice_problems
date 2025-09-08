import java.util.*;
class PowerOperation 
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("\t\t\tEnter the x value :");
		int x=sc.nextInt();
		
		System.out.print("\t\t\tEnter the n value :");
		int n=sc.nextInt();
		
		int res=power(x,n);
		System.out.println("Result :"+res);
	}
	public static int power(int x,int n)
	{
		int ans=1;
		for (int i=1;i<=n;i++ )
		{
			ans*=x;
		}
		return ans;
	}
}
