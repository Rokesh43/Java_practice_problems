class Test7
  
{
	public static void main (String [] args)
	{
		display(6);
	}	
	
	public static void display (int a)
	{
		System.out.println("Display "+a);
		square (a);
	}
	public static void square(int a)
	{
		System.out.println("Square "+a*a);
	}
}
