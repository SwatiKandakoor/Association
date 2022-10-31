package association1.com.xworkz.association.type;

public class City {

	public Name name;
	public String capital;
	public double areaInSquareKilometers;

	public City(Name name) {
		this.name = name;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public void setAreaInSquareKilometers(double areaInSquareKilometers) {
		this.areaInSquareKilometers = areaInSquareKilometers;
	}

	public void display() {
		if (this.name != null) {
			this.name = name;
		} else {
			System.out.println("City name is null");
		}
		System.out.println(System.lineSeparator());
		System.out.println("-----City information-------");
		name.display();
		System.out.println("City capital :" + this.capital);
		System.out.println("City area in Square Kilometers :" + this.areaInSquareKilometers);

	}
}
