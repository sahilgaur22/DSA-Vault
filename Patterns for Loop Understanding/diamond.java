import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of Diamond: ");
        int n = scanner.nextInt();

        // Upper half of the diamond including the middle line
        for (int line = 1; line <= n; line++) {
            // Print leading spaces to center the stars for this line
            for (int space = 1; space <= n - line; space++)
                System.out.print(" ");

            // Print the stars with a trailing space for visual separation
            for (int star = 1; star <= line; star++)
                System.out.print("* ");

            // Move to the next line after printing the current line
            System.out.println();
        }

        // Lower half of the diamond, excluding the middle line already printed
        for (int line = 2; line <= n; line++) {
            // Print leading spaces to keep the lower part centered
            for (int space = 1; space <= line - 1; space++)
                System.out.print(" ");

            // Print the decreasing number of stars for the lower part
            for (int star = 1; star <= n - line + 1; star++)
                System.out.print("* ");

            // Move to the next line after printing the current line
            System.out.println();
        }
    }
}
