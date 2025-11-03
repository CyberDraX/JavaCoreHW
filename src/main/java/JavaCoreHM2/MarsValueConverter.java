package JavaCoreHM2;

public class MarsValueConverter {

    public int changeMoneyAmount(float startAmount, float toRemove) {
        return (int) (startAmount - toRemove);
    }

    public byte calculateMoneySum(int sum1, int sum2) {
        return (byte) (sum1 + sum2);
    }

    public short halfOfMoney(double startMoney) {
        return (short) (startMoney / 2);
    }

    static void main(String[] args) {
        MarsValueConverter converter = new MarsValueConverter();

        //Mast be 59
        System.out.println("Converted Amount: " + converter.changeMoneyAmount(100f, 40.5f));
        //Mast be 90
        System.out.println("Calculated Sum: " + converter.calculateMoneySum(50, 40));
        //Mast be 500
        System.out.println("Half of Money: " + converter.halfOfMoney(1000.9999));

    }
}
