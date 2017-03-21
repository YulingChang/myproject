package oo.obstraction;

public class CarTester {

	public static void main(String[] args) {
		Car c1 = new Car("TOYOTA","ALTIS",1800);
		Car c2 = new Car("HONDA","ACCORD",2000);
		Car c3 = new Car("TOYOTA","WISH",2000);
		int[] n = new int[5];
		System.out.println(n[2]);
		
		
		
		Car[] cars = {c1,c2,c3,};
//		cars[0] = new Car("TOYOTA","ALTIS",1800);
//		cars[1] = new Car("HONDA","ACCORD",2000);
//		cars[2] = new Car("TOYOTA","WISH",2000);
		System.out.println(cars[1].name);
		cars[0].id = 301;
		cars[1].id = 406;
		cars[2].id = 405;
		int i = 0;
		for(i=0;i<3;i++){
			System.out.println(cars[i].name);
		}
		System.out.println(i);

	}class AA{
		
	}
     AA a = new AA();
}
