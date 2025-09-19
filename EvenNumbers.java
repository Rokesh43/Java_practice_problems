import java.util.*;
class EvenNumbers
{
	static int start=0,end=0;
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("Start value :");
		int start=sc.nextInt();
		System.out.print("End value :");
		int end=sc.nextInt();
		isEvenNumber();
		
	}
	public static void isEvenNumber()
	{
		if (start<=end)
		{
			if (start%2==0)
			{
				System.out.print(start+" ");
			}
			start++;
			isEvenNumber();
			
		}
		
		
	}
}
