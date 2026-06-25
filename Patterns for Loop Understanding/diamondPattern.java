import java.util.Scanner;

public class diamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows (odd number): ");
        int n = sc.nextInt();

        int stars = 1;
        int spaces = n / 2;

        for (int i = 1; i <= n; i++) {

            // Print leading spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  "); // Two spaces
            }

            // Print stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }

            System.out.println();

            // Update values for next row
            if (i <= n / 2) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }
        }

        sc.close();
    }
}