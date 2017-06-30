package java8;

public class OrganizationExpenditure {
	private String name;
	private int wages;
	private int misc;
	private int transport;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWages() {
		return wages;
	}
	public OrganizationExpenditure(String name, int wages, int misc, int transport) {
		super();
		this.name = name;
		this.wages = wages;
		this.misc = misc;
		this.transport = transport;
	}
	
	
	@Override
	public boolean equals(Object paramObject) {
		return name.equals(((OrganizationExpenditure)paramObject).getName());
	}
	public void setWages(int wages) {
		this.wages = wages;
	}
	public int getMisc() {
		return misc;
	}
	public void setMisc(int misc) {
		this.misc = misc;
	}
	public int getTransport() {
		return transport;
	}
	public void setTransport(int transport) {
		this.transport = transport;
	}
	@Override
	public String toString() {
		return getName();
	}

	
	
}
