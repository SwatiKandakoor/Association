package association1.com.xworkz.association.boat;

import association1.com.xworkz.association.type.person.Address;
import association1.com.xworkz.association.type.person.City;
import association1.com.xworkz.association.type.person.Company;
import association1.com.xworkz.association.type.person.Country;
import association1.com.xworkz.association.type.person.Email;
import association1.com.xworkz.association.type.person.Job;
import association1.com.xworkz.association.type.person.Location;
import association1.com.xworkz.association.type.person.Person;
import association1.com.xworkz.association.type.person.State;

public class PersonRunner {
	public static void main(String[] args) {
		Person person = new Person("Sunitha");

		Email email = new Email(45, "Chipku@2807");
		email.setMobileNo(8073982483d);

		Email email1 = new Email(56, "Naveem@678");
		email1.setMobileNo(9980361822d);

		Email[] array = { email, email1 };
		person.setEmail(array);

		Job job = new Job(25000d, "Project Eng", 1);
		person.setJob(job);
		


		Company company = new Company("Wipro", "Azim Premji");
		job.setCompany(company);

		email.setCompany(company);
		
		Location location = new Location(8, "ilkal");
		Address address = new Address(location);
		company.setAddress(address);

		City city = new City("Bagalkot");
		location.setCity(city);

		city.setCapital("Banglore");
		city.setAreaInSquareKilometers(345);

		State state = new State("Karnataka");
		location.setState(state);
		state.setNoOfDistrict(28);
		state.setCmName("Basavaraj Bommai");

		Country country = new Country("India", "Bagalkot");
		location.setCountry(country);
		country.setPresidentName("Droupadi Murmu");
		country.setNoOfStates(29);
		person.showOff();
		
	}

}
