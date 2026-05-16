package day_3;

public class ExpressionDemo {

    public static void main(String[] args) {

        int x = 10;

        int y = x++ + ++x;

        System.out.println(y);
        System.out.println(x);

        int a = 5;
        int b = 5;

        System.out.println(a == b);

        String s1 = new String("Java");
        String s2 = new String("Java");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}