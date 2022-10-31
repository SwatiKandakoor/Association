package association1.com.xworkz.association.type.person;

public class Location {
	public int no;
	public String street;
	public City city;
	public State state;
	public Country country;

	public Location(int no, String street) {
		this.no = no;
		this.street = street;

	}

	public void setCity(City city) {
		this.city = city;

	}

	public void setState(State state) {
		this.state = state;

	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public void showOff() {
		System.out.println(System.lineSeparator());
		System.out.println("Location No :" + this.no);
		System.out.println("Street :" + this.street);
		if (this.city != null) {
			this.city.showOff();
		} else {
			System.out.println("City is null");
		}
		if (this.state != null) {
			this.state.showOff();
		} else {
			System.out.println("State is null");

		}
		if (this.country != null) {
			this.country.showOff();
		} else {
			System.out.println("country is null");
		}
	}

}
