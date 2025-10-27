import java.util.Scanner;

public class AccountInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter initial bank balance > ");
        double initialBalance = input.nextDouble();
        
        double[] interestRates = {0.02, 0.03, 0.04, 0.05};
        
        for (int i = 0; i < interestRates.length; i++) {
            double balance = initialBalance;
            System.out.println("\nWith an initial balance of $" + initialBalance + 
                             " at an interest rate of " + interestRates[i]);
            
            for (int year = 1; year <= 4; year++) {
                balance = balance * (1 + interestRates[i]);
                System.out.println("After year " + year + " balance is $" + balance);
            }
        }
      
        input.close();
    }
}
