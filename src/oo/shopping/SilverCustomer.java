package oo.shopping;

public class SilverCustomer extends Customer{
	double discount = 0.9;
	public SilverCustomer(int price){
		this.price = price;
	}
	public void sprint(){
		System.out.print("Silver"+"\t");
	}
	@Override
	public void print(){
		System.out.println(price+"\t"+price*discount+"\t"+price*back);
	}
	SilverCustomer(){
		
	}
}
