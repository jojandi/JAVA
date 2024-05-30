package sec02.exam01;

import java.util.Scanner;

public class WhileExam {

	public static void main(String[] args) {
		
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
		Scanner scan = new Scanner(System.in);
//		System.out.println("메뉴를 고르세요.");
//		System.out.println("1: 커피, 2: 차, 3: 음료, 0: 종료");
//		int menu = scan.nextInt();
//		if(menu == 1) {
//			System.out.println("커피를 드리겠습니다. ");
//		} else if(menu == 2) {
//			System.out.println("홍차 만들게요. ");
//		} else if(menu == 3) {
//		System.out.println("음료 드릴게요. ");
//		} else if(menu == 0) {
//		System.out.println("다음에 또 오세요. ");
//		}
		
		
		
//		if(menu != 0) {
//			System.out.println("메뉴를 고르세요.");
//			System.out.println("1: 커피, 2: 차, 3: 음료, 0: 종료");
//			menu = scan.nextInt();
//			if(menu == 1) {
//				System.out.println("커피를 드리겠습니다. ");
//			} else if(menu == 2) {
//				System.out.println("홍차 만들게요. ");
//			} else if(menu == 3) {
//			System.out.println("음료 드릴게요. ");
//			} else if(menu == 0) {
//			System.out.println("다음에 또 오세요. ");
//			}
//		}
	
	/*
		int menu = -1; // -1 : 임의의 값, 0이 아닌 값을 적어둠 => while 실행을 위해
		
		// while : 몇 번 반복할지 모를 때 사용
		while (menu != 0) {
			System.out.println("메뉴를 고르세요.");
			System.out.println("1: 커피, 2: 차, 3: 음료, 0: 종료");
			menu = scan.nextInt();
			
			if(menu >= 0 && menu <= 3) {				
				if(menu == 1) {
					System.out.println("커피를 드리겠습니다. ");
				} else if(menu == 2) {
					System.out.println("홍차 만들게요. ");
				} else if(menu == 3) {
					System.out.println("음료 드릴게요. ");
				} else if(menu == 0) {
					System.out.println("다음에 또 오세요. ");
				}
			} else {
				System.out.println("메뉴를 다시 선택해주세요. ");
				// 방어코딩
			}
		}
		System.out.println("영업이 종료되었습니다. ");
		
	*/
		
		
		// do-while : while문 안에 내용을 그 위에 한 번 더 쓰는 경우 사용
		int menu;
		do {
			System.out.println("메뉴를 고르세요.");
			System.out.println("1: 커피, 2: 차, 3: 음료, 0: 종료");
			menu = scan.nextInt();
		} while(menu != 0); 
			if(menu >= 0 && menu <= 3) {				
				if(menu == 1) {
					System.out.println("커피를 드리겠습니다. ");
				} else if(menu == 2) {
					System.out.println("홍차 만들게요. ");
				} else if(menu == 3) {
					System.out.println("음료 드릴게요. ");
				} else if(menu == 0) {
					System.out.println("다음에 또 오세요. ");
				}
			} else {
				System.out.println("메뉴를 다시 선택해주세요. ");
				// 방어코딩
			}
		
		
	}

}
