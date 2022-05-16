package week1.day2.assignments;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator obj=new Calculator();
		System.out.println(obj.add(10, 20, 30));
		System.out.println(obj.sub(16, 10));
		System.out.println(obj.mul(2, 4));
        float f = obj.div(7, 2);
        System.out.println(f);
	}

}
