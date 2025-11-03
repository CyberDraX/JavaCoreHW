package JavaCoreHW2;

public class MoonRobotVespenGasDetector {

    public boolean isAcidOk(int acidValue, int minAcid, int maxAcid) {
        return acidValue >= minAcid && acidValue <= maxAcid;
    }

    public boolean isDensityOk(int density) {
        return (density >= 1000 && density <= 5000) | (density >= 10000 && density <= 15000);
    }

    public boolean isTemperatureOk(boolean cold) {
        return !cold;
    }

    public boolean isGroundOkForVespenGas (int acidValue, int minAcid, int maxAcid, int density, boolean cold){
        return isAcidOk(acidValue, minAcid, maxAcid) ^ isDensityOk(density) & isTemperatureOk(cold);
    }

    static void main(String[] args) {
        MoonRobotVespenGasDetector detector = new MoonRobotVespenGasDetector();

        // Should be true
        System.out.println("isAcidOk(100, 50, 150) = " + detector.isAcidOk(100, 50, 150));
        // Should be true
        System.out.println("isDensityOk(1500) = " + detector.isDensityOk(1500));
        // Should be false
        System.out.println("isDensityOk(30000) = " + detector.isDensityOk(30000));
        // Should be true
        System.out.println("isTemperatureOk(false) = " + detector.isTemperatureOk(false));
        // Should be true
        System.out.println("isGroundOkForVespenGas(120, 75, 150, 7500, false) = " + detector.isGroundOkForVespenGas(120, 75, 150, 7500, false));
    }
}
