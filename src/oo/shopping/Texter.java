package oo.shopping;

public class Texter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer a = new Customer(6000);
		Customer b = new Customer(7000);
		SilverCustomer c = new SilverCustomer(10000);
		GoldenCustomer d = new GoldenCustomer(30000);
		Customer e = new Customer(2000);
		GoldenCustomer f = new GoldenCustomer(10000);
		a.cprint();
		a.print();
		b.cprint();
		b.print();
		c.sprint();
		c.print();
		d.gprint();
		d.print();
		e.cprint();
		e.print();
		f.gprint();
		f.print();
	}

}
