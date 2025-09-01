class Predecrementop 
{
	public static void main(String[] args) 
	{
		int a=20;
		int b=(--a + --a)+(--a + a);
		int c=(--b + --b)+ (--b+--a);
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
	}
}
