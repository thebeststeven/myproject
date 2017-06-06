package oo.shopping2;

public class GoldenCustomer implements Customer {
	int price;
	float discount=0.9f;
	float back=0.05f;
	GoldenCustomer(int price){
		this.price = price;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(price+"\t"+price*discount+"\t"+price*back);
	}


}
