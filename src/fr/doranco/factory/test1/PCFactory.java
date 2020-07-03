package fr.doranco.factory.test1;

public class PCFactory implements ComputerAbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;

	public PCFactory() {

	}

	public PCFactory(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public String toString() {
		return "PCFactory [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + "]";
	}

	@Override
	public Computer createComputer() {
		PC pc = new PC(ram, hdd, cpu);
		return pc;

	}

}
