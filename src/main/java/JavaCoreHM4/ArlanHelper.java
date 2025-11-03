package JavaCoreHM4;

public class ArlanHelper {

    public String drawQuad(int n) {

        String starLine = "";
        int lineCount = 0;

        while (lineCount < n) {
            int secondLine = 0;
            while (secondLine < n) {
                starLine += "*";
                secondLine++;
            }
            starLine += "\n";
            lineCount++;
        }
        return starLine;
    }

    public String drawRect(int width, int height, char c) {
        String charLine = "";

        while (height > 0) {
            int w = width;
            while (w > 0) {
                charLine += c;
                w--;
            }
            charLine += "\n";
            height--;
        }
        return charLine;
    }

    public String drawLine(int length) {
        StringBuilder line = new StringBuilder();

        int count = 0;
        while (count < length) {
            if (count % 2 == 0) {
                line.append("*");
            }  else line.append("#");
            count++;
        }
        return line.toString();
    }

    public String drawPattern(char[] pattern, int repeatCount) {
        StringBuilder line = new StringBuilder();

        while (repeatCount > 0) {
            int i = 0;
            while (i < pattern.length) {
                line.append(pattern[i]);
                i++;
            }
            repeatCount--;
        }
        return line.toString();
    }

    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();

        //Should be:
        //**
        //**
        System.out.println(helper.drawQuad(2));

        //Should be:
        //XX
        //XX
        //XX
        System.out.println(helper.drawRect(2, 3, 'X'));

        //Should be:
        //*#*#*
        System.out.println(helper.drawLine(5));

        //Should be:
        //JavaJavaJava
        System.out.println(helper.drawPattern(new char[] {'J', 'a', 'v', 'a'}, 3));
    }
}