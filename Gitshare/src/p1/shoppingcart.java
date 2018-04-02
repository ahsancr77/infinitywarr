package p1;


import java.util.*;
public class shoppingcart {
	private static  shoppingcart instance=new shoppingcart();
long pent_price;
long shirt_price;
long shoe_price;
long watch_pricerolex;
long totalpriceofall;
Scanner s1=new Scanner(System.in);
private shoppingcart()
{
	pent_price=1500;
	shirt_price=1350;
	shoe_price=2500;
	watch_pricerolex=20000;
}

public static shoppingcart getinstance()
{
	return instance;
}


ArrayList<String> thing=new ArrayList<String>();



public void shoppingcartt()
{
System.out.println("Size of array list="+thing.size());
thing.add("pent");
System.out.println("price of pent is="+pent_price);
thing.add("shirt");
System.out.println("price of pent is="+shirt_price);
thing.add("shoes");
System.out.println("price of pent is="+shoe_price);
thing.add("watch");
System.out.println("price of pent is="+watch_pricerolex);
System.out.println(thing);
System.out.println("Size of array list="+thing.size());
inputsetprice();
}




public void inputsetprice()
{
	
	System.out.println("Enter number of pents" );
	int numberofpents=s1.nextInt();
	System.out.println("Enter number of shirts" );
	int numberofshirts=s1.nextInt();
	System.out.println("Enter number of shoes" );
	int numberofshoes=s1.nextInt();
	System.out.println("Enter number of watches" );
	int numberofwatches=s1.nextInt();
	totalpriceofall=((pent_price* numberofpents)+(shirt_price*numberofshirts)+(shoe_price*numberofshoes)+(watch_pricerolex*numberofwatches));
	
	System.out.println("total bill is="+totalpriceofall);
	
}


	public static void main(String[] args) 
	{
		
		shoppingcart cart =shoppingcart.getinstance();
		cart.shoppingcartt();

	}

}


