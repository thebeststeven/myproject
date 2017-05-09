package oo.shopping;

public class sCustomer extends Customer{
	double discount = 0.9;
	public sCustomer(int price){
		this.price = price;
	}
	public void sprint(){
		System.out.print("Silver"+"\t");
	}
	@Override
	public void print(){
		System.out.println(price+"\t"+price*discount+"\t"+price*back);
	}
	sCustomer(){
		
	}
}
