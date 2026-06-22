import java.util.Scanner;

public class inverted_Triangle_leftAligned {
    public static void main(String[] args) {
       
        // Camel Casing for Object names
        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = myInput.nextInt();

        for(int line = 1; line <=n; line++){
            // TODO: l-1 spaces -> variable -> use loop
            for(int space=1; space <= line-1; space++){
                System.out.print(" ");
            }
            // TODO: n-1+1 stars
            for(int star=1; star <= n-line+1; star++){
                System.out.print("*");
            }
            // TODO: 1 new line
            System.out.println();
        }

    }
}
