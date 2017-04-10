package oo.obstraction;

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		System.out.println("請輸入發票號碼:");
		a.add(331);
		a.add(821);
		a.add(886);
		a.add(554);
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.get(2));
		System.out.println(a.get(3));
		Scanner scanner = new Scanner(System.in);
		String x = scanner.nextLine();
		int i = Integer.parseInt(x);
		if(i == a.get(0) || i == a.get(1) || i == a.get(2) || i == a.get(3)){
			System.out.println("恭喜中獎!!!");
		}else{
			System.out.println("好可惜沒中獎!!!");
		
		}
			

	}

}
