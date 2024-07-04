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
		
//		System.out.println("공격력을 설정하세요. (1~25) | 0. 랜덤");
//		int you = scan.nextInt();
//		if(you == 0) {
//			attack = (int)(Math.random() * 25) + 1;
//		} else if(you >= 1 && you <= 20) {
//			attack = you;
//		} else {
//			System.out.println("잘못된 입력입니다. ");
//		}
		attack = (int)(Math.random() * 25) + 1;
		
//		System.out.println("회복능력을 설정하세요. (1~15) | 0. 랜덤");
//		you = scan.nextInt();
//		if(you == 0) {
//			heal = (int)(Math.random() * 10) + 1;
//		} else if(you >= 1 && you <= 15) {
//			heal = you;
//		} else {
//			System.out.println("잘못된 입력입니다. ");
//		}
		heal = (int)(Math.random() * 10) + 1;
		System.out.println(name + " => 공격력 : " + attack + ", 회복능력 : " + heal);
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
