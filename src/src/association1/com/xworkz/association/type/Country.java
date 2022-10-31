package association1.com.xworkz.association.type;

public class Country {

	public String name;
	public City[] cities;
	public President president;

	public Country(String name) {
		this.name = name;
	}

	public void setCity(City[] cities) {
		this.cities = cities;
	}

	public void setPresident(President president) {
		this.president = president;
	}

	public void display() {
		
		System.out.println("-----displaying country------- ");
		System.out.println("country :"+this.name);
		if (this.cities != null && this.cities.length > 0) {
			for (int i = 0; i < cities.length; i++) {
				City city = cities[i];
				System.out.println("City :"+city);
				if (city != null) {
					city.display();
				} else {
					System.out.println("City is null in index :" + i);
				}
			}
		} else {
			System.out.println("City is null or empty");
		}
		if (this.president != null) {
			this.president.display();
		} else {
			System.out.println("President is null");
		}
	}

}
