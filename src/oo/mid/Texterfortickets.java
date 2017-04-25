package oo.mid;

public class Texterfortickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket t1 = new Ticket();
		t1.setID(1009);
		t1.setName("Steven");
		t1.setPrice(2280);
		System.out.println("ID:"+t1.getID());
		System.out.println("Name:"+t1.getName());
		System.out.println("Price:"+t1.getPrice());
	}

}
