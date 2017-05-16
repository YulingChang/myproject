package oo.shopping;

public class SilverCustomer extends Customer{
	int amount;
	public SilverCustomer(int amount){
		super(amount);
		this.amount = amount;

	
		
			
		}
		public void print() {
			System.out.println("銀級會員" + "\t"+ "原價:" + amount + " 折扣後:" + Math.round(amount * 0.9) + " 還原金:" + 0);

	}

}
