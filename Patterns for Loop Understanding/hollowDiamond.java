import java.util.*;
public class hollowDiamond {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the hollow diamond: ");
        int n = scanner.nextInt();

        // Read the number of rows for the diamond and build the top half.
        // The top line is a solid row of stars; subsequent lines have hollow space.
        for(int line = n; line >= 1; line--){
            if(line == n){
                for(int star = 1; star <= 2 * n - 1; star++){
                    System.out.print("*");
                }
            }
            else{
                // Print the left edge stars
                for(int star = 1; star <= line; star++){
                    System.out.print("*");
                }
                // Print the hollow interior space
                for(int space = 1; space <= 2 * (n - line) - 1; space++){
                    System.out.print(" ");
                }
                // Print the right edge stars
                for(int star = 1; star <= line; star++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // Build the bottom half of the hollow diamond, avoiding duplicate middle row.
        for(int line = 2; line <= n; line++){
            if(line == n){
                for(int star = 1; star <= 2 * n - 1; star++){
                    System.out.print("*");
                }
            }
            else{
                // Print the left edge stars
                for(int star = 1; star <= line; star++){
                    System.out.print("*");
                }
                // Print the hollow interior space
                for(int space = 1; space <= 2 * (n - line) - 1; space++){
                    System.out.print(" ");
                }
                // Print the right edge stars
                for(int star = 1; star <= line; star++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        
        // Close scanner to release the input resource.
        scanner.close();
    }
}