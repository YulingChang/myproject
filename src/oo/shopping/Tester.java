package oo.shopping;

import java.util.ArrayList;

import stati.GraduateStudent;
import stati.Student;

public class Tester {
	ArrayList<Customer> list = new ArrayList<>();
	list.add(new Customer(6000));
	list.add(new Customer(2000));
	list.add(new SilverCustomer(8000));
	list.add(new SilverCustomer(10000));
	list.add(new GoldenCustomer(30000));
	list.add(new GoldenCustomer(10000));

}
