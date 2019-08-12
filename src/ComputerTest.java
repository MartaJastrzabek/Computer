public class ComputerTest {
    public static void main(String[] args) {
        HardDisc hardDisc = new HardDisc("MV15W", "Samsung", "ACDW3422466TYE", 512);
        Processor processor = new Processor("i7", "Intel", "NWSAQ123456LKI", 2700, 80);
        Ram ram = new Ram("DDR4096KIE", "GOODRAM", "MHYGTEKSG568394", 1066, 70,4096);

        Computer computer = new Computer(hardDisc, processor, ram);
        System.out.println(computer);
        System.out.println("--------------------");

        for(int i = 0; i<5; i++) {

            computer.increaseProcessorCloaking();

            System.out.println(computer);
            System.out.println("--------------------");

            computer.increaseRamCloaking();

            System.out.println(computer);
            System.out.println("--------------------");
        }
    }

}
