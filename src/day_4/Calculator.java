package day_4;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        double a = sc.nextDouble();

        System.out.println("Enter second number:");
        double b = sc.nextDouble();

        double sum = a + b;
        double diff = a - b;
        double product = a * b;
        double division = a / b;

        System.out.printf("Sum = %.2f%n", sum);
        System.out.printf("Difference = %.2f%n", diff);
        System.out.printf("Product = %.2f%n", product);
        System.out.printf("Division = %.2f%n", division);

        sc.close();
    }
}