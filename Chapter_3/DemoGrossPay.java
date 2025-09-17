import java.util.Scanner;

public class DemoGrossPay {
public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     System.out.print("Enter the number of hours worked: ");       

        if (input.hasNextDouble()) {
        double hoursWorked = input.nextDouble();

        if (hoursWorked >= 0) {
                calculateGross(hoursWorked);
            } else {
                System.out.println("Error: Hours worked cannot be negative.");
            }
            } else {
            System.out.println("Invalid input. Please enter a numeric value.");
        }

        input.close();
    }
    
    public static void calculateGross(double hours) {
        final double HOURLY_RATE = 22.75;
        double grossPay = hours * HOURLY_RATE;
        System.out.printf("The gross pay for %.2f hours worked is $%.2f%n", hours, grossPay);
    }
}

