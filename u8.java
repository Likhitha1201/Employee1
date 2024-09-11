import java.util.ArrayList;
import java.util.List;

class Wage {
    private double dailyWage;
    private double totalWage;

    // Constructor
    public Wage(double dailyWage, double totalWage) {
        this.dailyWage = dailyWage;
        this.totalWage = totalWage;
    }

    // Getter for daily wage
    public double getDailyWage() {
        return dailyWage;
    }

    // Getter for total wage
    public double getTotalWage() {
        return totalWage;
    }

    // Setter for total wage
    public void setTotalWage(double totalWage) {
        this.totalWage = totalWage;
    }

    @Override
    public String toString() {
        return "Daily Wage: " + dailyWage + ", Total Wage: " + totalWage;
    }
}

public class WageCalculator {

    private List<Wage> wageList = new ArrayList<>();
    private double totalWage = 0.0;

    // Method to calculate and store the daily wage
    public void addDailyWage(double hoursWorked, double wagePerHour) {
        double dailyWage = hoursWorked * wagePerHour;
        totalWage += dailyWage; // Accumulate total wage
        Wage wage = new Wage(dailyWage, totalWage);
        wageList.add(wage); // Store daily wage along with total wage
    }

    // Method to display all wages
    public void displayWages() {
        for (Wage wage : wageList) {
            System.out.println(wage);
        }
    }

    public static void main(String[] args) {
        WageCalculator wageCalculator = new WageCalculator();

        // Adding daily wages
        wageCalculator.addDailyWage(8, 15.0); // 8 hours worked, $15 per hour
        wageCalculator.addDailyWage(7.5, 15.0); // 7.5 hours worked, $15 per hour
        wageCalculator.addDailyWage(6, 15.0); // 6 hours worked, $15 per hour

        // Display all stored wages
        wageCalculator.displayWages();
    }
}
