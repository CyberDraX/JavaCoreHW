package JavaCoreHW2;

public class ProfShop {

    public boolean isPriceOk(int price) {
        return price != 1000;
    }

    public float calculateRegularDiscountPrice(float price) {;
        return price / 100 * 90;
    }

    public boolean isDiscount50(int price) {
        return price * 4 == 1000;
    }

    public boolean isPriceHappy(int price, int year, int day) {
        return year * day == price;
    }

    static void main(String[] args) {
        ProfShop shop = new ProfShop();

        //Should be true
        System.out.println("isPriceOk(1500) = " + shop.isPriceOk(1500));
        //Should be 1350
        System.out.println("calculateRegularDiscountPrice(1500) = " + shop.calculateRegularDiscountPrice(1500));
        //Should be false
        System.out.println("isDiscount50(256) = " + shop.isDiscount50(256));
        //Should be true
        System.out.println("isPriceHappy(23700, 3950, 6) = " + shop.isPriceHappy(23700, 3950, 6));
    }
}
