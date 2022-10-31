package association1.com.xworkz.association.type.person;

public class City {

	public String name;
	public String capital;
	public double areaInSquareKilometers;

	public City(String name) {
		this.name = name;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public void setAreaInSquareKilometers(double areaInSquareKilometers) {
		this.areaInSquareKilometers = areaInSquareKilometers;
	}

	public void showOff() {

		System.out.println(System.lineSeparator());
		System.out.println("-----City information-------");
        System.out.println("City Name :"+this.name);
		System.out.println("City capital :" + this.capital);
		System.out.println("City area in Square Kilometers :" + this.areaInSquareKilometers);

	}
}
