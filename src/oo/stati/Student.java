package oo.stati;

public class Student {
	int english;
	int math;
	int chinese;
	static int pass = 60;// static讓全部使用同一個資料
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
	//public static void print()也可以加static但裡面不能包含需要有物件才能產生的東西
	
	protected String getScore(int score) {
		if (score < pass) {
			return String.valueOf(score) + "*";// 把資料轉成字串
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


