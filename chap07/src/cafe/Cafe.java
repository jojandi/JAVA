package cafe;

public class Cafe {

	String[] menu = new String[10];
	int[] price = new int[10];
	String name;
	
	Cafe() {
		this.menu[1] = "아이스아메리카노";
		this.price[1] = 2000;
		
		this.menu[2] = "아이스티";
		this.price[2] = 2500;
		
		this.menu[3] = "카페라떼";
		this.price[3] = 2900;
		
		this.menu[4] = "바닐라라떼";
		this.price[4] = 3400;
		
		this.menu[5] = "초코라뗴";
		this.price[5] = 4000;
		
		this.menu[6] = "딸기라뗴";
		this.price[6] = 3700;
		
		this.menu[7] = "청포도에이드";
		this.price[7] = 3500;
		
	}
	
	
	/**
	 * 주문 메소드
	 * 
	 *  전달인자로 메뉴 받아서 메뉴 존재 유무에 따라 조건문 출력
	 *  
	 *  전달인자 : Stgring 메뉴
	 *  리턴타입 : X
	*/
	void order(String menu) {
		System.out.println("\n" + menu + "을(를) 주문하셨습니다.");
		
		boolean is = false;
		
		for(int i = 0; i < this.menu.length; i++) {
			if(menu.equals(this.menu[i])) {
				System.out.println("가격은 " + this.price[i] + "원 입니다!");
				is = true;
			} 
		}
		
		if(!is){		
			System.out.println("\n" + menu + "은(는) " + this.name + "에서 판매하고 있지 않습니다... ");				
		}
		System.out.println("\n---------------------------------------------------------------------------");
	}
	
	
	/**
	 * 지불 메소드
	 * 
	 * 전달인자로 돈과 메뉴 받고 메뉴가격에 맞춰 계산
	 * 존재하지 않는 메뉴는 계산할 수 없음(해당 메뉴는 없다 출력)
	 * 
	 * 전달인자 : String 메뉴, int 돈
	 * 리턴타입 : X
	*/
	void pay(String menu,int money) {
		boolean is = false;
		
		for(int i = 0; i < this.menu.length; i++) {
			
			if(menu.equals(this.menu[i])) {
				System.out.println("\n" + this.menu[i] + "의 가격은 " + this.price[i] + "원 입니다!\n");
				
				is = true;
				
				if(money >= this.price[i]) {
					System.out.println(money + "원 받았습니다. ");
					int a = (this.price[i] - money) * (-1);
					System.out.println("거스름돈은 " + a + "원 입니다. 감사합니다!");
				} else {
					System.out.println("돈이 부족합니다. 다음에 다시 오세요~");
				}	
			}			
		}
		
		if(!is){		
			System.out.println("\n" + menu + "은(는) " + this.name + "에서 판매하고 있지 않습니다... ");				
		}
		System.out.println("\n---------------------------------------------------------------------------");
	}
	
}
