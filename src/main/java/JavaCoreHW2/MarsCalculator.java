package JavaCoreHW2;

public class MarsCalculator {

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public int sub (int a, int b, int c) {
        return a - b - c;
    }

    public int multiply(int a, int b, int c) {
        return sum(a, b, c) * sub(a, b, c);
    }

    public float divide(int a, int b, int c) {
        return (float) sum(a, b, c) / 10;
    }

    public static void main(String[] args) {
        MarsCalculator marsCalculator = new MarsCalculator();

        // Should be 6
        System.out.println("marsCalculator.sum(1, 2, 3) = " + marsCalculator.sum(1, 2, 3));

        // Should be -4
        System.out.println("marsCalculator.sub(1, 2, 3) = " + marsCalculator.sub(1, 2, 3));

        // Should be -24
        System.out.println("marsCalculator.multiply(1, 2, 3) = " + marsCalculator.multiply(1, 2, 3));

        // Should be 0.6f
        System.out.println("marsCalculator.divide(1, 2, 3) = " + marsCalculator.divide(1, 2, 3));
    }
}
