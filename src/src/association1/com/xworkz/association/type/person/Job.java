package association1.com.xworkz.association.type.person;

public class Job {

	public double salary;
	public String role;
	public int bond;
	public Company company;

	public Job(double salary, String role, int bond) {
		this.salary = salary;
		this.role = role;
		this.bond = bond;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public void showOff() {
		System.out.println("salary :" + this.salary);
		System.out.println("Job role :" + this.role);
		System.out.println("Bond :" + this.bond);
		if (this.company != null) {
			this.company.showOff();
		} else {
			System.out.println("company is null");
		}
		
	}
}
