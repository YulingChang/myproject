package oo.stati;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		
		
		System.out.println(Student.pass);// static不用生物件就已經存在一個值
		Student stu1 = new Student(50, 90, 80);
		Student stu2 = new Student(60, 58, 80);
		Student stu3 = new Student(75, 65, 80);
		stu1.pass = 70;// 因為static所以改一個全部都會跟著改
		stu1.print();
		stu2.print();
		GraduateStudent gstu1 = new GraduateStudent(68,85,89);
		GraduateStudent gstu2 = new GraduateStudent(78,83,65);
		gstu1.print();
		gstu2.print();
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(50, 90, 80));
		list.add(new Student(60, 58, 80));
		list.add(new Student(75, 65, 80));
		list.add(new GraduateStudent(68,85,89));
		list.add(new GraduateStudent(78,83,65));
		for (int i=0;i<list.size();i++){
			Student stu = list.get(i);
			stu.print();
		}
	

}


	}


