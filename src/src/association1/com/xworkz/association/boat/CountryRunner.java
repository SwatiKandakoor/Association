package association1.com.xworkz.association.boat;

import association1.com.xworkz.association.constanta.Gender;
import association1.com.xworkz.association.type.City;
import association1.com.xworkz.association.type.Country;
import association1.com.xworkz.association.type.Name;
import association1.com.xworkz.association.type.President;

public class CountryRunner {

	public static void main(String[] args) {
		
		Country country = new Country("India");
		

		President president = new President("Droupadi Murmu");

		president.setTenure(5);
		president.setGender(Gender.FEMALE);
		country.setPresident(president);

		Name name = new Name("Bangalore", "Silicon City", null);
		City city = new City(name);
		city.setAreaInSquareKilometers(569);
		city.setCapital("Bangolore");

		Name name1 = new Name("Mysore", "Mysooru", null);
		City city1 = new City(name1);
		city1.setAreaInSquareKilometers(500);
		city1.setCapital("Bangolore");

		City[] array = { city, city1 };
		country.setCity(array);
		country.display();

	}

}
