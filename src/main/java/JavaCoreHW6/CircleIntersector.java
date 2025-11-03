package JavaCoreHW6;

class CircleIntersector {
    private int x1, y1, r1, x2, y2, r2;

    public int getX1() {
        return x1;
    }
    public void setX1(int x1) {
        this.x1 = x1;
    }
    public int getY1() {
        return y1;
    }
    public void setY1(int y1) {
        this.y1 = y1;
    }
    public int getR1() {
        return r1;
    }
    public void setR1(int r1) {
        this.r1 = r1;
    }
    public int getX2() {
        return x2;
    }
    public void setX2(int x2) {
        this.x2 = x2;
    }
    public int getY2() {
        return y2;
    }
    public void setY2(int y2) {
        this.y2 = y2;
    }
    public int getR2() {
        return r2;
    }
    public void setR2(int r2) {
        this.r2 = r2;
    }

    public CircleIntersector(int x1, int y1, int r1, int x2, int y2, int r2) {
        this.x1 = x1;
        this.y1 = y1;
        this.r1 = r1;
        this.x2 = x2;
        this.y2 = y2;
        this.r2 = r2;
    }

    @Override
    public String toString() {
        int dx = x2 - x1;
        int dy = y2 - y1;
        int dSquared = dx * dx + dy * dy;
        int radius = r1 + r2;
        boolean result = dSquared <= radius * radius;
        return result ? "intersects" : "not intersects";
    }
}
class CircleIntersectorTest {
    public static void main(String[] args) {
        //intersects
        System.out.println(new CircleIntersector(0, 0, 2, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(0, 0, 1, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(5, 5, 2, 8, 8, 2));
    }
}