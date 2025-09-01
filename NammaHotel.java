import java.util.*;
class NammaHotel
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String [] args) throws Exception
	{
		
		
		System.out.println("\t\t\t---Welcome to Namma Hotel ---");
		System.out.println("1.Food Court\n2.Fast food\n3.Drinks");
		System.out.print("\t\t\tSelect the food:");
		int food=sc.nextInt();
		System.out.println("Processing.....");
		Thread.sleep(2000);
		
		switch (food)
		{
		case 1->{
			double price = 0, total = 0;
			System.out.println("\t\t\tWelcome to Food court");
			System.out.println("Non-veg\n\t1.Chikken Briyani\n\t2.Mutton Briyani\n\t3.Egg Briyani\nVeg\n\t4.Meals\n\t5.Tomato rice\n\t6.Curd Rice");
			System.out.print("\t\t\tSelect the Items :");
			int items=sc.nextInt();
			System.out.println("Processing......");
			Thread.sleep(2000);
			
			switch (items)
			{
			case 1->{
				System.out.println("Chikken briyani --Rs.100");
				price=100;
			}
			case 2->{
				System.out.println("Mutton Briyani  --Rs.200");
			     price=200;
			}
			case 3->{
				System.out.println("Egg Briyani  --Rs.90");
				 price=90;
			}
			case 4->{
				System.out.println("Meals  --Rs.80");
				 price=80;
			}
			case 5->{
				System.out.println("Tomato Rice  --Rs.60");
				 price =60;
			}
			case 6->{
				System.out.println("Curd Rice  --Rs.50");
				price=50;
			}
			default ->{System.out.println("Invalid Items");
			}
			
			}
			
			//Quantity Section
			System.out.print("\t\t\tEnter the Quantity :");
			int quantity = sc.nextInt();
			System.out.println("Processing........");
			Thread.sleep(2000);
			
			if (quantity>0)
			{
				total=price*quantity;
				
			}
			else{
				System.out.println("Invalid select");
			}
			
			//Payment section
			
			System.out.println("1.Gpay\n2.Phonepay\n");
			System.out.print("\t\t\tSelect Payment Method : ");
			int payment=sc.nextInt();
			System.out.println("Processing........");
			Thread.sleep(2000);
			
			if (payment==1)
				System.out.println("Gpay");
			else if (payment==2)
				System.out.println("Phonepay");
			else 
				System.out.println("Invalid Payment selection");
			
			System.out.println("Total Amount Rs."+total);
			System.out.print("\t\t\tEnter the Amount :");
			double amount=sc.nextDouble();
			System.out.println("Processing......");
			Thread.sleep(2000);
			
			if (amount==total)
				System.out.println("\t\t\tPayement Waiting...");
			else
				System.out.println("Invalid Amount");
			System.out.println("Processing.....");
			Thread.sleep(2000);
			
			
			
			//Otp Section
			int otp=(int)(Math.random()*9999+9999);
			System.out.println("Otp is Send the mobile : " +otp);
			
			System.out.print("\t\t\tEnter the Otp :");
			int verify=sc.nextInt();
			System.out.println("Processing....");
			Thread.sleep(2000);
			
			if(verify==otp)
				System.out.println("Your Order is placed ");
			else 
				System.out.println("Wrong otp Order is Cancelled");
			
			
			
				}
		 case 2->{
			 double rate=0,sum=0;
			System.out.println("\t\t\t---Welcome to Fast Food---");
			System.out.println("1.Pizza    --Rs.100\n2.Burger   --Rs.80\n3.Sandveg  --Rs.50\n4.Maagi    --Rs.40");
			System.out.print("\t\t\tSelect the FastFood : ");
			int fastfood=sc.nextInt();
			System.out.println("Processing....");
			Thread.sleep(2000);
			
			switch (fastfood){
				case 1->{
					System.out.println("Pizza  ---Rs.100");
					rate=100;
				}
				case 2 ->{
					System.out.println("Burger  ---Rs.80");
					rate=80;
				}
				case 3 ->{
					System.out.println("Sandveg  --Rs.50");
					rate = 50;
				}
				case 4 ->{
					System.out.println("Maagi  --Rs.40");
					rate=40;
				}
				default ->{
					System.out.println("Invalid Fast Food Items");
				}
				
			}
			//qts select
			
			System.out.print("\t\t\tEnter the Qantity : ");
			int qty=sc.nextInt();
			System.out.println("Processing....");
			Thread.sleep(2000);
			
			if(qty>0)
			 {
				sum=qty*rate;
			 }
			 else 
				 System.out.println("Invalid Quatity");
			 
			 //payment section
			 
			 System.out.println("1.Gpay\n2.Phonepay");
			 System.out.print("\t\t\tSelect the Payment :");
			 int pay=sc.nextInt();
			 System.out.println("Processing...");
			 Thread.sleep(2000);
			 
			 if(pay==1)
				 System.out.println("Gpay");
			 else if(pay==2)
				 System.out.println("Phonepay");
			 else
				 System.out.println("Invalid Payment");
			 
			 System.out.println("Total Amount :"+sum);
			 System.out.print("\t\t\tEnter the Total amount :");
			 int tol=sc.nextInt();
			 System.out.println("Processing.....");
			 Thread.sleep(2000);
			 
			 if(tol==sum)
				 System.out.println("Payment is Processing....");
			 else
				 System.out.println("Invalid Amount");
			 
			 //otp Section
			 int foodotp=(int)(Math.random()*9999+9999);
			 System.out.println("Generated Otp :"+foodotp);
			 System.out.print("\t\t\tVerify Otp :");
			 int enterotp=sc.nextInt();
			 System.out.println("Processing....");
			 Thread.sleep(2000);
			 
			 if(enterotp==foodotp)
				 System.out.println("Your Order is Placed...");
			 else
				 System.out.println("Wrong Otp your Order is Cancelled");
			
		 }
		 case 3->{
			  double drate=0,dsum=0;
			System.out.println("\t\t\t---Welcome to Drinks Court---");
			System.out.println("1.Milk Shake\n2.Fruit Juice\n3.Tea\n4.Coffee");
			System.out.print("\t\t\tSelect the Drinks: ");
			int drinks=sc.nextInt();
			
			switch(drinks)
			 {
				case 1->{
					System.out.println("Milk Shake  --Rs.80");
					drate=80;
				}
				case 2->{
					System.out.println("Fruit juice  --Rs.60");
					drate=60;
				}
				case 3->{
					System.out.println("Tea  --Rs.10");
					drate=10;
				}
				case 4 ->{
					System.out.println("Coffee  --Rs.20");
					drate=20;
				}
				default ->{
					System.out.println("Invalid Selection Drinks");
				}
				
			 }
			 //drinks qty section
			 System.out.print("\t\t\tSelect the Quantity :");
			 int dqty=sc.nextInt();
			 System.out.println("Processing...");
			 Thread.sleep(2000);
			 
			 if(dqty>0)
				 dsum=drate*dqty;
			 else
				 System.out.println("Invalid Quantity");
			 
			 //payment section
			 
			System.out.println("1.Gpay\n2.Phonepay");
			System.out.print("\t\t\tSelect the Payment Method: ");
			int dpay=sc.nextInt();
			System.out.println("Processing...");
			Thread.sleep(2000);
			
			if(dpay==1)
				System.out.println("Gpay");
			else if(dpay==2)
				System.out.println("Phonepay");
			else
				System.out.println("Invalid Payment Method");
			
			System.out.println("Total amount :"+dsum);
			System.out.print("\t\t\tEnter the Total amount :");
			int dtotal=sc.nextInt();
			System.out.println("Processing...");
			Thread.sleep(2000);
			
			if(dtotal==dsum)
				System.out.println("Payment Waiting...");
			else
				System.out.println("Invalid Amount");
			
			//dotp section
			int dotp=(int)(Math.random()*9999+9999);
			System.out.println("OTP is send :"+dotp);
			
			System.out.print("\t\t\tVerify OTP :");
			int votp=sc.nextInt();
			System.out.println("Processing....");
			Thread.sleep(3000);
			
			if(votp==dotp)
				System.out.println("Your order is placed.");
			else
				System.out.println("OTP is Wrong Order is cancel");
			
			
			
		 }
		 default ->
			 System.out.println("Invalid");
		
		
		}
	}
}
