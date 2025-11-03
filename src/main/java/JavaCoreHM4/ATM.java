package JavaCoreHM4;

public class ATM {

    public int countBanknotes(int sum) {

        int count = 0;
        while (sum > 0) {
            if (sum >= 500) {
                sum -= 500;
            } else if (sum >= 200) {
                sum -= 200;
            } else if (sum >= 100) {
                sum -= 100;
            } else if (sum >= 50) {
                sum -= 50;
            } else if (sum >= 20) {
                sum -= 20;
            } else if (sum >= 10) {
                sum -= 10;
            } else if (sum >= 5) {
                sum -= 5;
            }else if (sum >= 2) {
                sum -= 2;
            } else {
                sum -= 1;
            }
            count++;
        }
        return  count;
    }

    static void main(String[] args) {
        ATM atm = new ATM();

        //Should be 1 (одна банкнота у 500)
        System.out.println(atm.countBanknotes(500));

        //Should be 6 (500 + 50 + 20 + 5 + 2 + 1)
        System.out.println(atm.countBanknotes(578));
    }
}