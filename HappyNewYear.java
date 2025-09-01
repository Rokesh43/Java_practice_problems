import java.util.*;
class HappyNewYear
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String [] args)throws Exception
	{
      System.out.print("Enter the Countdown :");
	  int countdown=sc.nextInt();
      
      while (countdown > 0)
	  {
	  Thread.sleep(1000);
      System.out.println(countdown);
      countdown--;
      }
      Thread.sleep(2000);
      System.out.println("Happy New Year!!");

	}
}
