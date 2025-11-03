package JavaCoreHM3;
import java.util.*;

public class HarekCity {
    public String[] createEmptyNameArray() {
        String[] result = new String[0];
        return result;
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[]{age1, age2, age3, age4};
    }

    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }

    public String firstAndLastTogether(String[] names) {
        return names[0] + " AND " + names[names.length-1] + " TOGETHER";
    }

    public void changeElectResult(String[] results) {
        String[] arrNames = Arrays.copyOf(results, results.length);
        if (results.length > 1){
            results[0] = arrNames[arrNames.length - 1];
            results[results.length-1] = arrNames[0];
        }
    }

    public String[] changeElectResultAgain(String[] results) {
        return Arrays.copyOfRange(results, 2, results.length);
    }

    public char[][] createKeyboard() {
        return new char[][]{
                           {'1','2','3'},
                           {'4','5','6'},
                           {'7','8','9'},
                           {'*','0','#'}
        };
    }

    public void printKeyboard() {
        char[][] keyboard = createKeyboard();

        System.out.println(Arrays.toString(keyboard[0]));
        System.out.println(Arrays.toString(keyboard[1]));
        System.out.println(Arrays.toString(keyboard[2]));
        System.out.println(Arrays.toString(keyboard[3]));
    }

    public String[] makeCopy(String[] names) {
        String[] copiedNames = Arrays.copyOf(names, names.length);
        System.out.println("Copied!");
        return copiedNames;
    }

    public static void main (String[] args) {

        String[] arr = new HarekCity().createEmptyNameArray();
        System.out.println(Arrays.toString(arr));

        int[] ageArray = new HarekCity().createAgeArray(10, 20, 30, 40);
        System.out.println(Arrays.toString(ageArray));

        String[] names = new String[]{"mixa", "ukio", "barek", "krou", "fiha"};
        String[] toReplace = new String[]{"lopr", "boki"};
        new HarekCity().fixNames(names, toReplace);
        System.out.println(Arrays.toString(names));

        String[] names1 = new String[]{"io", "pu", "re", "max", "kok", "mis", "hit", "kio", "pax", "rew"};
        System.out.println(new HarekCity().firstAndLastTogether(names1));

        String[] results = new String[]{"miho", "hut"};
        new HarekCity().changeElectResult(results);
        System.out.println(Arrays.toString(results));

        String[] results1 = new String[]{"mix", "max", "pex", "fux", "rox"};
        String[] changedResults = new HarekCity().changeElectResultAgain(results1);
        System.out.println(Arrays.toString(changedResults));

        char[][] keyboard = new HarekCity().createKeyboard();
        for (int i = 0; i < keyboard.length; i++) {
            System.out.println(Arrays.toString(keyboard[i]));
        }

        new HarekCity().printKeyboard();

        String[] source = new String[] {"Hero", "Mihu"};
        String[] copy = new HarekCity().makeCopy(source);

        source[0] = "CHANGED!"; //Ми змінюємо вихідний масив, але на копії це не відображається

        System.out.println(Arrays.toString(copy));
    }
}