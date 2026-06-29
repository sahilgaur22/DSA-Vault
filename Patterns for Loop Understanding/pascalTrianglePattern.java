import java.math.BigInteger;
import java.util.Scanner;

public class pascalTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            printPascalsTriangle(n);
        }
        sc.close();
    }

    public static void printPascalsTriangle(int n) {
        // Iterate through every row
        for (int i = 0; i < n; i++) {
            
            // The first element of every row is always 1
            BigInteger val = BigInteger.ONE;
            
            // Iterate through every column in the current row
            for (int j = 0; j <= i; j++) {
                // Print the current value followed by a tab separator
                System.out.print(val + "\t");
                
                // Calculate the next value in the row using the combinatorial formula:
                // next_val = current_val * (i - j) / (j + 1)
                BigInteger numerator = BigInteger.valueOf(i - j);
                BigInteger denominator = BigInteger.valueOf(j + 1);
                
                val = val.multiply(numerator).divide(denominator);
            }
            
            // Move to the next line after finishing the row
            System.out.println();
        }
    }
}