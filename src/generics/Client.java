package generics;

public class Client {
    public static void main(String[] args) {
        Pair pair = new Pair(1, 2);
        System.out.println(pair.getX());
        System.out.println(pair.getY());

        Pair pair2 = new Pair("ABC", 4.3);
        System.out.println(pair2.getX());
        System.out.println(pair2.getY());


    }
}
