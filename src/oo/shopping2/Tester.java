package oo.shopping2;

import java.util.ArrayList;

import oo.shopping2.Customer;
import oo.shopping2.GoldenCustomer;
import oo.shopping2.SilverCustomer;
import oo.shopping2.NormalCustomer;

public class Tester {

	public static void main(String[] args) {
		ArrayList<Customer> clist = new ArrayList<>();
		clist.add(new NormalCustomer(10000));
		clist.add(new SilverCustomer(10000));
		clist.add(new GoldenCustomer(10000));
		clist.add(new NormalCustomer(8000));
		clist.add(new SilverCustomer(7000));
		clist.add(new GoldenCustomer(6000));
		System.out.println("*:SilverCustomer");
		System.out.println("~:GoldenCustomer");
		System.out.println("����" + "\t" + "�馩��" + "\t" + "�٭��");
		for (Customer c : clist) {
			// instanceof �ݥL�O�ݩ���̪�
			// ��k�䪺clist�q�Ĥ@����̫�@���Ӷ��ǩ�J���䪺Customer c
			if (c instanceof SilverCustomer && !(c instanceof GoldenCustomer)) {
				System.out.print("*");
				// SilverCustomer silver = (SilverCustomer) c;
				// �����O���ѷӥi�H��m�l���O������ ��c�ন�� �A����
				// �u�O�x��

			}
			if (c instanceof GoldenCustomer) {
				System.out.print("~");
			}

			/*
			 * �H�U���쥻����k if(c instanceof SilverCustomer &&!(c instanceof
			 * GoldenCustomer)){ System.out.print("*"); } if(c instanceof
			 * GoldenCustomer){ System.out.print("~"); }
			 */

			c.print();
		}

	}
}