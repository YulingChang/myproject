package oo.shopping;

public class SilverCustomer extends Customer{
	int amount;
	public SilverCustomer(int amount){
		super(amount);
		this.amount = amount;

	
		
			
		}
		public void print() {
			System.out.println("�ȯŷ|��" + "\t"+ "���:" + amount + " �馩��:" + Math.round(amount * 0.9) + " �٭��:" + 0);

	}

}
