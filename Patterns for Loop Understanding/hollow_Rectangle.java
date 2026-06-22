import java.util.Scanner;

public class hollow_Rectangle {
    public static void main(String[] args) {

        // Create a Scanner object to read user input from the keyboard
        Scanner myInput = new Scanner(System.in);

        // Ask the user for the rectangle's width (number of columns)
        System.out.print("Enter the width: ");
        int m = myInput.nextInt();

        // Ask the user for the rectangle's length/height (number of rows)
        System.out.print("Enter the length: ");
        int n = myInput.nextInt();

        /*
         * Outer loop controls the rows of the rectangle.
         * It runs from row 1 to row n.
         */
        for(int line = 1; line <= n; line++){

            /*
             * The first and last rows are completely filled with '*'
             * to form the top and bottom borders of the hollow rectangle.
             */
            if(line == 1 || line == n){

                // Print m stars in the current border row
                for(int star = 1; star <= m; star++){
                    System.out.print("*");
                }

            }
            else{

                /*
                 * For the middle rows:
                 * - Print a star at the beginning (left border)
                 * - Print spaces inside the rectangle
                 * - Print a star at the end (right border)
                 */

                // Left border
                System.out.print("*");

                // Print the hollow space between the two borders
                for(int space = 1; space <= (m-2); space++){
                    System.out.print(" ");
                }
                
                // Right border
                System.out.print("*");
            }

            // Move to the next line after completing the current row
            System.out.println();
        }
        // Close the Scanner to free system resources
        myInput.close();
    }
}
