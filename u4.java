import java.util.Scanner;

public class CalculatorSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input numbers
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Input operator
        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        // Switch case to perform calculation
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error! Division by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }

        scanner.close();
    }
}
