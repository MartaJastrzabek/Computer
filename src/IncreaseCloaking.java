import javax.naming.LimitExceededException;

public abstract class IncreaseCloaking extends Component implements Increaseable {
    private int cloaking;
    private int temperature;
    private static final int MAX_TEMP = 90;
    private static final int CLOACKING_INCREASE = 100;

    public IncreaseCloaking() {
    }

    public IncreaseCloaking(String name, String modelName, String producer, String serialNumber, int cloaking, int temperature) {
        super(name, modelName, producer, serialNumber);
        this.cloaking = cloaking;
        this.temperature = temperature;
    }

    public static int getCloackingIncrease() {
        return CLOACKING_INCREASE;
    }

    public int getCloaking() {
        return cloaking;
    }

    public void setCloaking(int cloaking) {
        this.cloaking = cloaking;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public static int getMaxTemp() {
        return MAX_TEMP;
    }

    @Override
    public void increaseCloacking(int value) throws LimitExceededException {
        temperatureCheck(value);
        setTemperature(getTemperature() + value);
        setCloaking(getCloaking() + getCloackingIncrease());
    }

    public void temperatureCheck(int value) throws LimitExceededException {
        if(getTemperature() + value > getMaxTemp()){
            throw new LimitExceededException(getName() + ": Osiągnięto limit maxymalnej temperatury.");
        }
    }
}
