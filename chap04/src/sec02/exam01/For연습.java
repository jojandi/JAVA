package sec02.exam01;

import java.util.Scanner;

public class For연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// a는 음수? 양수?(0 = 양수) 
		/*
		~ 1회성 ~
		int a = scan.nextInt();
		if(a >= 0) {
			System.out.println(a+"는 양수입니다.");
		} else {
			System.out.println(a+"는 음수입니다.");
		}
		*/
		
		
		/*
		~ 3회 반복 ~
		for(int a  = 1; a != 0; ) {
			System.out.println("숫자를 입력해주세요. (종료 : 0)");
			a = scan.nextInt();
			if(a >= 0) {
				System.out.println(a+"는 양수입니다.");
			} else {
				System.out.println(a+"는 음수입니다.");
			}
		}
		*/
	
		
		// ~ a가 0이 아닐 시 무한 반복 ~ 
		for(int a = 1; a != 0; ) {
			System.out.println("숫자를 입력해주세요. (종료 : 0)");
			a = scan.nextInt();
			if(a >= 0) {
				System.out.println(a+"는 양수입니다.");
			} else {
				System.out.println(a+"는 음수입니다.");
			}
		}
		System.out.println("종료되었습니다.");
		
	
		
		//피라미드
		//0단계
		for(int k = 1; k <= 5; k++) {
			System.out.println("+");
		}
	
	}

}
