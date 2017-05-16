package oo.shopping;

import java.util.Scanner;

public class Customer {
	 int amount;
	    public Customer(int amount){
	    	super();
	    		this.amount = amount;

	   }
		public void print() {
			System.out.println("一般會員" + "\t" + "原價:" + amount);
			
		}

}
