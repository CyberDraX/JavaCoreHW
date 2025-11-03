package JavaCoreHW2;

public class DigitSplitter {

    public int getFirstDigit(int number) {
        String numStr = ""  + number;
        char firstChar = numStr.charAt(0);
        return Character.getNumericValue(firstChar);

    }

    public int getSecondDigit(int number) {
        String numStr = ""  + number;
        char secondChar = numStr.charAt(1);
        return Character.getNumericValue(secondChar);
    }

    static void main(String[] args) {
        DigitSplitter splitter = new DigitSplitter();

        System.out.println("First Digit: " + splitter.getFirstDigit(15));
        System.out.println("Second Digit: " + splitter.getSecondDigit (15));
    }

}
