import java.util.*;
class Studentform
{
	static Scanner sc=new Scanner(System.in);
	public static void main (String [] args)
	{
		System.out.print("\t\t\tEnter Student id:");
		int sid=sc.nextInt();
		
		System.out.print("\t\t\tEnter Student marks:");
		double marks=sc.nextDouble();
		
		System.out.print("\t\t\tEnter Student cantact:");
		long ph=sc.nextLong();
		
		System.out.print("\t\t\tEnter Student Gender:");
		char gender=sc.next().charAt(0);
		
		System.out.println("Student Id:"+sid);
		System.out.println("Student marks:"+marks);
		System.out.println("Student phone:"+ph);
		System.out.println("Student Gender:"+gender);
	}
}
