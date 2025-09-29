import java.util.Scanner;
public class DebugFour3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of the box: ");
        int width = scanner.nextInt();

        System.out.print("Enter the length of the box: ");
        int length = scanner.nextInt();

        System.out.print("Enter the height of the box: ");
        int height = scanner.nextInt();

        DebugBox box = new DebugBox(width, length, height);

        box.showData();
        System.out.println("Volume: " + box.getVolume());

        scanner.close();
    }
}
