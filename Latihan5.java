import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input

        int bilA = input.nextInt();
        int bilB = input.nextInt();
        int bilC = input.nextInt();

        
        // Proses
        int t;
        
        if (bilA > bilB) { t = bilA; bilA = bilB; bilB = t; } 
        if (bilA > bilC) { t = bilA; bilA = bilC; bilC = t;} 
        if (bilB > bilC) { t = bilB; bilB = bilC; bilC = t; }
        // Output
        
        System.out.printf("%d,%d,%d", bilA, bilB, bilC);
    }
}