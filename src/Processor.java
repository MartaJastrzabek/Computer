import javax.naming.LimitExceededException;

public class Processor extends IncreaseCloaking {
    private static final int TEMP_INCREASE_VALUE = 10;
    public Processor() {
    }

    public Processor(String modelName, String producer, String serialNumber, int cloaking, int temperature) {
        super("Procesor", modelName, producer, serialNumber, cloaking, temperature);
    }

    public static int getTempIncreaseValue() {
        return TEMP_INCREASE_VALUE;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + getCloaking() + "MHz, " + getTemperature() + "*C Max temp: " + getMaxTemp();
    }
}
