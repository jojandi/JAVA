package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class 생산관리JAVA_조민정 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int price = 0;
		ArrayList list = new ArrayList();
		
		System.out.println("==================================================================");
		System.out.println("커피 생산 서비스를 시작합니다. ");
		
		while(true) {
			System.out.println("==================================================================");
			System.out.println
			("1. 커피 | 2. 음료 | 3. 티 | 4. 장바구니 | 5. 결제하기 | 0. 종료");
			System.out.println("------------------------------------------------------------------");
			int one = scan.nextInt();
			
			if(one == 1) { // 커피
				System.out.println
				("1. 아메리카노(2000원) | 2. 카페라뗴(3000원) | 3. 바닐라라뗴(3200원) | 0. 처음으로");
				int you = scan.nextInt();
				
				if(you == 1) { // 아메리카노	
					price += 2000;
					while(true) { // hot/ice
						System.out.println("------------------------------------------------------------------");
						System.out.println("1. HOT | 2. ICE");
						int op = scan.nextInt();
						
						if(op == 1) {
							list.add("아메리카노(HOT)");
							break;
						}
						else if(op == 2) { 
							list.add("아메리카노(ICE)");
							break;
						} 
						else { // 존재하지 않는 선택지
							System.out.println
							("존재하지 않는 선택지입니다. 처음으로 돌아갑니다. ");
							continue;
						} // 존재하지 않는 선택지 끝
					} // hit/ice 끝
					System.out.println("주문내역 : " + list);
					System.out.println("총 금액 : " + price + "원");
				} // 아메리카노 끝
				
				else if(you == 2) { // 카페라뗴
					price += 3000;
					while(true) { // hot/ice
						System.out.println("------------------------------------------------------------------");
						System.out.println("1. HOT | 2. ICE");
						int op = scan.nextInt();
						
						if(op == 1) {
							list.add("카페라뗴(HOT)");
							break;
						}
						else if(op == 2) { 
							list.add("카페라뗴(ICE)");
							break;
						} 
						else { // 존재하지 않는 선택지
							System.out.println
							("존재하지 않는 선택지입니다. 처음으로 돌아갑니다. ");
							continue;
						} // 존재하지 않는 선택지 끝
					} // hit/ice 끝
					System.out.println("주문내역 : " + list);
					System.out.println("총 금액 : " + price + "원");
				} // 카페라뗴 끝
				
				else if(you == 3) { // 바닐라라뗴
					price += 3200;
					while(true) { // hot/ice
						System.out.println("------------------------------------------------------------------");
						System.out.println("1. HOT | 2. ICE");
						int op = scan.nextInt();
						
						if(op == 1) {
							list.add("바닐라라뗴(HOT)");
							break;
						}
						else if(op == 2) { 
							list.add("바닐라라뗴(ICE)");
							break;
						} 
						else { // 존재하지 않는 선택지
							System.out.println
							("존재하지 않는 선택지입니다. 처음으로 돌아갑니다. ");
							continue;
						} // 존재하지 않는 선택지 끝
					} // hit/ice 끝
					System.out.println("주문내역 : " + list);
					System.out.println("총 금액 : " + price + "원");
				} // 바닐라라뗴 끝
				
				else if(you == 0) { // 처음으로
					continue; 
				} // 처음으로 끝
				
				else { // 존재하지 않는 선택지
					System.out.println
					("존재하지 않는 선택지입니다. 처음으로 돌아갑니다. ");
					continue;
				} // 존재하지 않는 선택지 끝
			} // 커피 끝
			
			else if(one == 2) { // 음료
				System.out.println
				("1. 청포도에이드(only ice)(4000원) | 2. 수박주스(only ice)(4500원) | 3. 딸기라뗴(only ice)(4500원) | 0. 처음으로");
				int you = scan.nextInt();
				
				if(you == 1) { // 청포도에이드	
					price += 4000;
					while(true) { // 펄추가
						System.out.println("------------------------------------------------------------------");
						System.out.println("1. 옵션 선택 X | 2. 펄 추가(+500원)");
						int op = scan.nextInt();
						
						if(op == 1) { 
							list.add("청포도에이드");
							break;
						}
						else if(op == 2) { 
							list.add("청포도에이드 - 펄 추가");
							price += 500;
							break;
						} 
						else { // 존재하지 않는 선택지
							System.out.println
							("존재하지 않는 선택지입니다. 처음으로 돌아갑니다. ");
							continue;
						} // 존재하지 않는 선택지 끝
					} // 펄추가 끝
					System.out.println("주문내역 : " + list);
					System.out.println("총 금액 : " + price + "원");
				} // 청포도에이드 끝
				
				else if(you == 2) { // 수박주스
					price += 4500;
					while(true) { // 수박 추가
						System.out.println("------------------------------------------------------------------");
						System.out.println("1. 옵션 선택 X | 2. 수박 추가(+1000원)");
						int op = scan.nextInt();
						
						if(op == 1) {
							list.add("수박주스");
							break;
						}
						else if(op == 2) { 
							list.add("수박주스 - 수박 추가");
							price += 1000;
							break;
						} 
						else { // 존재하지 않는 선택지
							System.out.println
							("존재하지 않는 선택지입니다. 처음으로 돌아갑니다. ");
							continue;
						} // 존재하지 않는 선택지 끝
					} // 수박 추가 끝
					System.out.println("주문내역 : " + list);
					System.out.println("총 금액 : " + price + "원");
				} // 수박주스 끝
				
				else if(you == 3) { // 딸기라뗴
					price += 4500;
					while(true) { //휘핑크림 추가
						System.out.println("------------------------------------------------------------------");
						System.out.println("1. 옵션 선택 X | 2. 휘핑크림 추가(+500원)");
						int op = scan.nextInt();
						
						if(op == 1) { 
							list.add("딸기라뗴");
							break;
						}
						else if(op == 2) { 
							list.add("딸기라떼 - 휘핑크림 추가");
							price += 500;
							break;
						} 
						else { // 존재하지 않는 선택지
							System.out.println
							("존재하지 않는 선택지입니다. 처음으로 돌아갑니다. ");
							continue;
						} // 존재하지 않는 선택지 끝
					} // 휘핑크림 끝
					System.out.println("주문내역 : " + list);
					System.out.println("총 금액 : " + price + "원");
				} // 딸기라뗴 끝
				
				else if(you == 0) { // 처음으로
					continue; 
				} // 처음으로 끝
				
				else { // 존재하지 않는 선택지
					System.out.println
					("존재하지 않는 선택지입니다. 처음으로 돌아갑니다. ");
					continue;
				} // 존재하지 않는 선택지 끝
			} // 음료 끝
			
			else if(one == 3) { // 티
				System.out.println
				("1. 아이스티(2500원) | 2. 자몽허니블랙티(3000원) | 0. 처음으로");
				int you = scan.nextInt();
				
				if(you == 1) { // 아이스티	
					price += 2500;
					while(true) { // hot/ice
						System.out.println("------------------------------------------------------------------");
						System.out.println("1. HOT | 2. ICE");
						int op = scan.nextInt();
						
						if(op == 1) {
							list.add("아이스티(HOT)");
							break;
						}
						else if(op == 2) { 
							list.add("아이스티(ICE)");
							break;
						} 
						else { // 존재하지 않는 선택지
							System.out.println
							("존재하지 않는 선택지입니다. 처음으로 돌아갑니다. ");
							continue;
						} // 존재하지 않는 선택지 끝
					} // hit/ice 끝
					System.out.println("주문내역 : " + list);
					System.out.println("총 금액 : " + price + "원");
				} // 아이스티 끝
				
				else if(you == 2) { // 자몽허니블랙티
					price += 3000;
					while(true) { // hot/ice
						System.out.println("------------------------------------------------------------------");
						System.out.println("1. HOT | 2. ICE");
						int op = scan.nextInt();
						
						if(op == 1) {
							list.add("자몽허니블랙티(HOT)");
							break;
						}
						else if(op == 2) { 
							list.add("자몽허니블랙티(ICE)");
							break;
						} 
						else { // 존재하지 않는 선택지
							System.out.println
							("존재하지 않는 선택지입니다. 처음으로 돌아갑니다. ");
							continue;
						} // 존재하지 않는 선택지 끝
					} // hit/ice 끝
					System.out.println("주문내역 : " + list);
					System.out.println("총 금액 : " + price + "원");
				} // 자몽허니블랙티 끝
				
				else if(you == 0) { // 처음으로
					continue; 
				} // 처음으로 끝
				
				else { // 존재하지 않는 선택지
					System.out.println
					("존재하지 않는 선택지입니다. 처음으로 돌아갑니다. ");
					continue;
				} // 존재하지 않는 선택지 끝
				
			} // 티 끝
			
			else if(one == 4) { // 장바구니
				System.out.println("장바구니 : " + list);
				System.out.println("총 금액 : " + price + "원");
			} // 장바구니 끝
			
			else if(one == 5) { // 결제하기
				System.out.println("주문내역 : " + list);
				System.out.println("총 결제 금액 : " + price + "원");
				System.out.println("------------------------------------------------------------------");
				System.out.println("추가하실 내역이 있나요?");
				System.out.println("1. 있음 | 2. 없음");
				int more = scan.nextInt();
				if(more == 1) {
					System.out.println("처음으로");
					continue;
				} 
				else if(more == 2) {
					System.out.println("결제를 진행합니다. ");
					System.out.println("총 결제 금액 : "+ price +"원 입니다. ");
					System.out.println("내실 금액을 입력해주세요. ");
					while(true) {
						int money = scan.nextInt();
						if(money >= price) {
							int a = money - price;
							System.out.println("거스름돈은 "+a+"원 입니다. ");
							System.out.println("감사합니다. ");
							break;
						} else {
							System.out.println("잔액이 부족합니다. 다시 입력해주세요. ");
							continue;
						}
					}
				} 
				else { // 존재하지 않는 선택지
					System.out.println
					("존재하지 않는 선택지입니다. 처음으로 돌아갑니다. ");
					continue;
				} // 존재하지 않는 선택지 끝
				list.clear();
				price = 0;
			} // 결제하기 끝
			
			else if(one == 0) { // 종료 끝
				System.out.println("커피 생산 서비스를 종료합니다. ");
				break;
			} // 종료 끝
			
		}
	}

}
