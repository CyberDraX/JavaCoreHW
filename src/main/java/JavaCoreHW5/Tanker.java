package JavaCoreHW5;

public class Tanker {
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    private String serialNumber;

    protected String getFuelType() {
        return "A500";
    }

    public void refuel(int amount) {
        System.out.println("Add " + amount + " of " + getFuelType() + ", tanker serial number is " + serialNumber);
    }

    static void main(String[] args) {

        //Should be "Add 300 of A500, tanker serial number is SN504030"
        Tanker tanker = new Tanker();
        tanker.setSerialNumber("SN504030");
        tanker.refuel(300);

        //Should be "Add 300 of XFuel, tanker serial number is SN504030"
        Tanker tanker1 = new XFuelTanker();
        tanker1.setSerialNumber("SN504030");
        tanker1.refuel(300);

        //Should be "Add 300 of MX200, tanker serial number is SN504030"
        Tanker tanker2 = new MX200Tanker();
        tanker2.setSerialNumber("SN504030");
        tanker2.refuel(300);
    }
}

class XFuelTanker extends Tanker {
    @Override
    protected String getFuelType() {
        return "XFuel";
    }
}

class MX200Tanker extends Tanker {
    @Override
    protected String getFuelType() {
        return "MX200";
    }
}
