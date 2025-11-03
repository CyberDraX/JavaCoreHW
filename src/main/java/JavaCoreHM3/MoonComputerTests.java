package JavaCoreHM3;
import java.util.Scanner;

public class MoonComputerTests {

    public void testBasicInputOutput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your request: ");
        String input = scanner.nextLine();
        System.out.println(input);
        scanner.close();

    }

    public void testMath() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter your second number");
        int num2 = scanner.nextInt();
        scanner.close();

        System.out.println((num1 + num2) + " " + (num1 - num2) + " " + (num1 * num2) + " " + (num1 / num2));
    }

    public void testLogicalOperators() {
        Scanner scanner = new Scanner(System.in);

        boolean a = scanner.nextBoolean();
        boolean b = scanner.nextBoolean();
        boolean c = scanner.nextBoolean();

        System.out.println((a && b && c) + " " + (a || b || c));
        scanner.close();
    }

    public static void main(String[] args) {
        MoonComputerTests computerTests = new MoonComputerTests();

//        computerTests.testBasicInputOutput();
//        computerTests.testMath();
//        computerTests.testLogicalOperators();
    }
}