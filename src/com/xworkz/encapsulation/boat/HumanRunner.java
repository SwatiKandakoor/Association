package com.xworkz.encapsulation.boat;

import com.xworkz.encapsulation.type.Human;
import com.xworkz.encapsulation.type.HumanModify;

public class HumanRunner {
	public static void main(String[] args) {
		Human human = new Human();
		HumanModify modify = new HumanModify();

		modify.display(human);
		System.out.println("After modifying :" + human.getPersonname());
		System.out.println("After modifying :" + human.getWeight());
		System.out.println("After modifying :" + human.getEyes());
		System.out.println("After modifying :" + human.getBrain());
		System.out.println("After modifying :" + human.getHairs());
		System.out.println("After modifying :" + human.getHands());
		System.out.println("After modifying :" + human.getFingers());
		System.out.println("After modifying :" + human.getLegs());
		System.out.println("After modifying :" + human.getTongue());
		System.out.println("After modifying :" + human.getNeck());
		System.out.println("After modifying :" + human.getLiver());

	}

}
