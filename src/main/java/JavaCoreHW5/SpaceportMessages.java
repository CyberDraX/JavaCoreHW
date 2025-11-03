package JavaCoreHW5;

public class SpaceportMessages {

    public static String generateLandingMessage(String shipName, String spaceport, String time) {
        return "Spaceship " + shipName + " landing at " + spaceport + ", time is " + time;
    }

    static void main(String[] args) {
        SpaceportMessages.generateLandingMessage("SunFlower", "EarthKeeper", "20:40");
    }
}