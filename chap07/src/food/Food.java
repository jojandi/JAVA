package food;

public class Food {
	
	String name; // 음식이름
	int price; // 가격
	String recipe; // 주재료
	String type; // 종료
	int star; // 별점
	
//	Food(){
//		System.out.println("~ FOOD ~");
//	}
	
	/**
	 * eat 메소드
	 * 
	 * 메소드 실행 시 "name을 먹었습니다" 출력
	 * 랜덤으로 별점 지정됨
	 * 
	 * 전달인자 : 없음
	 * 리턴타입 : 없음
	*/
	void eat() {
		star = (int)(Math.random() * 5) + 1;
		System.out.println(this.name + "을 먹었다!");
		System.out.println(this.name + "의 별점은 " + star + "점이야.\n");
	}
	
	/**
	 * order 메소드
	 * 
	 * 메소드 실행 시 음식을 주문하고 먹기
	 * money의 값(내가 지불한 금액)과 price의 값(음식 값)을 비교하여 조건에 맞게 출력
	 * 
	 * 전달인자 : String 음식이름, int 가격
	 * 리턴타입 : int 거스름돈
	 * 
	*/
	int order(int money) {	
		
		want();
		
		int change = 0; // 거스름돈
		
		System.out.println(this.name + "을(를) 주문했다. \n");
		
		if(money >= this.price) {			
			eat();
			
			if(star == 5) {
				System.out.println("'주방장님 제발 저와 결혼해주세요..'");
			} else if(star >= 3) {
				System.out.println("'" + this.name + "은 실패할 수 없지~'");
			} else {
				System.out.println("'아 돈 아까워...'");
			}
			
			change = this.price - money;
			System.out.println("\n" + this.price + "원을 지불! ");
			System.out.println("거스름 돈 " + change* (-1) + "원을 받았다. ");
		} else {
			System.out.println(this.name + "을 먹기엔 돈이 부족해...");
			System.out.println("다음에는 " + this.price + "원을 가져오자!");
		}
		
		return change;
	}
	
	/**
	 * cook 메소드
	 * 
	 *  메소드 실행 시 "recipe를 사용하여 name을 요리합니다" 출력
	 *  eat 메소드를 가져와서 먹고, 나온 별점에 수치에 따라 조건 출력
	 *  
	 *  전달인자 : String 음식이름, String 주재료
	 *  리턴타입 : String 음식이름
	*/
	String cook() {	
		want();
		
		System.out.println(this.recipe + "을(를) 사용하여 " + this.name + "을(를) 요리했다! \n");
		eat();
		
		if(star == 5) {
			System.out.println("'역시 나는 요리 천재야!'");
		} else if(star >= 3) {
			System.out.println("'" + this.name + "은 실패할 수 없지~'");
		} else {
			System.out.println("'내가 만든거니까 다 먹어야지...'");
		}
		
		return name;
	}
	
	
	/**
	 * wnat 메소드
	 * 
	 * 어떤 행동을 실행하기 전, 어떤 음식을 실행시킬지 예고하는 느낌
	 * 
	 * 전달인자 : 없음
	 * 리턴타입 : 없음
	*/
	void want() {
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("\n" + this.name + "이 먹고싶네...\n");
		System.out.println("-----------------------------------------------------------------------");

	}

}
