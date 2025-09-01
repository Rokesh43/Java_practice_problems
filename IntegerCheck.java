
import java.util.*;
class IntegerCheck     
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.print("Enter number:");
		int a=sc.nextInt();
		
		String res =a>0?"positive":"negative";
		System.out.println("Processing......");
		Thread.sleep(3000);
		System.out.println("result:"+res);
		
	}
}
