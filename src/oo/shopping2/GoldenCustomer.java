package oo.shopping2;

public class GoldenCustomer extends Customer  {
	float returnRate = 0.05f;

	public GoldenCustomer(int price) {
		super(price);// �I�s�����O�غc�l
	}

	@Override
	public void print() {

		System.out.println(price + "\t" + (price * discount) + "\t" + (price * returnRate));
	}

}
