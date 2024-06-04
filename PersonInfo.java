import java.util.Scanner;

public class PersonInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collecting first name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        // Collecting last name
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // Collecting gender
        System.out.print("Enter your gender (M/F): ");
        String gender = scanner.nextLine();

        // Printing the collected information
        System.out.println("\nCollected Information:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Gender: " + gender);

        scanner.close();
    }
}