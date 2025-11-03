package JavaCoreHW5;

public class Engine {

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    protected int power;

    public String getFuelType() {
        return "A500";
    }

    public static void main(String[] args) {

        Engine engine = new Engine();

        System.out.println(engine.getFuelType());

        Engine basicEngine = new Engine();
        System.out.println(basicEngine.getFuelType()); //A500

        Engine xFuelEngine = new XFuelEngine();
        System.out.println(xFuelEngine.getFuelType()); //XFuel

        AdvancedXFuelEngine engine1 = new AdvancedXFuelEngine();
        engine1.setPower(1000);
        engine1.setSerialNumber("SN504030");
        engine1.printInfo(); //Serial number is SN504030, power is 1000
    }
}

class XFuelEngine extends Engine {
    @Override
    public String getFuelType() {
        return "XFuel";
    }

    protected String serialNumber;

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}

class AdvancedXFuelEngine extends XFuelEngine {
    public void printInfo() {
        System.out.println("Serial number is " + serialNumber + ", power is " + power);
    }
}