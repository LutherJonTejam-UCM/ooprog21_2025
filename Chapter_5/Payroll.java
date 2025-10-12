import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many hours did you work this week? ");
        double hours = input.nextDouble();

        System.out.print("What is your regular pay rate? ");
        double rate = input.nextDouble();

        Employee emp = new Employee(1, rate);

        double regularPay = emp.computeRegularPay(hours);
        double overtimePay = emp.computeOvertimePay(hours);

        System.out.println("Regular pay is " + regularPay);
        System.out.println("Overtime pay is " + overtimePay);

        input.close();
    }
}
