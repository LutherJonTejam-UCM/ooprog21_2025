import java.util.Scanner;

public class DebugBox {

    private int width;
    private int length;
    private int height;

    public DebugBox() {
        length = 1;
        width = 1;
        height = 1;
    }

    public DebugBox(int w, int l, int h) {
        width = w;
        length = l;
        height = h;
    }

    public void showData() {
        System.out.println("Width: " + width + " Length: " + length + " Height: " + height);
    }

    public int getVolume() {
        return length * width * height;
    }

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

