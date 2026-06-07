package day_6;

public class ForLoop1 {

    public static void main(String[] args) {
        // A for loop is a control flow statement that allows you to execute a block of code repeatedly for a specified number of times. The syntax of a for loop in Java is as follows:

        // for (initialization; condition; update) {
        //     // code to be executed
        // }

        // The for loop consists of three parts: initialization, condition, and update. The initialization is executed only once at the beginning of the loop. The condition is evaluated before each iteration, and if it is true, the code block inside the loop is executed. After the code block is executed, the update is performed, and the condition is evaluated again. This process continues until the condition becomes false.

        // Here's an example of a for loop that prints numbers from 1 to 5:

        for (int i = 1; i <= 5; i++) { // Initialization: int i = 1; Condition: i <= 5; Update: i++
            System.out.println(i); // Print the current value of i
        }

        // below loop execution flow
        // i = 1, 1<=5, prints 1, 1+2, 3++, 4<=5, prints 4, 4+2, 6++, 7<=5 is false hence exits the loop

        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            i += 2;
        }

        for(int i = 1; i <= 5; i++) {

            if(i == 3) {
                break;
            }

            System.out.println(i);
        }

        for(int i = 1; i <= 5; i++) {

            if(i == 3) {
                continue;
            }

            System.out.println(i);
        }

        
    }
    
}
