import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        switch (age) {
            case 28:
                System.out.println("I am young.");
                break;
            default:
                System.out.println("I am not young.");
        }

        scanner.close();
    }
}
