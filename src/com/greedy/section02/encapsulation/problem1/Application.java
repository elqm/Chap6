package com.greedy.section02.encapsulation.problem1;

public class Application {

	public static void main(String[] args) {
		
		Monster monster1 = new Monster();
		monster1.name = "µÎÄ¡";
		monster1.hp = 200;
		
		System.out.println("monster1 name : " + monster1.name);
		System.out.println("monster1 hp : " + monster1.hp);
		
		Monster monster2 = new Monster();
		monster2.name = "»Ñ²Ù";
		monster2.hp = -200;
		
		System.out.println("monster2 name : " + monster2.name);
		System.out.println("monster2 hp : " + monster2.hp);
		
		Monster monster3 = new Monster();
		monster3.name = "µå¶óÅ§¶ó";
		monster3.setHp(200);
		
		System.out.println("monster3 name : " + monster3.name);
		System.out.println("monster3 hp : " + monster3.hp);
		
		Monster monster4 = new Monster();
		monster4.name = "ÇÁ¶ûÄË½´Å¸ÀÎ";
		monster4.setHp(-1000);
		
		System.out.println("monster4 name : " + monster4.name);
		System.out.println("monster4 hp : " + monster4.hp);
	}

}
