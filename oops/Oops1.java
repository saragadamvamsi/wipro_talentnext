package oops;
class Box{
	public double box(double width, double length, double height){
		return (length*width*height);
	}
}
public class Oops1 {

	public static void main(String[] args) {
		Box obj = new Box();
		System.out.println("The volume of the box : "+obj.box(3, 4, 5));
	}

}
