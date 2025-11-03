package JavaCoreHW4;

public class TrurlBank {

    public int sumQuads(int n) {

        int result = 0;
        while (n > 0) {
            result += (int) Math.pow(n, 2);
            n--;
        }
        return result;
    }

    public int countSumOfDigits(int number) {

        int result = 0;
        while (number > 0) {
            result += number % 10; // Повертає останню цифру числа.
            number /= 10; // Ділить number на 10, тим самим відкидає останню цифру.
        }
        return result;
    }

    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();

        //Should be 14 - 1 + 4 + 9
        System.out.println(bank.sumQuads(3));

        //Should be 16 - 5 + 4 + 7
        System.out.println(bank.countSumOfDigits(547));
    }
}