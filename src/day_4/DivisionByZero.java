package day_4;

public class DivisionByZero {
    
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            int result = numerator / denominator; // This will throw an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero. " + e.getMessage());
        }

        double doubleDenominator = 0.0;
        double doubleResult = numerator / doubleDenominator; // This will result in Infinity
        System.out.println("Double Result: " + doubleResult);

        // Why does dividing by zero behave differently for integers and floating-point numbers in Java?
        // In Java, dividing an integer by zero throws an ArithmeticException because it is undefined behavior
        // for integers. However, dividing a floating-point number by zero does not throw an exception; instead, it results in positive or negative infinity (or NaN if the numerator is also zero) according to the IEEE 754 standard for floating-point arithmetic. This is because floating-point arithmetic is designed to handle such cases gracefully, while integer arithmetic does not have a defined result for division by zero.
    }
}
