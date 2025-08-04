package oops;
class Calculator{
	public static int powerInt(int num1, int num2) {
		return (int) Math.pow(num1, num2);
	}
	public static double powerDouble(double num1, double num2) {
		return Math.pow(num1, num2);
	}
}
public class Oops2 {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		System.out.println(obj.powerInt(2, 3));
		System.out.println(obj.powerDouble(2,3));
	}

}
