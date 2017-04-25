package oo.mid;

public class Mc {
	int priceofham = 100;
	int priceoffries = 50;
	int priceofcoke = 20;
	int numofham;
	int numoffries;
	int numofcoke;

	public Mc(int priceofham, int priceoffries, int priceofcoke) {
		this.priceofham = priceofham;
		this.priceoffries = priceoffries;
		this.priceofcoke = priceofcoke;
	}
	public void print(){
		System.out.println(priceofham*100+priceoffries*50+priceofcoke*20);
	}
}
