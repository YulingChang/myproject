package stati;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(Student.pass);// static���Υͪ���N�w�g�s�b�@�ӭ�
		Student stu = new Student();
		Student stu1 = new Student(50, 90, 80);
		Student stu2 = new Student(60, 58, 80);
		stu1.pass = 70;// �]��static�ҥH��@�ӥ������|��ۧ�
		stu1.print();
		stu2.print();
		GraduateStudent gstu = new GraduateStudent(68,85,89);
		gstu.print();
	

}


	}


