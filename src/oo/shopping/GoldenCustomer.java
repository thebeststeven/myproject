package oo.shopping;

public class GoldenCustomer extends SilverCustomer{
	double back = 0.05;
	public GoldenCustomer(int price){
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
