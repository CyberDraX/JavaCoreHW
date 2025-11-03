package JavaCoreHW4;

public class TriangleDrawer {

    public String drawTriangle(int side) {
        StringBuilder triangleLine = new StringBuilder();

        while (side > 0) {
            triangleLine.append("*".repeat(side)).append("\n");
            side--;
        }
        return triangleLine.toString();
    }

    static void main(String[] args) {

//        Shoud be
//        ***
//        **
//        *
        System.out.println(new TriangleDrawer().drawTriangle(3));
    }
}
