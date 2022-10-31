package association1.com.xworkz.association.type;

public class Name {
 
	public String currentName;
	public String oldName;
	public String futureName;
	
   
    
   
	public Name(String currentName, String oldName, String futureName) {
		super();
		this.currentName = currentName;
		this.oldName = oldName;
		this.futureName = futureName;
	}



	public void display() {
    	System.out.println("City  current name :"+this.currentName);
    	System.out.println("City old name :"+this.oldName);
    	System.out.println("City future name :"+this.futureName);
    }
}