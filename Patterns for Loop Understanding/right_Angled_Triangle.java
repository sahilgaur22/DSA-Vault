import java.util.*;

public class right_Angled_Triangle {
    public static void main(String[] args) {
        // int i=1;
        // while(i<=5){
        //     int j=1;
        //     while(j<=i){
        //         System.out.print("*");
        //         j++;
        //     }
        //     System.out.println(); // make a half pyramid pattern
        //     i++;
        // }
        
        // Scanner MyInput = new Scanner(System.in); // Declaration + Initialization
        Scanner MyInput; // Declaration
        MyInput = new Scanner(System.in); // Initialization
        System.out.print("Enter the number of lines: "); // prompt for triangle height
        int n = MyInput.nextInt(); // read the number of lines from the user


        for(int line = 1; line <= n; line++){
            for (int star = 1 ; star <= line ;star++){ // To print stars of a particular line
                System.out.print("*");
            }
            System.out.println(); // move to the next row
        }
    }
}

