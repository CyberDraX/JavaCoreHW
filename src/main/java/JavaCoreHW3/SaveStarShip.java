package JavaCoreHW3;

import java.util.Arrays;
import java.util.Scanner;

public class SaveStarShip {

    public int calculateDistance(int distance) {
        return distance > 0 ? distance : distance / -1;
    }

    public String[] getPlanets(String galaxy) {

        String galaxyPlanets;
        if (galaxy.equals("Miaru")) {
            galaxyPlanets = "Maux, Reux, Piax";
        } else if (galaxy.equals("Milkyway")) {
            galaxyPlanets = "Earth, Mars, Jupiter";
        } else if (galaxy.equals("DangerBanger")) {
            galaxyPlanets = "Fobius, Demius";
        } else {
            galaxyPlanets = "";
        }
        return  new String[] {galaxyPlanets};
    }

    public  String choosePlanet(long distanceToEarth) {
        return distanceToEarth < 45677 ? "Earth" : "Pern";
    }

    public int calculateFuelPrice(String fuel, int count) {

        int price;
        switch (fuel) {
            case "STAR100":
                price = count * 70;
                break;
            case "STAR500":
                price = count * 120;
                break;
            case "STAR1000":
                price = count * 200;
                break;
            default:
                price = count * 50;
        }
        return price;
    }

    public int roundSpeed(int speed) {
        
        int roundedSpeed = 0;
        if (speed >= 10 && speed <= 89) {
            roundedSpeed = Math.round(speed / 10f) *10;
        }
        return roundedSpeed;
    }

    public int calculateNeededFuel(int distance) {

        int distanceCount = 1000;
        if (distance > 20) {
            return distanceCount + (distance - 20) * 5;
        } else {
            return distanceCount;
        }
    }

    public void calculateMaxPower() {
        Scanner scanner = new Scanner(System.in);

        int engine1 = scanner.nextInt();
        int engine2 = scanner.nextInt();
        int engine3 = scanner.nextInt();

        int compare = Math.max((Math.max(engine1, engine2)), engine3);

        float enginePower = 0;
        if (compare <= 10) {enginePower = compare * 0.7f;}
        if (compare >10 && compare < 100) {enginePower = compare * 1.2f;}
        if (compare > 100) {enginePower = compare * 2.1f;}
        System.out.println(enginePower);
        scanner.close();
    }

    public String getMyPrizes(int ticket) {

        int term1 = ticket % 10;

        String crystallLine = "";
        String chipLine = "";
        String coinLine = "";

        if (term1 == 0) {crystallLine = "crystall";}
        if (term1 == 7) {chipLine = "chip";}
        if (ticket > 200) {coinLine = "coin";}

        return String.join(" ", crystallLine, chipLine, coinLine).replaceAll(" +", " ").trim();
    }

    public boolean isHangarOk(int side1, int side2, int price) {

        int hangarArea = side1 * side2;
        int max = Math.max(side1, side2);
        int min = Math.min(side1, side2);

        return hangarArea >= 1500 &&  max <= min * 2 && price / hangarArea <=1000;
    }

    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));

        //Should be [Fobius, Demius]
        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));

        //Should be Earth
        System.out.println(ship.choosePlanet(10));

        //Should be 700
        System.out.println(ship.calculateFuelPrice("STAR100", 10));

        //Should be 60
        System.out.println(ship.roundSpeed(55));

        //Should be 1005
        System.out.println(ship.calculateNeededFuel(21));

        //Test stdin data - 1 3 5.
        //Console ouput should be 3.5
        ship.calculateMaxPower();

        //Should be "crystall coin"
        System.out.println(ship.getMyPrizes(250));

        //Should be true
        System.out.println(ship.isHangarOk(30, 50, 759000));
    }
}