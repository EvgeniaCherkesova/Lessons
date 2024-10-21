public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int length(Point p2) {
        int lenX = p2.x - this.x;
        int lenY = p2.y - this.y;
        double res = Math.sqrt(lenX * lenX + lenY * lenY);
        return (int) res;
    }

    public String toString() {
        return "{" + x + ";" + y + "}";
    }
}
