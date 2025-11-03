package JavaCoreHW3;

import java.util.Scanner;

public class PassportFormCreator {

    public void createForms() {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        int age = scanner.nextInt();
        scanner.close();

        System.out.println(name + " " + surname + " " + age * 10);
        System.out.println(name.toUpperCase());
        System.out.println(surname.toUpperCase());
        System.out.println(age * 10);
    }

    static void main(String[] args) {
        PassportFormCreator passport = new PassportFormCreator();

        passport.createForms();
    }
}
