import java.util.Scanner;

public class doubleSidedArrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the double-sided arrow (odd integer): ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            printDoubleSidedArrow(n);
        }
        sc.close();
    }

    public static void printDoubleSidedArrow(int n) {
        // Double Sided Arrow starts with aggressive padding
        // For N=7, starts with 6 outer space blocks
        int outerSpaces = n - 1; 
        int innerSpaces = -1;    
        int val = 1;             

        for (int r = 1; r <= n; r++) {
            
            // 1. Print Outer Spaces
            for (int i = 1; i <= outerSpaces; i++) {
                System.out.print("  "); // Two spaces representing one empty block
            }

            // 2. Print Left Numbers (counting down from 'val' to 1)
            for (int i = val; i >= 1; i--) {
                System.out.print(i + " ");
            }

            // 3. Print Inner Spaces
            for (int i = 1; i <= innerSpaces; i++) {
                System.out.print("  "); 
            }

            // 4. Print Right Numbers (counting up from 1 to 'val')
            // We skip this entirely for the very first and very last rows
            if (r != 1 && r != n) {
                for (int i = 1; i <= val; i++) {
                    System.out.print(i + " ");
                }
            }

            // Move to the next row
            System.out.println();

            // 5. Update state variables for the next row
            if (r <= n / 2) {
                // Top half of the arrow (Growing)
                // Notice outerSpaces decreases by 2, creating the steep arrow slope
                outerSpaces -= 2;
                innerSpaces += 2;
                val++;
            } else {
                // Bottom half of the arrow (Shrinking)
                outerSpaces += 2;
                innerSpaces -= 2;
                val--;
            }
        }
    }
}