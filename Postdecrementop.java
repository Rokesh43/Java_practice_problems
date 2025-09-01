class Postdecrementop 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=(a-- +a--)+(a+a--)+a;
		int c=(b-- + a--)+(b+a)+b;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
	}
}
