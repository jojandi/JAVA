package exam;

import java.util.Scanner;

public class Bank {
	//은행 계좌 개설

	// 메소드
	// 입금 : 단 음수 입력 막기
	// 출금 : 단 음수, 잔액보다 큰 수 출금 막기
	// 확인 : 잔액 출력
	
	Scanner scan = new Scanner(System.in);
	
	int money = 0;
	String bname;
	
	Bank(String bname){
		this.bname = bname;
		System.out.println(this.bname + "의 계좌를 개설합니다. ");
		System.out.println("=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=");
	}
	
	/**
		bank 메소드
			스캔 받아온 값에 따라 입금, 출금, 확인, 종료 기능을넣음
			while 문으로 스캔 받아오는 you의 값이 4일 때 종료
			전달인자 : X
			리턴타입 : void
	*/
	void bank() {
		int you = 1;
		while(you != 4) {
			System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
			you = scan.nextInt();
			if(you == 1) {
				in();
			} else if(you == 2) {
				out();
			} else if(you == 3) {
				chk();
			}
			else if(you == 4) {
				System.out.println("시스템을 종료합니다. ");
			}else{
				System.out.println("잘못된 선택입니다. ");
			}
		}
	}
	

	void in () {
		System.out.println("입금할 금액을 입력하세요. ");
		int a = scan.nextInt();
		if(a > 0) {		
			System.out.println(a + "원을 입금합니다. ");
			money += a;
			System.out.println("잔액 : " + money);
			System.out.println("=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=");
		} else {
			System.out.println("입금액이 잘못됐습니다. ");
			System.out.println("=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=");
		}
		
	}
	

	void out () {
		System.out.println("출금할 금액을 입력하세요. ");
		int a = scan.nextInt();
		if(money >= a) {	
			if(a > 0) {
				System.out.println(a + "원을 출금합니다. ");
				money -= a;
				System.out.println("잔액 : " + money);
				System.out.println("=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=");
			} else {
				System.out.println("출금액이 잘못됐습니다. ");
				System.out.println("=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=");
			}
		} else {
			System.out.println("잔액이 부족합니다. ");
			System.out.println("잔액 : " + money);
			System.out.println("=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=");
		}
		
	}
	void chk () {
		System.out.println(bname + "계좌의 잔액을 확입합니다. ");
		System.out.println("잔액 : " + money);
		System.out.println("=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=");
	}
	
}
