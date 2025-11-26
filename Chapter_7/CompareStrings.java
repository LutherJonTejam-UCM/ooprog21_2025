import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String preset = "Carmen";
        System.out.print("Enter your name > ");
        String userInput = input.nextLine();

        if (userInput.equals(preset)) {
            System.out.println(preset + " equals " + userInput);
        } else {
            System.out.println(preset + " does not equal " + userInput);
        }
    }
}
