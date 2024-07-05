package exam;

import java.util.Scanner;

public class BattleChar1 {
	
	Scanner scan = new Scanner(System.in);
	
	int attack;
	int heal;
	String name;
	
	void charactor () {
		System.out.println("=========================================");
		System.out.println("캐릭터를 생성합니다. ");
		System.out.println("이름을 설정하세요. ");
		name = scan.next();

		attack = (int)(Math.random() * 25) + 1;
		while(attack < 10) {
			attack = (int)(Math.random() * 25) + 1;
//			System.out.println(attack);
		}
		
		heal = (int)(Math.random() * 10) + 1;
		
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
