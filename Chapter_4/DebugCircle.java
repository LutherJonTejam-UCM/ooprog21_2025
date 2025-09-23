import java.util.Scanner;

public class DebugCircle {

    private int radius;
    private final double PI = 3.14159;
    private double area;

    public DebugCircle(int r) {
        radius = r;
        area = PI * r * r; 
    }

    public int getRadius() {
        return radius; 
    }

    public int getDiameter() {
        return 2 * radius; 
    }

    public double getArea() {
        return area; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = scanner.nextInt();

        DebugCircle circle = new DebugCircle(radius);
        
        System.out.println("Circle with radius " + circle.getRadius());
        System.out.println("Diameter: " + circle.getDiameter());
        System.out.println("Area: " + circle.getArea());

        scanner.close();
    }
}

