package day_3;

public class OperatorsDemo {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Arithmetic Operators
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        // Relational Operators
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal
        System.out.println("a > b: " + (a > b)); // Greater than
        System.out.println("a < b: " + (a < b)); // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        // Unary Operators
        int c = 5;
        System.out.println("c: " + c);
        System.out.println("++c: " + (++c)); // Pre-increment
        System.out.println("c++: " + (c++)); // Post-increment
        System.out.println("c: " + c);
        System.out.println("--c: " + (--c)); // Pre-decrement
        System.out.println("c--: " + (c--)); // Post-decrement
        System.out.println("c: " + c);

        // Assignment Operators
        int d = 10;
        d += 5; // d = d + 5
        System.out.println("d after += 5: " + d);
        d -= 3; // d = d - 3
        System.out.println("d after -= 3: " + d);
        d *= 2; // d = d * 2
        System.out.println("d after *= 2: " + d);
        d /= 4; // d = d / 4
        System.out.println("d after /= 4: " + d);
        d %= 3; // d = d % 3
        System.out.println("d after %= 3: " + d);

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x)); // Logical NOT

        // short-circuit evaluation
        System.out.println("x || (y = true): " + (x || (y = true))); // y is not evaluated
        System.out.println("y: " + y); // y remains false

        System.out.println("y && (x = false): " + (y && (x = false))); // x is not evaluated
        System.out.println("x: " + x); // x remains true

        System.out.println("a > 15 && ++a > 10: " + (a > 15 && ++a > 10)); // a is not incremented
        System.out.println("a: " + a); // a remains 10

        // Ternary Operator
        int max = (a > b) ? a : b; // If a is greater than b, max is a; otherwise, max is b
        System.out.println("Max of a and b: " + max);

        int u = 10;
        int v = u++ + ++u;
        System.out.println("u: " + u);
        System.out.println("v: " + v);

        
    }
}