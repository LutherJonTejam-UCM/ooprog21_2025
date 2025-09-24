import java.util.Scanner;

public class DebugPen {
    private String color;
    private String point;

    public DebugPen() {
        color = "black";
        point = "fine";
    }

    public DebugPen(String penColor, String penPoint) {
        color = penColor;
        point = penPoint;
    }

    public String getColor() {
        return color;
    }

    public String getPoint() {
        return point;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter pen color: ");
        String inputColor = scanner.nextLine();

        System.out.print("Enter pen point: ");
        String inputPoint = scanner.nextLine();

        DebugPen pen = new DebugPen(inputColor, inputPoint);

        System.out.println("Pen color: " + pen.getColor());
        System.out.println("Pen point: " + pen.getPoint());

        scanner.close();
    }
}

