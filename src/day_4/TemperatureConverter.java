package day_4;
import java.util.Scanner;

public class TemperatureConverter {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius:");
        double celsius = sc.nextDouble();

        double fahrenheit = (9.0/5.0) * celsius + 32;
        System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit.%n", celsius, fahrenheit);

        sc.close();
    }
}
