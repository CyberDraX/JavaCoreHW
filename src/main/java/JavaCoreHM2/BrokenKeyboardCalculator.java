package JavaCoreHM2;

public class BrokenKeyboardCalculator {

    public int add(int a, int b) {
        return a += b;
    }

    public int sub(int a, int b) {
        return a -= b;

    }

    public int multiply(int a, int b) {
        return a *= b;
    }

    public int divide(int a, int b) {
        return  a /= b;
    }

    static void main(String[] args) {
        BrokenKeyboardCalculator calculator = new BrokenKeyboardCalculator();

        //Should be 8
        System.out.println("Addition: " + calculator.add(5, 3));
        //Should be 1
        System.out.println("Subtraction: " + calculator.sub(8, 7));
        //Should be 100
        System.out.println("Multiplication: " + calculator.multiply(1, 100));
        //Should be 2
        System.out.println("Division: " + calculator.divide(8, 4));
    }
}
