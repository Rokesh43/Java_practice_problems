import java.util.*;
class  MagicGame
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		int sys_number =(int)(Math.random()*100);
		
		System.out.println("\t\t\t----Welcome To Magic Game----");
		
		System.out.println("\t\t\tGame is Starting.....");
		Thread.sleep(3000);
		boolean flag=true;
		do
		{
			System.out.print("Guess the Number :");
			int user_guess=sc.nextInt();
			
			if (user_guess<sys_number)
			{
				System.out.println("Low");
			}
			else if (user_guess>sys_number)
			{
				System.out.println("High");
			}
			else {
				System.out.println("$$$$Win the game$$$$");
			    System.out.println("1.Enter any key To continue\n2.Exit");
				int user_choice=sc.nextInt();
				
				if (user_choice==2)
				{
					flag=false;
					System.out.println("Thank you");
				}
				else 
			      {
					sys_number=(int)(Math.random()*100);
			      }
				  }
		}
		while (flag);
		
	}
}
