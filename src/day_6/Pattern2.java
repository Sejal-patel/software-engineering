package day_6;

public class Pattern2 {

    public static void main(String args[]) {
        // Pattern 2
        // *
        // **
        // ***
        // ****

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }

    }
    
}
