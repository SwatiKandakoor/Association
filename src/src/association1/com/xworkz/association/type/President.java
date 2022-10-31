package association1.com.xworkz.association.type;

import association1.com.xworkz.association.constanta.Gender;

public class President {

	public String name;
	public int tenure;
	public Gender gender;
	
	
	public President(String name) {
		this.name=name;
	}
	
	public void setTenure(int tenure) {
		this.tenure=tenure;
	}
	public void setGender(Gender gender) {
		this.gender=gender;
	}
	
	public void display() {
		System.out.println(System.lineSeparator());
		System.out.println("----President information-------");
		System.out.println("President name :"+this.name);
		System.out.println("President tenure :"+this.tenure);
		System.out.println("Gender :"+gender.type);
		
	}
}
