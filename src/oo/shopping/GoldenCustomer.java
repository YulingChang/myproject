package oo.shopping;

public class GoldenCustomer extends Customer{
	int amount;
	public GoldenCustomer(int amount){
		super(amount);
		this.amount = amount;

       
	}
	public void print() {
		System.out.println("���ŷ|��" + "\t"+ "���:" + amount + " �馩��:" + Math.round(amount * 0.9) + " �٭��:" + Math.round(amount * 0.05));

}}
