package com.xworkz.encapsulation.type;

public class HumanModify {
	public Human human;
	public void display(Human human) {
		System.out.println(human.getPersonname());
		human.setPersonname("Naveen");
		
		System.out.println(human.getWeight());
		human.setWeight(64);
		System.out.println(human.getEyes());
		human.setEyes(0);
		
		System.out.println(human.getBrain());
		human.setBrain(1);;
		
		System.out.println(human.getHairs());
		human.setHairs("Not counteable");;
		
		System.out.println(human.getHands());
		human.setHands(1);;
		
		System.out.println(human.getFingers());
		human.setFingers(22);;
		
		System.out.println(human.getLegs());
		human.setLegs(1);;
		
		System.out.println(human.getTongue());
		human.setTongue(1);;
		
		System.out.println(human.getNeck());
		human.setNeck(1);;
		System.out.println(human.getLiver());
		human.setLiver(1);
		
		
	}

}
