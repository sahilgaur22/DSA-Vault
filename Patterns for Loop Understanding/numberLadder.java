import java.util.Scanner;

public class numberLadder {
    public static void main(String[] args) {

        // Create Scanner object to read input
        System.out.print("Enter the number of rows for the ladder: ");
        Scanner sc = new Scanner(System.in);

        // Read the number of rows
        int N = sc.nextInt();

        // Variable to keep track of the current number to print
        int currentNumber = 1;

        // Loop through each row
        for (int row = 1; row <= N; row++) {

            // Print 'row' numbers in the current row
            for (int col = 1; col <= row; col++) {
                System.out.print(currentNumber + "\t");
                currentNumber++; // Move to the next number
            }

            // Move to the next line after completing the current row
            System.out.println();
        }

        // Close the Scanner
        sc.close();
    }
}