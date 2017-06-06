package oo.shopping2;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NormalCustomer a = new NormalCustomer(1000);
		SilverCustomer b = new SilverCustomer(1500);
		GoldenCustomer c = new GoldenCustomer(2000);
		a.print();
		b.print();
		c.print();
	}

}
