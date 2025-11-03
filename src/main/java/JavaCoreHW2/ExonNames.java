package JavaCoreHW2;

public class ExonNames {

    public boolean areNamesEqual(String name1, String name2) {
        return name1.equalsIgnoreCase(name2);
    }

    public String makeFullName(String firstName, String lastName) {
        return firstName.toLowerCase() + " " + lastName.toUpperCase();
    }

    public boolean isNameLucky(String name) {
        return name.toLowerCase().contains("a") || name.toLowerCase().contains("o");
    }

    public String getNameCode(String name) {
        int len = name.length();
        int end = Math.max(1, len - 1); // гарантує хоча б один символ
        String result = name.charAt(0) + name.substring(end);
        return result.toUpperCase();
    }

    public boolean isMoneyName(String name) {
        char fistChar = name.charAt(0);
        char lastChar = name.charAt(name.length() - 1);
        boolean a = fistChar >= '0' && fistChar <= '9';
        boolean b = lastChar >= '0' && lastChar <= '9';
        return a && b;
    }

    public boolean isInvisibleName(String name) {
        return name.strip().isBlank();
    }

    public String makeNamePositive(String name) {
        return name.replace("No", "yes")
                   .replace("no", "yes")
                   .replace("nO", "yes")
                   .replace("NO", "yes");
    }

    public String makeNameClean(String name)  {
        return "CLEAN" + name.strip() + "CLEAN";
    }

    public String makeHalfOfName(String name) {
        int length = name.length();
        int halfLength = length / 2;
        return name.substring(0, halfLength);
    }

    static void main(String[] args) {
        ExonNames names = new ExonNames();

        //Should be true
        boolean namesEqual = names.areNamesEqual("nm", "nm");
        System.out.println("names.areNamesEqual(\"nm\", \"nm\") = " + namesEqual);

        //Should be "exor BIGO"
        String fullName = names.makeFullName("exor", "bigo");
        System.out.println("names.makeFullName(\"exor\", \"bigo\") = " + fullName);

        //Should be true
        boolean isNameLucky = names.isNameLucky("Bigo");
        System.out.println("names.isNameLucky(\"Bigo\") = " + isNameLucky);

        //Should be BA
        String nameCode = names.getNameCode("boRA");
        System.out.println("names.getNameCode(\"boRA\") = " + nameCode);

        //Should be c
        String nameCode2 = names.getNameCode("c");
        System.out.println("names.getNameCode(\"c\") = " + nameCode2);

        //Should be true
        boolean isMoneyName = names.isMoneyName("31Boss31");
        System.out.println("names.isMoneyName(\"31Boss31\") = " + isMoneyName);

        //Should be true
        boolean isInvisible = names.isInvisibleName(" ");
        System.out.println("names.isInvisibleName(\" \") = " + isInvisible);

        //Should be YesMont
        String positive = names.makeNamePositive("NoMont");
        System.out.println("names.makeNamePositive(\"NoMont\") = " + positive);

        //Should be CLEANdirtyCLEAN
        String cleanName = names.makeNameClean(" dirty ");
        System.out.println("names.makeNameClean(\" dirty \") = " + cleanName);

        //Should be Gu
        String halfOfName = names.makeHalfOfName("Gurk");
        System.out.println("names.makeHalfOfName(\"Gurk\") = " + names.makeHalfOfName("Gurk"));

        //Should be J
        String halfOfName1 = names.makeHalfOfName("Jeo");
        System.out.println("names.makeHalfOfName(\"Jeo\") = " + names.makeHalfOfName("Jeo"));

        //Should be Boky
        String halfOfName2 = names.makeHalfOfName("Bokyfefuk");
        System.out.println("names.makeHalfOfName(\"Bokyfefuk\") = " + names.makeHalfOfName("Bokyfefuk"));
    }
}
