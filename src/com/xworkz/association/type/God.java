package com.xworkz.association.type;

public class God {
	public String name;
	public char gender;
	public String mainPower;
	public Weapon weapon=new Weapon("Trisul",true,130);
	
	
	public God(String name,char gender,String mainPower) {
		this.name=name;
		this.gender=gender;
		this.mainPower=mainPower;
		
	}
	
   public void showOff() {
	   System.out.println("-----God ShowOff---------------");
	   System.out.println("God name :"+name);
	   System.out.println("God gender :"+gender);
	   System.out.println("God main Power :"+mainPower);
	   System.out.println(System.lineSeparator());
	   if(this.weapon!=null) {
		   this.weapon.showOff();
		   
	   }
	   else {
		   System.out.println("weapon showOff is null");  
	   }
   }
}
