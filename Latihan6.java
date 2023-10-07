import java.util.Scanner;
 
public class Latihan6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        
        // Proses

        int hasil1 = x2 - (x1);
        int hasil2 = y2 - (y1);
        
        // Output

        System.out.println((hasil1 + hasil2));

    }
}