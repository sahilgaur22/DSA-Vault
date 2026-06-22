
import java.util.Scanner;

public class inverted_Triangle_rightAligned {
    public static void main(String[] args) {
        // int i = 1;
        // while(i<=5){
        //     int j=5;
        //     while(j>=i){
        //         System.out.print("*");
        //         j--;
        //     }
        //     System.out.println("");
        //     i++;
        // }
        
        Scanner Myinput = new Scanner(System.in);
        System.out.print("Enter the number of lines ");
        int n = Myinput.nextInt();

        for(int line = 1; line<=n; line++){
            for(int star=1; star <= n-line+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
