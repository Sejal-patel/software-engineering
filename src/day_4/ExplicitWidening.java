package day_4;

public class ExplicitWidening {
    public static void main(String[] args) {
        // Without Explicit Widening, JVM truncates the decimal part and only assigns the whole number to the variable. This can lead to loss of precision and incorrect results. For example:
        double d = 9/5; // This will result in 1.0 instead of 1.8 because both 9 and 5 are integers
        System.out.println("Without explicit widening: " + d); // Output: 1.0

        // Explicit widening, also known as type casting, is the process of converting a smaller data type to a larger data type in Java. This is done when you want to assign a value of a smaller type to a variable of a larger type. The syntax for explicit widening is as follows:

        // largerType variableName = (largerType) smallerTypeValue;

        // Here are some examples of explicit widening:

        // Example 1: Converting an int to a long
        int intValue = 100;
        long longValue = (long) intValue; // Explicitly widening int to long
        System.out.println("Int value: " + intValue);
        System.out.println("Long value: " + longValue);

        // Example 2: Converting a float to a double
        float floatValue = 3.14f;
        double doubleValue = (double) floatValue; // Explicitly widening float to double
        System.out.println("Float value: " + floatValue);
        System.out.println("Double value: " + doubleValue);

        // Example 3: Converting a char to an int
        char charValue = 'A';
        int asciiValue = (int) charValue; // Explicitly widening char to int
        System.out.println("Char value: " + charValue);
        System.out.println("ASCII value: " + asciiValue);

        // what happens if we assign char to int without explicit widening?
        int asciiValueWithoutWidening = charValue; // This will work because char can be implicitly widened to int
        System.out.println("ASCII value without explicit widening: " + asciiValueWithoutWidening);

        // similary, byte and short can also be implicitly widened to int, but if we want to assign them to long or double, we need explicit widening.
        byte byteValue = 10;
        long longValueFromByte = (long) byteValue; // Explicitly widening byte to long
        System.out.println("Byte value: " + byteValue);
        System.out.println("Long value from byte: " + longValueFromByte);
    }
}
