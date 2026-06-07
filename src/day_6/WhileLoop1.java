package day_6;

public class WhileLoop1 {
    public static void main(String[] args) {
        // A while loop is a control flow statement that allows you to execute a block of code repeatedly as long as a specified condition is true. The syntax of a while loop in Java is as follows:

        // while (condition) {
        //     // code to be executed
        // }

        // The condition is evaluated before each iteration of the loop. If the condition is true, the code block inside the loop is executed. After the code block is executed, the condition is evaluated again. This process continues until the condition becomes false.

        // Here's an example of a while loop that prints numbers from 1 to 5:

        int i = 1; // Initialize the counter variable
        while (i <= 5) { // Condition to check if i is less than or equal to 5
            System.out.println(i); // Print the current value of i
            i++; // Increment the counter variable
        }

        // Infinite loop
        // int j = 1;
        // while(j <= 5) {
        //     System.out.println(j);
        // }

        
    }
    
}
