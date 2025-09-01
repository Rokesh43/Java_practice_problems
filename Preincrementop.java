class Preincrementop 
{
	public static void main(String[] args) 
	{
		int a=15;
		int b=(++a + a)+(++a + ++a);
		int c=(++b + ++a)+(b+a);
		System.out.println("A:"+a);
		System.out.println("B:"+b);
		System.out.println("C:"+c);
	}
}
