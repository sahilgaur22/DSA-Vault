import java.util.Scanner;

public class hollowHorizontalDiamond {

    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Read the height of the hollow horizontal diamond
        System.out.print("Enter the height for the hollow horizontal diamond: ");
        int n = sc.nextInt();

        // Calculate the middle row of the pattern
        int mid = n / 2;

        // Loop through each row
        for (int i = 0; i < n; i++) {

            // Loop through each column
            for (int j = 0; j < n; j++) {

                // Print a full row of stars at the top and bottom
                if (i == 0 || i == n - 1) {
                    System.out.print("*\t");
                }

                // Upper half of the diamond (excluding the middle row)
                else if (i < mid) {

                    // Print stars on the left and right boundaries
                    if (j <= mid - i || j >= n - (mid - i) - 1)
                        System.out.print("*\t");
                    else
                        System.out.print("\t"); // Hollow space
                }

                // Middle row: print stars only at the first and last columns
                else if (i == mid) {

                    if (j == 0 || j == n - 1)
                        System.out.print("*\t");
                    else
                        System.out.print("\t"); // Hollow space
                }

                // Lower half of the diamond
                else {

                    // Print stars on the left and right boundaries
                    if (j <= i - mid || j >= n - (i - mid) - 1)
                        System.out.print("*\t");
                    else
                        System.out.print("\t"); // Hollow space
                }
            }

            // Move to the next line after printing one row
            System.out.println();
        }

        // Close the Scanner to release system resources
        sc.close();
    }
}