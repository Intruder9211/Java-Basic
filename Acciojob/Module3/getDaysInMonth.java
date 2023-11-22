import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the month number from the user
        //System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        // Validate the input
        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Please enter a number between 1 and 12.");
        } else {
            // Calculate the number of days in the month
            int daysInMonth = getDaysInMonth(month);
            System.out.println( daysInMonth);
        }

        // Close the scanner
        scanner.close();
    }

    // Function to calculate the number of days in a month
    public static int getDaysInMonth(int month) {
        switch (month) {
            case 2: // February
                return 28;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                return 30;
            default:
                return 31;
        }
    }

}
