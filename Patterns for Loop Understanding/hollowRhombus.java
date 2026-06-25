import java.util.*;
public class hollowRhombus {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines for the hollow rhombus: ");
        int n = scanner.nextInt();

        for(int line = 1; line <= n; line++){
            // Print leading spaces to align the rhombus.
            for(int space = 1; space <= n - line; space++){
                System.out.print(" ");
            }
            
            if(line == 1 || line == n){
                // First and last lines are filled with stars.
                for(int star = 1; star <= n; star++){
                    System.out.print("*");
                }
            }

            else{
                // Middle lines have stars only at the rhombus edges.
                for(int star = 1; star <= n; star++){
                    if(star == 1 || star == n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");

                    }
                }
            }
            System.out.println();
        }

        // Close the scanner to release resources.
        scanner.close();
    }
}