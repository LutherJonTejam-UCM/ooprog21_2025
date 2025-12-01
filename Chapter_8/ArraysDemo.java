import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] array = new int[5];

        display("Original array:", array);

        Arrays.fill(array, 8);
        display("After filling with 8s:", array);

        array[1] = 6;
        array[3] = 3;
        display("After changing two values:", array);

        Arrays.sort(array);
        display("After sorting:", array);
    }

    public static void display(String message, int array[]) {
        System.out.print(message + " ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
