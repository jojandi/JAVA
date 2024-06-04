package sec02.exam01;

import java.util.Scanner;

public class BankExam {

	public static void main(String[] args) {
		
		/*
		~ 은행 계좌의 잔고 관리 시스템 ~
		
			1. 입금 : 잔액 +
				- 0 또는 음수는 실행 X(금액을 확인하세요)
			2. 출금 : 잔액 -
				- 잔액보다 큰 금액은 실행 X(잔고가 부족합니다)
			3. 조회 : 잔액 출력
			4. 종료 : break;
		*/
		
		int m = 10000;	//잔액
		System.out.println("서비스를 시작합니다. ");
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("----------------------------------");
			System.out.println("이용하실 서비스를 선택하세요. ");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			int a = scan.nextInt();
			System.out.println("----------------------------------");
			System.out.println("선택> "+ a);
			System.out.println();
			
			if(a == 1) {	//예금
				System.out.println("예금액을 입력하세요. ");
				int i = scan.nextInt();
				if(i > 0) {
					System.out.println("예금액\t: "+ i +"원");
					m = m + i;
					System.out.println("잔액\t: "+ m +"원");
				} else {
					System.out.println("입금 금액을 다시 확인하세요. ");
				}
			} 
			
			if(a == 2) {	//출금
				System.out.println("출금할 금액을 입력하세요. ");
				int i = scan.nextInt();
				if(i <= m) {
					System.out.println("출금액\t: "+ i +"원");
					m = m - i;
					System.out.println("잔액\t: "+ m +"원");
				} else {
					System.out.println("잔액이 부족합니다. ");
					System.out.println("현재 잔액\t: "+ m +"원");
				}
			}
			
			if(a == 3) {	//잔액
				System.out.println("현재 잔액\t: "+ m +"원");
			}
			
			if(a == 4) {
				System.out.println("서비스를 종료합니다. ");
				break;
			}
			
			if(a != 1 && a != 2 && a != 3 && a != 4) {
				System.out.println("다시 선택해주세요. ");
			}
			System.out.println();
		}
	}

}
