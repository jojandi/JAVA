package exam;

import java.util.Scanner;

public class Battle {
	/*
	~ 배틀게임을 만들자! ~
		class charactor
		체력 100에서 시작
		방어력: 특정 범위 안에서 random
		메소드 
		attack (% 또는 수치)
		heal   (% 또는 수치)
		 
		- 내성이 있어서 회복 수치가 점점 줄어들 수도 있다
		남은 체력을 출력
		defence : 방어력을 제외한 상대의 attack 수치를 체력에서 깎음
		 
		- 체력이 0 이하가 되면 "사망" 출력
		
		main에서 두 캐릭터를 생성해서 서로 싸워라!
	 */
	Scanner scan = new Scanner(System.in);
	
	int defend;
	int count1 = 0;
	int count2 = 0;
	int hart1 = 100;
	int hart2 = 100;
	
	boolean is = true;
	
	BattleChar1 c1 = new BattleChar1();
	BattleChar1 c2 = new BattleChar1();
	
	void game() {
		System.out.println("게임을 시작합니다. ");
		c1.charactor();
		c2.charactor();
		infomation();
		while(is) {
			System.out.println(c1.name() + "의 행동선택");
			System.out.println("1. 공격 | 2. 물약 섭취 | 3. 도망가기");
			int you = scan.nextInt();
			if(you == 1) {
				attack1_2();
				if(hart2 <= 0) {
					hart2 = 0;
					info();
					System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
					System.out.println(c2.name() + " LOSE...");
					System.out.println(c1.name() + " WIN!!");
					break;
				}
			} else if(you == 2) {
				heal1();
			} else if(you == 3) {
				System.out.println(c1.name() + "가 도망갔다!");
				System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
				System.out.println(c1.name() + " LOSE...");
				System.out.println(c2.name() + " WIN!!");
				break;
			}
			info();
			System.out.println(c2.name() + "의 행동선택");
			System.out.println("1. 공격 | 2. 물약 섭취 | 3. 도망가기");
			you = scan.nextInt();
			if(you == 1) {
				attack2_1();
				if(hart1 <= 0) {
					hart1 = 0;
					info();
					System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
					System.out.println(c1.name() + " LOSE...");
					System.out.println(c2.name() + " WIN!!");
					break;
				}
			} else if(you == 2) {
				heal2();
			} else if(you == 3) {
				System.out.println(c2.name() + "가 도망갔다!");
				System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
				System.out.println(c2.name() + " LOSE...");
				System.out.println(c1.name() + " WIN!!");
				break;
			}
			info();
		}
	}
	
	void infomation() {
		System.out.println("=========================================");
		System.out.println("~ " + c1.name() + "의 정보 ~ ");
		System.out.println("HP : " + hart1);
		System.out.println("공격력 : " + c1.attack());
		System.out.println("물약 효능 : " + c1.heal());
		System.out.println("-----------------------------------------");
		System.out.println("~ " + c2.name() + "의 정보 ~ ");
		System.out.println("HP : " + hart2);
		System.out.println("공격력 : " + c2.attack());
		System.out.println("물약 효능 : " + c2.heal());
		System.out.println("=========================================");

	}
	
	void info() {
		System.out.println("-----------------------------------------");
		System.out.println(c1.name() + " - HP : " + hart1);
		System.out.println(c2.name() + " - HP : " + hart2);
		System.out.println("-----------------------------------------");
		}
	
	void attack1_2() {
		defend = (int)(Math.random() * 5) + 1;
		System.out.println(c1.name() + " 공격! (공격력 : " + c1.attack() + ")");
		System.out.println(c2.name() + " 방어! (방어력 : " + defend + ")");
		int a = c1.attack() - defend;
		if(a < 0) {
			a = 0;
		}
		hart2 -= a;
		System.out.println(c2.name() + "의 HP가 " + a + "만큼 깎였다.");
	}
	
	void attack2_1() {
		defend = (int)(Math.random() * 5) + 1;
		System.out.println(c2.name() + " 공격! (공격력 : " + c2.attack() + ")");
		System.out.println(c1.name() + " 방어! (방어력 : " + defend + ")");
		int a = c2.attack() - defend;
		if(a < 0) {
			a = 0;
		}
		hart1 -= a;
		System.out.println(c1.name() + "의 HP가 " + a + "만큼 깎였다.");
	}
	
	void heal1() {
		System.out.println(c1.name() + " 물약 섭취!");
		hart1 += c1.heal;
		count1++;
		if(hart1 > 100) {
			hart1 = 100;
		}
		System.out.println(c1.name() + "의 HP가 " + c1.heal + "만큼 늘어났다!");
		for(int i = 0; i < 100; i+=2) {
			if(count1 == i) {
				c1.heal--;
			}
		}
	}
	void heal2() {
		System.out.println(c2.name() + " 물약 섭취!");
		hart2 += c2.heal;
		count2++;
		if(hart2 > 100) {
			hart2 = 100;
		}
		System.out.println(c2.name() + "의 HP가 " + c2.heal + "만큼 늘어났다!");
		for(int i = 0; i < 100; i+=2) {
			if(count2 == i) {
				c2.heal--;
			}
		}
	}
	
}
