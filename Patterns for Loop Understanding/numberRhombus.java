import java.util.Scanner;

public class numberRhombus {
    public static void main(String[] args) {

        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read the value of N
        System.out.print("Enter the number of rows for the rhombus: ");
        int N = sc.nextInt();

        // ---------------- Upper Half (including middle row) ----------------
        for (int row = 1; row <= N; row++) {

            // Print leading tabs to center the pattern
            for (int space = 1; space <= N - row; space++) {
                System.out.print("\t");
            }

            // Print increasing numbers
            for (int num = row; num <= (2 * row - 1); num++) {
                System.out.print(num + "\t");
            }

            // Print decreasing numbers
            for (int num = (2 * row - 2); num >= row; num--) {
                System.out.print(num + "\t");
            }

            // Move to the next line
            System.out.println();
        }

        // ---------------- Lower Half ----------------
        for (int row = N - 1; row >= 1; row--) {

            // Print leading tabs to center the pattern
            for (int space = 1; space <= N - row; space++) {
                System.out.print("\t");
            }

            // Print increasing numbers
            for (int num = row; num <= (2 * row - 1); num++) {
                System.out.print(num + "\t");
            }

            // Print decreasing numbers
            for (int num = (2 * row - 2); num >= row; num--) {
                System.out.print(num + "\t");
            }

            // Move to the next line
            System.out.println();
        }

        // Close the Scanner
        sc.close();
    }
}