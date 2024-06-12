package exam;

import java.util.Scanner;

public class JavaTest {

	public static void main(String[] args) {

		// 커피 키오스크
		// 1. 메뉴 선택하는 창이 필요
		// 2. 메뉴를 선택했으면 옵션을 선택
		// 3. 옵션에 따라 출력
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("----------------------------------------------------------");
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1. 아이스아메리카노| 2. 바닐라라떼 | 3. 아이스티 | 0. 종료");
			System.out.println("----------------------------------------------------------");
			int you = scan.nextInt();
			
			if(you == 1) {
				System.out.println("아이스아메리카노를 선택하셨습니다. ");
				System.out.println("1. 샷추가 | 2. 연하게 | 3. 휘핑크림 추가 | 4. 선택 X");
				int op = scan.nextInt();
				if(op == 1) {
					System.out.println("샷추가 되었습니다. ");
				}
			}
			if(you == 2) {
				
			}
			if(you == 3) {
				
			}
			if(you == 0) {
				System.out.println("시스템을 종료합니다. ");
				break;
			}
		}
		
	}

}
