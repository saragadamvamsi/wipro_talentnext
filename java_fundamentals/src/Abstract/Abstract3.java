package Abstract;

public class Abstract3 {
    private double height;
    private double width;
    private double breadth;

    public Abstract3(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getBreadth() {
        return breadth;
    }

    public double getVolume() {
        return height * width * breadth;
    }

    public void displayDimensions() {
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Breadth: " + breadth);
        System.out.println("Volume: " + getVolume());
    }

    public static void main(String[] args) {
        Abstract3 compartment = new Abstract3(10.0, 8.0, 6.0);
        compartment.displayDimensions();
    }
}