public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = new Point(p1.getX(), p1.getY());
        this.p2 = new Point(p2.getX(), p2.getY());
    }

    public Line(int x1, int y1, int x2, int y2) {
       this(new Point(x1,y1), new Point(x2, y2));
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP1(Point p1) {
        this.p1 = new Point(p1.getX(), p1.getY());
    }

    public void setP2(Point p2) {
        this.p2 = new Point(p2.getX(), p2.getY());
    }

    public double length() {
        return p1.length(p2);
    }

    public String toString() {
        return "Line from " + p1 + " to " + p2;
    }
}
