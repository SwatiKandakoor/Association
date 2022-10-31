package association1.com.xworkz.association.type.person;

public class Company {
	public String name;
	public String ownerName;
	public Address address;

	public Company(String name, String ownerName) {
		this.name = name;
		this.ownerName = ownerName;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void showOff() {
		System.out.println(System.lineSeparator());
		System.out.println("Company name :" + this.name);
		System.out.println("Company owner Name :" + this.ownerName);
		if (this.address != null) {
			this.address.showOff();
		} else {
			System.out.println("Address is null");
		}
	}

}
