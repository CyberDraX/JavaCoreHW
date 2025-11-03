package JavaCoreHW2;

public class ProfessorHelper {

    public boolean areNumbersCool (int number1, int number2) {
        return number1 == number2;
    }

    public boolean areNumbersFatal(int first, int second) {
        return first * 5 + 3 == second;
    }

    public boolean canPrincessMarry(int day) {
        return day > 15;
    }

    public static void main(String[] args) {
        ProfessorHelper helper = new ProfessorHelper();

        //Should be true
        System.out.println("areNumbersCool(3, 3) = " + helper.areNumbersCool(3, 3));
        //Should be true
        System.out.println("areNumbersFatal(1, 8) = " + helper.areNumbersFatal(1, 8));
        //Should be true
        System.out.println("canPrincessMarry(20) = " + helper.canPrincessMarry(20));
    }
}
