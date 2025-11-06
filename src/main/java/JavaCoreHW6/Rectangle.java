package JavaCoreHW6;

class Rectangle {

    private final int width;
    private final int height;

    public Rectangle(int a, int b) {
        this.width = Math.min(a, b);
        this.height = Math.max(a, b);
    }

    public boolean canPlaceInto(Rectangle anotherRect) {
        int w1 = this.width;
        int h1 = this.height;
        int w2 = anotherRect.width;
        int h2 = anotherRect.height;

        if (w1 <= w2 && h1 <= h2) return true;
        if (h1 <= w2 && w1 <= h2) return true;

        return false;
    }
}
class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(3, 7);
        Rectangle r3 = new Rectangle(10, 15);

        //false
        System.out.println(r1.canPlaceInto(r2));

        //true
        System.out.println(r1.canPlaceInto(r3));

        //true
        System.out.println(r2.canPlaceInto(r3));

        //false
        System.out.println(r3.canPlaceInto(r2));
    }
}