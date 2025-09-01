import java.util.*;
class  Months
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the Month:");
		int month=sc.nextInt();
		
		switch (month)
		{
		case 1->System.out.println("january");
		case 2->System.out.println("Febuary");
		case 3->System.out.println("March");
		case 4->System.out.println("April");
		case 5->System.out.println("May");
		case 6->System.out.println("june");
		case 7->System.out.println("july");
		case 8->System.out.println("August");
		case 9->System.out.println("Septeber");
		case 10->System.out.println("October");
		case 11->System.out.println("november");
		case 12->System.out.println("December");
		default->System.out.println("invalid");
		
		}
	}
}
