/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(min(1,3));
        System.out.println(min(1.2,-3.8));
        System.out.println(min(new Integer(1),new Integer(-2)));
    }

    public static <T extends Comparable<T>> T min(T v1, T v2) {
        return v1.compareTo(v2) < 0 ? v1 : v2;
    }
}