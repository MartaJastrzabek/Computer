import javax.naming.LimitExceededException;

public class Ram extends IncreaseCloaking {
    private int quantity;
    private static int TEMP_INCREASE_VALUE = 15;

    public Ram() {
    }

    public Ram(String modelName, String producer, String serialNumber, int cloaking, int temperature, int quantity) {
        super("Pamięć ram", modelName, producer, serialNumber, cloaking, temperature);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static int getTempIncreaseValue() {
        return TEMP_INCREASE_VALUE;
    }

    public static void setTempIncreaseValue(int tempIncreaseValue) {
        TEMP_INCREASE_VALUE = tempIncreaseValue;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + quantity + "MB, " + getCloaking() + "MHz, " + getTemperature() + " Max temp: " + getMaxTemp();
    }
}
