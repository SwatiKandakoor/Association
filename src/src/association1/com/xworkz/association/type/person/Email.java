package association1.com.xworkz.association.type.person;

public class Email {
	public int id;
	public String password;
	public double mobileNo;
	public Company company;

	public Email(int id, String password) {
		this.id = id;
		this.password = password;
	}

	public void setMobileNo(double mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public void showOff() {
		System.out.println(System.lineSeparator());
		System.out.println("Email id :" + this.id);
		System.out.println("Email password :" + this.password);
		System.out.println("Mobile No :" + this.mobileNo);
	
		
	}

}
