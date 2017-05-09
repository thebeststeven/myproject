package oo.shopping;

public class Customer {
	int price;
	int discount=1;
	int back=0;
	public Customer(int price){
		this.price = price;
	}
	public void cprint(){
		System.out.print("Common"+"\t");
	}
	public void print(){
		System.out.println(price+"\t"+price*discount+"\t"+price*back);
	}
	Customer(){
		
	}
}
