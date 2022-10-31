
package association1.com.xworkz.association.type.person;

public class State {
	public String stateName;
	public int noOfDistrict;
	public String cmName;

	public State(String stateName) {
		this.stateName = stateName;
	}

	public void setNoOfDistrict(int noOfDistrict) {
		this.noOfDistrict = noOfDistrict;
	}

	public void setCmName(String cmName) {
		this.cmName = cmName;
	}

	public void showOff() {
		System.out.println(System.lineSeparator());
		System.out.println("State name :" + this.stateName);
		System.out.println("No of District :" + this.noOfDistrict);
		System.out.println("CM name :" + this.cmName);
	}

}
