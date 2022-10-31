package association1.com.xworkz.association.type.person;

public class Address {
	public Location location;

	public Address(Location location) {
		this.location = location;
	}

	public void showOff() {
		System.out.println(System.lineSeparator());
		if (this.location != null) {
			this.location.showOff();
		} else {
			System.out.println("Location is null");
		}
	}

}
