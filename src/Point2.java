public class Point2 extends Point{
    private int z;

    public Point2(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public int length(Point2 p2) {
        int lenX = p2.getX() - this.getX();
        int lenY = p2.getY() - this.getY();
        int lenZ = p2.z - this.z;
        double res = Math.sqrt(lenX * lenX + lenY * lenY + lenZ * lenZ);
        return (int) res;
    }

    @Override
    public String toString() {
        return "{" + getX() + ";" + getY() + ";" + z + "}";
    }
}
