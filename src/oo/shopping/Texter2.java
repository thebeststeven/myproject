package oo.shopping;

import java.util.ArrayList;

public class Texter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer>List=
				new ArrayList<>();
		List.add(new Customer(6000));
		List.add(new SilverCustomer(8000));
		List.add(new GoldenCustomer(10000));
		List.add(new GoldenCustomer(15000));
		List.add(new SilverCustomer(1000));
		List.add(new Customer(6000));
		for(Customer cust:List){
			if(cust instanceof GoldenCustomer&&!
					(cust instanceof GoldenCustomer)){
				System.out.print("*");
				SilverCustomer silver =(SilverCustomer)cust;
			}
			cust.print();
		}
	}

}
