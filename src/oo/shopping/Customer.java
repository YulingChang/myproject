package oo.shopping;

import java.util.Scanner;

public class Customer {

	    int thesis;
	    public Customer(int amount){
		
		Customer c1 = new Customer(6000);
		Customer c2 = new Customer(2000);
		System.out.println("請輸入會員級別:");
	    System.out.println("1.一般會員");
	    System.out.println("2.銀級會員");
	    System.out.println("3.金級會員");
	    Scanner scanner = new Scanner(System.in);
	    String s = scanner.nextLine();
	    int type = Integer.parseInt(s);
	    System.out.println("請輸入結帳金額:");
	    s = scanner.nextLine();
	    
	    if (type==1){
	    	System.out.println(amount);
	    }else if (type==2){
	    	  System.out.println(Math.round(amount*0.9));
	    	}else{
	    		System.out.println(Math.round(amount*0.9)+"+"+Math.round(amount*0.05));
	    		
	    	}

	}

}
