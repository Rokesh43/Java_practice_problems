class Logical 
{
	public static void main(String[] args) 
	{
		int a=30;
		int b=10;
		int c=40;
		
		boolean res1=(a!=b  &&  c<=b) || (a<=b  && a<b);
		boolean res2=!(b==c) || (a!=c) ||(c>b);
		boolean res3=res1 && !res2
		
		System.out.println("res1:"+res1);
		System.out.println("res2:"+res2);
		System.out.println("res3:"+res3);
		
	}
}
