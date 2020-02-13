
/**
 * main
 */
public class Main {
    public static void main(String[] args) {
        Point p0 = new Point();
        Point p1 = new Point(2, 2);
        Point p2 = new Point(-2, 2);
        Point p3 = new Point(-2, -2);
        Point p4 = new Point(2, -2);
        Point px = new Point(2, 0);
        Point py = new Point(0, 2);

        System.out.printf("p0 = %s, %s%n", p0, p0.getQuandrant());
        System.out.printf("p1 = %s, %s%n", p1, p1.getQuandrant());
        System.out.printf("p2 = %s, %s%n", p2, p2.getQuandrant());
        System.out.printf("p3 = %s, %s%n", p3, p3.getQuandrant());
        System.out.printf("p4 = %s, %s%n", p4, p4.getQuandrant());
        System.out.printf("px = %s, %s%n", px, px.getQuandrant());
        System.out.printf("py = %s, %s%n", py, py.getQuandrant());
    }
}