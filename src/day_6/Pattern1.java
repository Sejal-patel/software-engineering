package day_6;

public class Pattern1 {

    public static void main(String[] args) {
        // Pattern 1
        // ***
        // ***
        // ***

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    
}
