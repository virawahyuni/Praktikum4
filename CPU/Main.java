package praktikum4.CPU;

public class Main {
	public static void main(String[] args) {
        CPU cpu = new CPU();
        CPU.Processor proc = cpu.new Processor();
        CPU.RAM ram = cpu.new RAM();
        System.out.println("Prosessor Cache" + proc.getCache());
        System.out.println("Ram Clock Speen" + ram.getClockSpeed());
    }
}
