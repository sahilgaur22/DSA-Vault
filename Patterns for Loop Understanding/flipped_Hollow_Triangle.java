import java.util.Scanner;

public class flipped_Hollow_Triangle {
    public static void main(String[] args) {
        // Create scanner to read user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of Triangle: ");
        int n = scanner.nextInt();

        // Iterate from n down to 1 to create inverted triangle pattern
        for(int line=n; line>=1; line--){
            // Print leading spaces to align the triangle properly
            for(int space=1; space<=n-line; space++)
                System.out.print(" ");

            // Handle top row (n) and bottom row (1) - print solid line
            if (line == 1 || line == n) {
                for(int star=1; star<=line; star++)
                    System.out.print("* ");
            }
            // Handle middle rows (2 to n-1) - print hollow triangle
            else{
                System.out.print("*");
                // Print spaces between the two stars
                for(int space=1; space<=2*line-3; space++)
                    System.out.print(" ");
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    
}
