import java.util.Scanner;

public class DebugFour1 {

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

