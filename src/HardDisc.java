public class HardDisc extends Component {
    private int capacity;

    public HardDisc() {
    }

    public HardDisc(String modelName, String producer, String serialNumber, int capacity) {
        super("Dysk twardy", modelName, producer, serialNumber);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + capacity + "MB";
    }
}
