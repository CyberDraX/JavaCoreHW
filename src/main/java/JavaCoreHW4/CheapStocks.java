package JavaCoreHW4;

public class CheapStocks {

    public String getCheapStocks(String[] stocks) {

        String goods = "";
        for (String text : stocks) {
            String[] parts = text.split(" ");
            int price = Integer.parseInt(parts[1]);
            if (price < 200) {
                goods += parts[0] + " ";
            }
        }
        return goods.trim();
    }

    static void main(String[] args) {
        CheapStocks cheap = new CheapStocks();

        //Should be "firebow"
        System.out.println(cheap.getCheapStocks(new String[]{"gun 500", "firebow 70", "pixboom 200"}));
        //Should be "qa duq" "rame Pyxed Syte cuqy aj Gobou Peatv"
        System.out.println(cheap.getCheapStocks(new String[]{"qa 177", "duq 100", "rame 111", "Pyxed 124", "Syte 46", "qe 860", "cuqy 89", "aj 38", "Vax 951", "Gobou 49", "Peatv 31"}));
    }
}
