import java.util.ArrayList;
import java.util.List;

class Wage {
    private int day;
    private double dailyWage;
    private double totalWage;

    // Constructor
    public Wage(int day, double dailyWage, double totalWage) {
        this.day = day;
        this.dailyWage = dailyWage;
        this.totalWage = totalWage;
    }

    // Getter for the day
    public int getDay() {
        return day;
    }

    // Getter for daily wage
    public double getDailyWage() {
        return dailyWage;
    }

    // Getter for total wage
    public double getTotalWage() {
        return totalWage;
    }

    @Override
    public String toString() {
        return "Day: " + day + ", Daily Wage: " + dailyWage + ", Total Wage: " + totalWage;
    }
}

public class WageCalculator {

    private List<Wage> wageList = new ArrayList<>();
    private double totalWage = 0.0;

    // Method to calculate and store the daily wage with the day
    public void addDailyWage(int day, double hoursWorked, double wagePerHour) {
        double dailyWage = hoursWorked * wagePerHour;
        totalWage += dailyWage; // Accumulate total wage
        Wage wage = new Wage(day, dailyWage, totalWage);
        wageList.add(wage); // Store day, daily wage, and total wage
    }

    // Method to display all wages
    public void displayWages() {
        for (Wage wage : wageList) {
            System.out.println(wage);
        }
    }

    public static void main(String[] args) {
        WageCalculator wageCalculator = new WageCalculator();

        // Adding daily wages with the corresponding day
        wageCalculator.addDailyWage(1, 8, 15.0);   // Day 1, 8 hours worked, $15 per hour
        wageCalculator.addDailyWage(2, 7.5, 15.0); // Day 2, 7.5 hours worked, $15 per hour
        wageCalculator.addDailyWage(3, 6, 15.0);   // Day 3, 6 hours worked, $15 per hour

        // Display all stored wages
        wageCalculator.displayWages();
    }
}
