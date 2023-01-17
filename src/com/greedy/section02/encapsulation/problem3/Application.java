package com.greedy.section02.encapsulation.problem3;

public class Application {

	public static void main(String[] args) {
		
		Monster monster1 = new Monster();
		monster1.setInfo("µÂ∂Û≈ß∂Û");
		monster1.setHp(100);
		
		Monster monster2 = new Monster();
		monster2.setInfo("«¡∂˚ƒÀΩ¥≈∏¿Œ");
		monster2.setHp(200);
		
		Monster monster3 = new Monster();
		monster3.setInfo("¥¡¥Î¿Œ∞£");
		monster3.setHp(300);
		
		Monster monster4 = new Monster();
		monster4.setInfo("πÃ¿Ã∂Û");
		monster4.setHp(400);
		
		System.out.println(monster1.getInfo());
		System.out.println(monster2.getInfo());
		System.out.println(monster3.getInfo());
		System.out.println(monster4.getInfo());
		
		monster4.kinds = "µŒƒ°";
		
	}

}
