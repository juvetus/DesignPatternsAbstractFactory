package fr.doranco.factory.test1;

public class ServerFactory implements ComputerAbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;

	public ServerFactory() {

	}

	public ServerFactory(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public String toString() {
		return "ServerFactory [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + "]";
	}

	@Override
	public Computer createComputer() {

		Server server = new Server(ram,hdd,cpu);
		return server;
	}

}
