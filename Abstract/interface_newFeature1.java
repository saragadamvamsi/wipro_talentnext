package Abstract;

interface vehicle{
	default void message() {
		System.out.println("Inside Vehicle");
	}
}
interface FourWheeler{
	default void message() {
		System.out.println("Inside FourWheeler");
	}
}
public class interface_newFeature1 implements vehicle,FourWheeler{
	public void message() {
		vehicle.super.message();
		FourWheeler.super.message();
	}
	public static void main(String[]args) {
		interface_newFeature1 obj=new interface_newFeature1();
		obj.message();
	}
}
