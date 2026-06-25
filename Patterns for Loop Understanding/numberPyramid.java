import java.util.*;
public class numberPyramid {
    public static void main(String args[]) {
        // Read the height of the number pyramid from standard input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the Triangle: ");
        int n = scanner.nextInt();

        // Print each line of the number pyramid
        for(int line = 1; line <= n; line++){
            // Print leading spaces to center the numbers
            for(int space = 1; space <= n - line; space++){
                System.out.print("  ");
            }

            // Incrementing numbers from current line number to the peak
            for(int numInc = line; numInc <= 2 * line - 1; numInc++){
                System.out.print(numInc + " ");
            }

            // Decrementing numbers from the peak back down to the current line number
            for(int numDec = 2 * line - 2; numDec >= line; numDec--){
                System.out.print(numDec + " ");
            }

            System.out.println();
        }

        // Close the scanner to release the underlying input resource
        scanner.close();
    }
}