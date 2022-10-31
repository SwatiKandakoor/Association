package association1.com.xworkz.association.type.person;

public class Person {

	public String name;
	public Email[] email;
	public Job job;

	public Person(String name) {
		this.name = name;
	}

	public void setEmail(Email[] email) {
		this.email=email;
	
		
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public void showOff() {
;
		System.out.println("Person name :" + this.name);
		if (this.email != null && this.email.length > 0) {
			for (int i = 0; i < email.length; i++) {
				Email email1 = email[i];
		//		System.out.println("Email :" + email1);
				if (email1 != null) {
					email1.showOff();
				} else {
					System.out.println("email is null in index :" + i);
				}
			}
		} else {
			System.out.println("email is null or empty");
		}
		if (this.job != null) {
			this.job.showOff();
			this.job.company.showOff();
		} else {
			System.out.println("job is null");
		}

	}
}
