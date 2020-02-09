// File: Point.java
public class Point {
    private int x;
    private int y;

    // Convenience -> Designated -> Setter | C -> D -> S

    // Convenience ctor
    public Point() {
        this(0, 0);
    }

    // Designated ctor
    public Point(final int x, final int y) {
        setX(x);
        setY(y);
    }

    // Getter
    public int getX() {
        return x;
    }

    // Setter
    public void setX(final int x) {
        this.x = x;
    }

    // Getter
    public int getY() {
        return y;
    }

    // Setter
    public void setY(final int y) {
        this.y = y;
    }

    public String getQuandrant() {
        if (x > 0 && y > 0) {
            // quad 1
            return "Quandrant I";
        } else if (x < 0 && y > 0) {
            // quad 2
            return "Quandrant II";
        } else if (x < 0 && y < 0) {
            // quad 3
            return "Quandrant III";
        } else if (x > 0 && y < 0) {
            // quad 4
            return "Quandrant IV";
        } else if (x == 0) {
            if (y == 0) {
                return "On the origin";
            } else {
                return "On the x-axis";
            }
        } else {
            return "On the y-axis";
        }
    }

    @Override
    public String toString() {
        final String str = String.format("(%d, %d)", x, y);
        return str;
    }
}