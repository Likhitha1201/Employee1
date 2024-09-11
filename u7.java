import java.time.LocalTime;
import java.time.Duration;

public class WorkHours {

    public static void main(String[] args) {
        LocalTime startTime = LocalTime.of(9, 0); // Start time: 9:00 AM
        LocalTime endTime = LocalTime.of(17, 30); // End time: 5:30 PM

        // Calculate the duration between start and end time
        Duration duration = Duration.between(startTime, endTime);

        // Convert duration to hours and minutes
        long hours = duration.toHours();
        long minutes = duration.minusHours(hours).toMinutes();

        System.out.println("Worked for " + hours + " hours and " + minutes + " minutes.");
    }
}
