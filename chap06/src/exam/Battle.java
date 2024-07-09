package exam;

import java.util.Scanner;

public class Battle {
	/*
	~ 배틀게임을 만들자! ~
		class character
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
	
//	boolean is = true;
	
	BattleChar c1 = new BattleChar();
	BattleChar c2 = new BattleChar();
	
	/**
	~ game 메소드 ~
		1. 2개의 캐릭터 생성
		2. while문, 캐릭터 하나가 사망할 때까지 반복
		3. 사용자가 어떤 선택을 하는지에 따라 attack메소드, heal 메소드 사용
		
		@param X
		@return X
	*/
	void game() {
		System.out.println("게임을 시작합니다. ");
		System.out.println("=========================================");
		c1.character();
		c2.character();
		information();
		
		while(true) {
			System.out.println(c1.name() + "(이)의 행동선택");
			System.out.println("1. 공격 | 2. 물약 섭취 | 3. 도망가기");
			int you = scan.nextInt();
			if(you == 1) {
				attack1_2();
				if(c2.hart <= 0) {
					c2.hart = 0;
					info();
					System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
					System.out.println(c2.name() + " LOSE...");
					System.out.println(c1.name() + " WIN!!");
					break;
				}
			} else if(you == 2) {
				heal1();
			} else if(you == 3) {
				System.out.println(c1.name() + "(이)가 도망갔다!");
				System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
				System.out.println(c1.name() + " LOSE...");
				System.out.println(c2.name() + " WIN!!");
				break;
			}
			info();
			System.out.println(c2.name() + "(이)의 행동선택");
			System.out.println("1. 공격 | 2. 물약 섭취 | 3. 도망가기");
			you = scan.nextInt();
			if(you == 1) {
				attack2_1();
				if(c1.hart <= 0) {
					c1.hart = 0;
					info();
					System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
					System.out.println(c1.name() + " LOSE...");
					System.out.println(c2.name() + " WIN!!");
					break;
				}
			} else if(you == 2) {
				heal2();
			} else if(you == 3) {
				System.out.println(c2.name() + "(이)가 도망갔다!");
				System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
				System.out.println(c2.name() + " LOSE...");
				System.out.println(c1.name() + " WIN!!");
				break;
			}
			info();
		}
	}
	
	
	/**
	~ information 메소드 ~
		캐릭터 생성 후 초기 정보를 보여줌
		
		@param X
		@return X
	*/
	void information() {
		System.out.println("~ " + c1.name() + "(이)의 정보 ~ ");
		System.out.println("HP : " + c1.hart);
		System.out.println("공격력 : " + c1.attack());
		System.out.println("물약 효능 : " + c1.heal());
		System.out.println("-----------------------------------------");
		System.out.println("~ " + c2.name() + "(이)의 정보 ~ ");
		System.out.println("HP : " + c2.hart);
		System.out.println("공격력 : " + c2.attack());
		System.out.println("물약 효능 : " + c2.heal());
		System.out.println("=========================================");

	}
	
	/**
	~ info 메소드 ~
		게임이 진행 될 때 어떤 선택 후 캐릭터의 체력을 보여줌
		
		@param X
		@return X
	*/
	void info() {
		System.out.println("=========================================");
		System.out.println(c1.name() + " - HP : " + c1.hart);
		System.out.println(c2.name() + " - HP : " + c2.hart);
		System.out.println("-----------------------------------------");
		}
	
	
	/**
	~ attack1_2 메소드 ~
		1번 캐릭터가 2번 캐릭터에게 공격
		 - 2번 캐릭터의 방어력은 랜덤(1 ~ 15)
		 - 공격 시, 1번 캐릭터의 공격력 - 2번 캐릭터의 방어력 만큼의 HP가 줄어듬
		 - 2번 캐릭터의 방어력이 더 높거나 같은 경우 "공격을 피했다" 출력, HP는 0 줄어듬
		
		@param X
		@return X
	*/
	void attack1_2() {
		defend = (int)(Math.random() * 15) + 1;
		System.out.println(c1.name() + " 공격! (공격력 : " + c1.attack() + ")");
		System.out.println(c2.name() + " 방어! (방어력 : " + defend + ")");
		int a = c1.attack() - defend;
		if(a <= 0) {
			a = 0;
			System.out.println(c2.name + "은(는) " + c1.name + "의 가볍게 공격을 피했다! ");
		}
		c2.hart -= a;
		System.out.println(c2.name() + "(이)의 HP가 " + a + "만큼 줄어들었다...");
	}
	
	/**
	~ attack2_1 메소드 ~
		2번 캐릭터가 1번 캐릭터에게 공격
		 - 1번 캐릭터의 방어력은 랜덤(1 ~ 15)
		 - 공격 시, 2번 캐릭터의 공격력 - 1번 캐릭터의 방어력 만큼의 HP가 줄어듬
		 - 2번 캐릭터의 공격력 - 1번 캐릭터의 방어력이 음수일 경우 0으로 맞춰줌
		 - 1번 캐릭터의 방어력이 더 높거나 같은 경우 "공격을 피했다" 출력, HP는 0 줄어듬
		
		@param X
		@return X
	*/
	void attack2_1() {
		defend = (int)(Math.random() * 15) + 1;
		System.out.println(c2.name() + " 공격! (공격력 : " + c2.attack() + ")");
		System.out.println(c1.name() + " 방어! (방어력 : " + defend + ")");
		int a = c2.attack() - defend;
		if(a <= 0) {
			a = 0;
			System.out.println(c1.name + "은(는) " + c2.name + "의 가볍게 공격을 피했다! ");
		}
		c1.hart -= a;
		System.out.println(c1.name() + "(이)의 HP가 " + a + "만큼 줄어들었다...");
	}
	

	/**
	~ heal1 메소드 ~
		1번 캐릭터의 체력 회복
		 - 1번의 캐릭터 회복력 만큼 HP가 올라감
		 - 체력회복을 많이 할 수록 회복력이 떨어짐
		 - 체력 + 회복력이 100 초과일 시 100으로 맞춰줌
		
		@param X
		@return X
	*/
	void heal1() {
		System.out.println(c1.name() + " 물약 섭취!");
		c1.hart += c1.heal;

		if(c1.hart > 100) {
			c1.hart = 100;
		}

		count1++;
		System.out.println(c1.name() + "(이)의 HP가 " + c1.heal + "만큼 늘어났다!");
		for(int i = 0; i < 100; i+=2) {
			if(count1 == i) {
				c1.heal--;
			}
		}
	}
	
	/**
	~ heal2 메소드 ~
		2번 캐릭터의 체력 회복
		 - 2번의 캐릭터 회복력 만큼 HP가 올라감
		 - 체력회복을 많이 할 수록 회복력이 떨어짐
		 - 체력 + 회복력이 100 초과일 시 100으로 맞춰줌
		
		@param X
		@return X
	*/
	void heal2() {
		System.out.println(c2.name() + " 물약 섭취!");
		c2.hart += c2.heal;
	
		if(c2.hart > 100) {
			c2.hart = 100;
		}
		
		count2++;
		for(int i = 0; i < 100; i+=2) {
			if(count2 == i) {
				c2.heal--;
			}
		}
	}
	
}
