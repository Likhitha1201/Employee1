import java.util.Scanner;

public class WageCalculator {
    public static void main(String[] args) {
        // Constants
        final int WORKING_DAYS_PER_MONTH = 20;

        // Variables
        double dailyWage, monthlyWage;

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get the daily wage input from the user
        System.out.print("Enter daily wage: ");
        dailyWage = scanner.nextDouble();

        // Calculate monthly wage
        monthlyWage = dailyWage * WORKING_DAYS_PER_MONTH;

        // Display the result
        System.out.println("Monthly wage for 20 working days is: " + monthlyWage);

        // Close the scanner
        scanner.close();
    }
}
