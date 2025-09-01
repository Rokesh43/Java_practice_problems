class Multiplication 
{
	public static void main(String[] args) 
	{
		double wallet = 10000;
		System.out.println("Initial Balance:"+wallet);
		int qty = 3;
		System.out.println("Quantity:"+qty);
		double price=2000;
		double bill=price*qty;
		System.out.println("Bill:"+bill);
		wallet = wallet  - bill;
		System.out.println("Available Balance:"+wallet);
		
	}
}
