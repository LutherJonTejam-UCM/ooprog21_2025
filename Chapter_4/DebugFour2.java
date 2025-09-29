import java.util.Scanner;

public class DebugFour2 {
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

