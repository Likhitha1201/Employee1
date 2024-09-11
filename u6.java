import java.util.Scanner;

public class WageCalculatorWithConditions {
    public static void main(String[] args) {
        // Constants
        final int MAX_WORKING_DAYS = 20;
        final int MAX_WORKING_HOURS = 100;

        // Variables
        double dailyWage, totalWage = 0;
        int totalDaysWorked = 0, totalHoursWorked = 0;

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get the daily wage input from the user
        System.out.print("Enter daily wage: ");
        dailyWage = scanner.nextDouble();

        while (totalDaysWorked < MAX_WORKING_DAYS && totalHoursWorked < MAX_WORKING_HOURS) {
            // Ask for hours worked for the day
            System.out.print("Enter hours worked for day " + (totalDaysWorked + 1) + ": ");
            int hoursWorkedToday = scanner.nextInt();

            // Check if adding today's hours exceeds 100 hours
            if (totalHoursWorked + hoursWorkedToday > MAX_WORKING_HOURS) {
                hoursWorkedToday = MAX_WORKING_HOURS - totalHoursWorked;  // Limit to max hours
            }

            // Update total hours and days worked
            totalHoursWorked += hoursWorkedToday;
            totalDaysWorked++;

            // Calculate wage for the day and add to total wage
            double wageForToday = (dailyWage / 8) * hoursWorkedToday; // Assuming 8 hours as full work day
            totalWage += wageForToday;

            // Break if max working hours reached
            if (totalHoursWorked >= MAX_WORKING_HOURS) {
                break;
            }
        }

        // Display the results
        System.out.println("Total working days: " + totalDaysWorked);
        System.out.println("Total working hours: " + totalHoursWorked);
        System.out.println("Total wage for the month: " + totalWage);

        // Close the scanner
        scanner.close();
    }
}
