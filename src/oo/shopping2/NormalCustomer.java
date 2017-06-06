package oo.shopping2;

public class NormalCustomer implements Customer {
	int price;
	int discount=1;
	int back=0;
	NormalCustomer(int price){
		this.price = price;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(price+"\t"+price*discount+"\t"+price*back);
	}

}
