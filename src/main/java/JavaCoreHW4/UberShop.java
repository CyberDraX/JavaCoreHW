package JavaCoreHW4;

import java.util.Arrays;

public class UberShop {
    public void printPrices(float[] prices) {
        for (float price : prices) {
            System.out.println(price + " jup.");
        }
    }

    public void multiplyPrices(float[] prices) {

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < 1000) {
                prices[i] *= 2;
            } else {
                prices[i] *= 1.5f;
            }
        }
    }

    /*public int[] findMinMaxPrices(int[] prices) {
        // Не дуже добре написаний код особливо якщо доведеться перевіряти великі масиви
        Arrays.sort(prices);
        if (prices.length == 0) {
            return new int[] {};
        } else if (prices[0] == prices[prices.length-1]) {
            return new int[] {prices[0]};
        } else {
            return new int[] {prices[0], prices[prices.length -1]};
        }
    }*/

    public int[] findMinMaxPrices(int[] prices) {
        // - Без сортування: швидше на великих масивах.
        // - Менше пам’яті: не змінює вхідний масив.
        if (prices == null || prices.length == 0) {
            return new int[] {};
        }
        int min = prices[0];
        int max = prices[0];
        for (int price : prices) {
            if (price < min) min = price;
            if (price > max) max = price;
        }
        if (min == 0) {
            return new int[] {};
        } else if (min == max) {
            return new int[] {min};
        } else {
            return new int[] {min, max};
        }
    }

    public int getMinPriceCount(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }
        int samePricesCount = 0;
        for (int price : prices) {
            if (price == minPrice) {
                samePricesCount++;
            }
        }
        return samePricesCount;
    }

    public int[] removePrice(int[] prices, int toRemove) {

        int count = 0;
        for (int price : prices) {
            if (price != toRemove) {
                count++;
            }
        }
        int[] editPrices = new int[count];
        int index = 0;
        for (int price : prices) {
            if (price != toRemove) {
                editPrices[index] = price;
                index++;
            }
        }
        return editPrices;
    }

    public int[] leavePrice9(int[] prices) {

        int count = 0;
        for (int price : prices) {
            if (price % 10 == 9) {
                count++;
            }
        }
        int[] bestPrices = new int[count];
        int index = 0;
        for (int price : prices) {
            if (price % 10 == 9) {
                bestPrices[index] = price;
                index++;
            }
        }
        return bestPrices;
    }

    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks) {

        int count = showcaseStocks.length + warehouseStocks.length;
        String[] allProducts = new String[count];
        int index = 0;
        for (String stocks : showcaseStocks) {
            allProducts[index] = stocks;
            index++;
        }
        for (String stocks : warehouseStocks) {
            allProducts[index] = stocks;
            index++;
        }
        return allProducts;
    }

    public int getPricesSum(int[] prices, int minPrice, int maxPrice) {

        int sum = 0;
        for (int price : prices) {
            if (price >= minPrice && price <= maxPrice) {
                sum += price;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be 100 jup. 23.5 jup. 400 jup. - one price per line
        float[] prices = new float[] {100f, 23.5f, 400f};
        shop.printPrices(prices);

        //Should be [200, 2250]
        float[] prices1 = new float[] {100f, 1500f};
        shop.multiplyPrices(prices1);
        System.out.println(Arrays.toString(prices1));

        //Should be [50, 1500]
        int[] prices2 = new int[] {100, 1500, 300, 50};
        int[] minMax = shop.findMinMaxPrices(prices2);
        System.out.println(Arrays.toString(minMax));

        //Should be [50, 1500]
        int[] prices3 = new int[] {100, 1500, 300, 50, 10, 10, 70};
        System.out.println(shop.getMinPriceCount(prices3)); //Should be 2

        //Should be 5
        System.out.println(shop.getMinPriceCount(new int[]{9, 10, 10, 11, 9, 11, 11, 10, 9, 9, 9, 11, 12}));

        //Should be [150,200]
        System.out.println(Arrays.toString(shop.removePrice(new int[]{150, 100, 200}, 100)));
        System.out.println(Arrays.toString(shop.removePrice(new int[]{100, 100, 100}, 100))); //[]

        //Should be [1599, 399]
        int[] prices4 = new int[] {399, 1599, 399, 50, 10, 10, 70};
        System.out.println(Arrays.toString(shop.leavePrice9(prices4)));
        //[99, 79, 99, 19, 69]
        int[] prices5 = new int[] {99, 81, 79, 45, 99, 51, 19, 25, 69, 12};
        System.out.println(Arrays.toString(shop.leavePrice9(prices5)));

        //Final result should be ["gun", "firebow", "firegun"]
        String[] showcaseStocks = new String[] {"gun", "firebow"};
        String[] warehouseStocks = new String[] {"firegun"};
        System.out.println(Arrays.toString(shop.mergeStocks(showcaseStocks, warehouseStocks)));

        //Should be 144 - 20 + 50 + 40 + 34
        System.out.println(shop.getPricesSum(new int[]{10, 20, 50, 40, 34, 500}, 20, 50));
        //Should be 0
        System.out.println(shop.getPricesSum(new int[]{500, 400, 200}, 10, 50));
    }
}