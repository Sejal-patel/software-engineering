package day_4;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        // Scanner is a class in Java that is used to read input from various sources, such as the keyboard, files, or other input streams. It provides methods to parse and retrieve different types of data, such as strings, integers, and doubles.

        // To use the Scanner class, you need to import it from the java.util package. Here's an example of how to use Scanner to read input from the keyboard:

        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read an integer input from the user
        System.out.println("You entered: " + age);

        // Prompt the user for input
        System.out.print("Enter your name: ");

        // Read a string input from the user
        String name = scanner.nextLine();

        // Display the input back to the user
        System.out.println("Hello, " + name + "!");

        // Close the scanner
        scanner.close();
    }
    
}
