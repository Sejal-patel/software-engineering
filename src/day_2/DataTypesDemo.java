package day_2;

public class DataTypesDemo {
    
    public static void main(String[] args) {

        byte b = 127;
        b++;
        System.out.println("byte b = 127 after b++: " + b); // This will overflow and wrap around to -128

        int a = 10;
        double d = a;
        System.out.println("Integer value: " + a);
        System.out.println("Double value (after widening): " + d);

        long l = 1000000000000L;
        float f = l;
        System.out.println("Long value: " + l);
        System.out.println("Float value (after widening): " + f);

        double d2 = 3.14;
        int a2 = (int) d2;
        System.out.println("Double value: " + d2);
        System.out.println("Integer value (after narrowing): " + a2);

        char c = 'A';
        int asciiValue = c;
        System.out.println("Character value: " + c);
        System.out.println("ASCII value of character: " + asciiValue);

        int i = 100;
        char c2 = (char) i;
        char c3 = (char) (i + 1);
        System.out.println("Integer value: " + i);
        System.out.println("Character value (after narrowing): " + c2);
        System.out.println("Next character value: " + c3);

        double d3 = 123.456;
        // long l2 = d3; // This will cause a compilation error due to incompatible types
        System.out.println("Double value: " + d3);

    }
}
