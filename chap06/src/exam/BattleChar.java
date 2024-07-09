package exam;

import java.util.Scanner;

public class BattleChar {
	
	Scanner scan = new Scanner(System.in);
	
	int attack; // 공격력
	int heal; // 회복 능력
	String name; // 캐릭터이름
	int hart = 100;
	
	void character() {
		System.out.println("캐릭터를 생성합니다. ");
		System.out.println("이름을 설정하세요. ");
		name = scan.next();

		attack = 10 + (int)(Math.random() * 15); // 10 ~ 25
		
		heal = 5 + (int)(Math.random() * 10); // 5 ~ 15
		
//		System.out.println(name + " => 공격력 : " + attack + ", 회복능력 : " + heal);
		System.out.println("=========================================");
	}
	
	int attack() {
		return attack;
	}
	
	int heal() {
		return heal;
	}
	
	String name() {
		return name;
	}

	
}
