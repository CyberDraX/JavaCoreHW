package JavaCoreHW3;

public class NumberTranslator {

    public int translate(String  romanNumber) {

        String cleanRomanNumber = romanNumber
                .toUpperCase()
                .trim()
                .strip()
                .replaceAll(" ", "");

        int translator = 0;
        switch (cleanRomanNumber) {
            case "I":
                translator = 1;
                break;
            case "II":
                translator = 2;
                break;
            case "III":
                translator = 3;
                break;
            case "IV":
                translator = 4;
                break;
            case "V":
                translator = 5;
                break;
            case "VI":
                translator = 6;
                break;
            case "VII":
                translator = 7;
                break;
            case "VIII":
                translator = 8;
                break;
            case "IX":
                translator = 9;
                break;
            case "X":
                translator = 10;
                break;
            case "XI":
                translator = 11;
                break;
            case "XII":
                translator = 12;
                break;
            default: translator = -1;
        }
        return translator;
    }

    static void main(String[] args) {
        NumberTranslator numbTrans = new NumberTranslator();

        //Return 1
        System.out.println(numbTrans.translate("I"));
        //Return 11
        System.out.println(numbTrans.translate(" X I"));
        //Return 9
        System.out.println(numbTrans.translate("iX "));
        //Return -1
        System.out.println(numbTrans.translate("XX"));
    }
}
