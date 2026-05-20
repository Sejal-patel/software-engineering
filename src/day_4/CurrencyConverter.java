package day_4;
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double exchangeRate = 83.0;

        System.out.println("Enter amount in USD:");
        double usd = sc.nextDouble();

        double inr = usd * exchangeRate;
        System.out.println("%.2f USD is equal to %.2f INR.%n".formatted(usd, inr));

        sc.close();
    }
    
}
