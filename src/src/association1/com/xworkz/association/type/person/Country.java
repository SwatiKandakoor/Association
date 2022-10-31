
package association1.com.xworkz.association.type.person;

public class Country {
	public String countryName;
	public String cityName;
	public String presidentName;
	public int noOfStates;

	public Country(String countryName, String cityName) {
		this.countryName = countryName;
		this.cityName = cityName;

	}

	public void setPresidentName(String presidentName) {
		this.presidentName = presidentName;
	}

	public void setNoOfStates(int noOfStates) {
		this.noOfStates = noOfStates;
	}

	public void showOff() {
		System.out.println(System.lineSeparator());
		System.out.println("Country Name :" + this.countryName);
		System.out.println("City Name :" + this.cityName);
		System.out.println("President Name :" + this.presidentName);
		System.out.println("No of States  :" + this.noOfStates);

	}

}
