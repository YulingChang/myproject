package oo.stati;

public class Student {
	int english;
	int math;
	int chinese;
	static int pass = 60;// static�������ϥΦP�@�Ӹ��
	static{
		System.out.println(pass);
	}
	public Student(){
		
	}

	public Student(int english, int math, int chinese) {
		super();
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}
	public void print() {
		System.out.println(getScore(english) + "\t" + getScore(math) + "\t" + getScore(chinese));
	}
	//public static void print()�]�i�H�[static���̭�����]�t�ݭn������~�ಣ�ͪ��F��
	
	protected String getScore(int score) {
		if (score < pass) {
			return String.valueOf(score) + "*";// �����ন�r��
		} else {
			return String.valueOf(score);
		}

	}
	public String toString(){
		return
				"eng:" +english +"\n" +
				"chinese:" +chinese +"\n" +
				"math:" +math;
	}
	
			
	     
}


