package oo.shopping2;

public class NormalCustomer extends Customer {
	 public NormalCustomer(int price){
		 super(price);
		}
	 @Override
		public void print() {

			System.out.println(price + "\t" + price + "\t");
		}

}
