public class Square {
    private Point leftCorner;
    private int side;

    public Square(Point leftCorner, int side) {
        this.leftCorner = leftCorner;
        setSide(side);
    }

    public Square(int x, int y, int side) {
       this(new Point(x, y), side);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side<0){
            throw new IllegalArgumentException("side can't be < 0!");
        }
        this.side = side;
    }

    public String toString() {
        return String.format("Квадрат в точке %s со стороной %d", leftCorner,side);
    }

    public BrokenLine newSquare(){
        Point topR = new Point(leftCorner.getX() + side, leftCorner.getY());
        Point downR = new Point(topR.getX(), topR.getY()-side);
        Point downL = new Point(leftCorner.getX(), leftCorner.getY() - side);
        BrokenLine square = new BrokenLine(leftCorner,topR,downR,downL);
        return square;
    }
}
