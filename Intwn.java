class Intwn 
{
	public static void main(String[] args) 
	{
		int a=12345;
		
		double res1=a;
	    long res6=a;
		long res7=(long)a;
		boolean res2=(a==12345);
		char res3=(char)a;
		byte res4=(byte)a;
		short res5=(short)a;
		
		float b=5677.66;
		int i=(int)b;
		
		System.out.println("int:"+a);
		
		System.out.println("double:"+res1);
		System.out.println("long:"+res6);
		System.out.println("long to int:"+res7);
		System.out.println("boolean:"+res2);
		System.out.println("char:"+res3);		
		System.out.println("byte to int:"+res4);
		System.out.println("short to int:"+res5);
		
		System.out.println("float:"+b);
		System.out.println("int:"+i);
		
	}
}
