public class EmployeeCheck {

    public static void main(String[] args) {
        // Create an instance of Random class
        Random random = new Random();

        // Generate a random number, 0 or 1
        int attendance = random.nextInt(2); // Generates 0 or 1

        // Check if the employee is present or absent
        if (attendance == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
