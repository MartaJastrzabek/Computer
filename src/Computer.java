import javax.naming.LimitExceededException;

public class Computer {
    private HardDisc hardDisc;
    private Processor processor;
    private Ram ram;

    public Computer() {
    }

    public Computer(HardDisc hardDisc, Processor processor, Ram ram) {
        this.hardDisc = hardDisc;
        this.processor = processor;
        this.ram = ram;
    }

    public HardDisc getHardDisc() {
        return hardDisc;
    }

    public void setHardDisc(HardDisc hardDisc) {
        this.hardDisc = hardDisc;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void increaseProcessorCloaking(){
        try{
            processor.increaseCloacking(Processor.getTempIncreaseValue());
        } catch (LimitExceededException e){
            System.out.println(e.getMessage());
        }
    }

    public void increaseRamCloaking(){
        try{
            ram.increaseCloacking(Ram.getTempIncreaseValue());
        } catch (LimitExceededException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return processor.toString() + "\n" + ram.toString() + "\n" + hardDisc.toString();
    }
}
