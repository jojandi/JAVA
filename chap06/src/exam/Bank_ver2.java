package exam;

public class Bank_ver2 {
	//은행 계좌 개설

	// 메소드
	// 입금 : 단 음수 입력 막기
	// 출금 : 단 음수, 잔액보다 큰 수 출금 막기
	// 확인 : 잔액 출력
	
	int money = 0; // 계좌 잔액
	String bname; // 은행 이름
	
	Bank_ver2(String bname){
		this.bname = bname;
		System.out.println(this.bname + "의 계좌를 개설합니다. ");
		System.out.println("=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=");
	}
	
	/**
		in 메소드 (입금)
			기존 잔액 + 입금액
			 - 전달인자가 음수인 경우 더하지 않음
			 
			@param 입금액 -> int
			@return void
	*/
	void in (int money) {
		if(money > 0) {		
			System.out.println(money + "원을 입금합니다. ");
			this.money += money;
			System.out.println("잔액 : " + this.money);
			System.out.println("=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=");
		} else {
			System.out.println("입금액이 잘못됐습니다. ");
			System.out.println("=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=");
		}
		
	}
	
	/**
		out 메소드 (출금)
			기존 잔액 - 출금액
			 - 전달인자가 음수인 경우 출금하지 않음
			 - 전달인자보다 기존 잔액이 클 경우 출금하지 않음
			
			@param 출금액 -> int
			@return void 
	*/
	void out (int money) {
		if(this.money >= money) {	
			
			if(money > 0) {
				System.out.println(money + "원을 출금합니다. ");
				this.money -= money;
				System.out.println("잔액 : " + money);
				System.out.println("=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=");
			} else {
				System.out.println("출금액이 잘못됐습니다. ");
				System.out.println("=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=");
			}
			
		} else {
			System.out.println("잔액이 부족합니다. ");
			System.out.println("=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=");
		}
		
	}
	
	/**
		chk 메소드 (잔액 확인)
			현재 잔액 출력
			
			@param X
			@return void
	*/
	void chk () {
		System.out.println(bname + "계좌의 잔액을 확입합니다. ");
		System.out.println("잔액 : " + money);
		System.out.println("=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=");
	}
	
}
