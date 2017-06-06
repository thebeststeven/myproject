package oo.shopping2;

	public class SilverCustomer implements Customer {
		int price;
		float discount=0.9f;
		int back=0;
		SilverCustomer(int price){
			this.price = price;
		}
		
		@Override
		public void print() {
			// TODO Auto-generated method stub
			System.out.println(price+"\t"+price*discount+"\t"+price*back);
		}

	}


