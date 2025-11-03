package JavaCoreHW6;

class RectangleArea {
    private int x1, y1, x2, y2;

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

    public RectangleArea(int[] coords) {
        this.x1 = coords[0];
        this.y1 = coords[1];
        this.x2 = coords[2];
        this.y2 = coords[3];
    }
    public int getArea() {
        int width = Math.abs(x2 - x1);
        int height = Math.abs(y2 - y1);
        return width * height;
    }
}

class RectangleAreaTest {
    public static void main(String[] args) {
        int[] coords = {2, 2, 12, 12};

        //Expect 100
        System.out.println(new RectangleArea(coords).getArea());
    }
}