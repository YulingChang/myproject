package oo.stati;

public class GraduateStudent extends Student{
	int thesis;
	public GraduateStudent(int english, int math, int chinese) {
		
		this.english = english;
		this.math = math;
		this.chinese = chinese;
		
		
		}
	@Override //防止寫錯 檢查是否有一樣的類別可以覆寫
	public void print() {
			System.out.println(getScore(english) + "\t" + getScore(math) + "\t" + getScore(chinese) + "\t" +thesis);
	
//因為繼承不能繼承建構子 只能繼誠屬性方法還有protected 所以要用override覆寫
}
}