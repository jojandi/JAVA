package exam;

public class Student {

	// 값
	// 이름, 나이, 주소, 성별, 전공, 안경 착용 여부
	String name;
	int age;
	String addr;
	int gender;
	String major;
	boolean hasGlasses;

	int intel = 0; // 지식
	int stress = 0; // 스트레스
	int hp = 100; // 체력
	int hungry = 0; // 허기
	
	Student(String n, int a){
		name = n;
		age = a;
	}
	Student(String name){
		this(name, 100);
	}
	Student(){
		this("null", 0);
	}
	
	
	//행동
	// 공부, 식사, 수면, 게임
	
	/**
	공부 메소드
		: 공부 내용 출력 및 아래 것들 값 조절
		-> 지식 up, 스트레스 up, 체력 down, 허기 up
		
		전달인자 : 공부한 내용 -> String
		리턴타입 : 지식 -> int
	*/
	int study(String subject) {
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("\n " + name + " 이(가) " + subject + "을(를) 공부했다!\n");
		System.out.println("-----------------------------------------------------------------------------------------");
		
		intel += 8;
		stress += 15;
		hp -= 10;
		hungry += 10;
		
		return intel;
	}
	/**
	공부 메소드 - 게임 메소드
		: 게임할 때(게임할 때 공부 메소드 불러옴)와 공부할 때 받는 스트레스를 조절하자
	
		전달인자 : 게임 이름 -> String, 스트레스 -> int
		리턴타입 : 스트레스
		
	*/
	int study(String game, int st) {
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("\n" + name + " 이(가) " + game + "을(를) 했더니 스트레스가 " + st + "만큼 증가했다!\n");
		System.out.println("-----------------------------------------------------------------------------------------");
		
		intel += 5;
		stress += st;
		
		return stress;
	}
	
	
	/**
	식사 메소드
		: 먹은 것 출력 및 아래 것들 값 조절
		-> 지식 -, 스트레스 down, 체력 up, 허기 down
		
		전달인자 : 음식 -> String
		리턴타입 : 허기 -> int
	*/
	int eat(String menu) {
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("\n" + name + " 이(가) " + menu + "을(를) 먹었다!");
		System.out.println(menu + "은(는) 너무 맛있어! \n");
		System.out.println("-----------------------------------------------------------------------------------------");
		
		hp += 3;
		stress -= 10;
		hungry -= 30;
		
		return hungry;
	}
	
	
	/**
	수면 메소드
		: 몇 시간 잤는지 출력 및 아래 것들 값 조절
		-> 지식 -, 스트레스 down, 체력 up, 허기 up
		
		전달인자 : 시간 -> int
		리턴타입 : X
	*/
	void sleep(int hour) {
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("\n" + hour + "시간 동안 숙면...\n");
		System.out.println("-----------------------------------------------------------------------------------------");
		
		hp += 30;
		stress -= 10;
		hungry += 10;
	}
	
	
	/**
	게임 메소드
		: 무슨 게임 했는지 출력 및 아래 것들 값 조절
		-> 지식 -, 스트레스 down, 체력 down, 허기 up
		
		전달인자 : 게임 종류 -> String ( + 몇 시간 게임했는지 -> int / double )
		리턴타입 : X
	*/
	void game(String game) {
		game(game, 1);
	}
	void game(String game, int hour) {
		if(hour > 0) {
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("\n"+ hour + "시간만 해야지..!");
			System.out.println(game + "은(는) 참 재미있어! \n");
			
			for(double i = 0; i < hour; i += 0.5) {	
				if(i == 0) {
					// 0시간일 때 1시간 뒤가 출력 되면 안됨
				} else if(i % 1 == 0){
					System.out.println("~ 1시간 뒤... ~");
					int j = (int) i;
					System.out.println(j + "시간밖에 안 지났으니 한 판만 더 할까..? \n");										
				}else {
					System.out.println("~ 30분 뒤... ~");
					System.out.println("헉! 벌써 30분이나 지났네! \n");						
				}
			}
			
			// 민정아 안녕 ? 내가 누구게 이렇게 말해도 넌 알겠지
			// 나를 너무 좋아하는 거 아니니 ? 하 나의 인기란 !
			// 정은언니가 씀.	
			
			System.out.println(name + " 은(는) " +hour + "시간 동안 몰입했다...");
			if(hour <= 2) {
				System.out.println("오늘은 잘 안 되네... 그만하자... \n");
				stress += 5;
			} else if(hour <= 4) {
				System.out.println("뭐 괜찮네! \n");
				stress -= 10;
			} else {
				System.out.println("너무 재미있다! \n");
				stress -= 20;
			}
			
			study(game, 3);
			
			hp -= 5 * hour;
			hungry += 5 * hour;
			
		} else {
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("\n 정신차려. " + hour + "시간은 없어. \n");		
			System.out.println("-----------------------------------------------------------------------------------------");
		}
	}

	// 내 정보 보기
	// 자동 완성
	// 우클릭 -> source -> Generate toString()...
//	@Override
//	public String toString() {
//		return "~ 학생정보 ~ \n"
//				+ " [ 이름 : " + name + " | 나이 : " + age + " | 주소 : " + addr + " | 성별 : " + gender
//				+ " | 전공 : " + major + " | 안경 여부 : " + hasGlasses + " ] "
//				+ "\n [ 지식 : " + intel + " | 스트레스 : " + stress + " | 체력 : " + hp + " | 허기 : "+ hungry + " ]";
//	}
	@Override
	public String toString() {
		return 
				name + "(" + age + ")";
	}
	
}
