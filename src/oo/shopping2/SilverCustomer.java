package oo.shopping2;

public class SilverCustomer extends Customer {
	public SilverCustomer(int price) {
		super(price);// �I�s�����O�غc�l
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

		System.out.println(price + "\t" + (price * discount) + "\t");
	}


}
