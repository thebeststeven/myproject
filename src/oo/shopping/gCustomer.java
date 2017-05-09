package oo.shopping;

public class gCustomer extends sCustomer{
	double back = 0.05;
	public gCustomer(int price){
		this.price= price;
	}
	public void gprint(){
		System.out.print("Golden"+"\t");
	}
	@Override
	public void print(){
		System.out.println(price+"\t"+price*discount+"\t"+price*back);
	}
}
