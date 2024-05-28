package sec01.exam01;

import java.util.Scanner;

public class 가위바위보 {

	public static void main(String[] args) {
		
		System.out.println("-----------------------");
		double one = Math.random();
		int one_1 = ((int)(one * 10000) % 3) + 1;
		if(one_1 == 1) {
			System.out.println("palyer1 : 바위" );
		} else if(one_1 == 2) {
			System.out.println("palyer1 : 가위" );
		} else {
			System.out.println("palyer1 : 보" );
		}
		
		double two = Math.random();
		int one_2 = ((int)(two * 10000) % 3) + 1;
		if(one_2 == 1) {
			System.out.println("palyer2 : 바위" );
		} else if(one_2 == 2) {
			System.out.println("palyer2 : 가위" );
		} else {
			System.out.println("palyer2 : 보" );
		}
		
		// 바위 : 1, 가위 : 2, 보 : 3
		
		if(((one_1 == 1) && (one_2 == 3)) || 
			((one_1 == 2) && (one_2 == 1)) ||
			((one_1 == 3) && (one_2 == 2))) {
			System.out.println("palyer2 is winer");
		} else if(((one_1 == 3) && (one_2 == 1)) ||
					((one_1 == 1) && (one_2 == 2)) ||
					((one_1 == 2) && (one_1 == 3))) {
			System.out.println("palyer1 is winer");
		} else {
			System.out.println("no winer");
		}
		
		
		System.out.println("-----------------------");
		Scanner input = new Scanner(System.in);
		System.out.println("1~3까지의 숫자를 입력하시오.\n"
				+ "바위 : 1, 가위 : 2, 보 : 3");
		
		double you = input.nextInt();
		if(you == 1) {
			System.out.println("palyer : 바위" );
		} else if(you == 2) {
			System.out.println("palyer : 가위" );
		} else {
			System.out.println("palyer : 보" );
		}
		
		double com = Math.random();
		int com1 = ((int)(com * 10000) % 3) + 1;
		if(com1 == 1) {
			System.out.println("computer : 바위" );
		} else if(com1 == 2) {
			System.out.println("computer : 가위" );
		} else {
			System.out.println("computer : 보" );
		}
		
		// 바위 : 1, 가위 : 2, 보 : 3
		
		if(((com1 == 1) && (you == 3)) || 
			((com1 == 2) && (you == 1)) ||
			((com1 == 3) && (you == 2))) {
			System.out.println("palyer is winer");
		} else if(((com1 == 3) && (you == 1)) ||
					((com1 == 1) && (you == 2)) ||
					((com1 == 2) && (you == 3))) {
			System.out.println("computer is winer");
		} else {
			System.out.println("no winer");
		}
		
		
		System.out.println("-----------------------");
		// 선생님 방식
		double rand = Math.random();
		int rsp = (int)(rand * 3);	// 0~2
		if(rsp == 0) {
			System.out.println("가위");
		} else if(rsp == 1) {
			System.out.println("바위");
		} else {
			System.out.println("보");
		}
		
		int my = 1;
		if(rsp == my) {
			System.out.println("비김");
		}
		
		if(rsp == 0 && my == 0) {
			System.out.println("비김");
		} else if(rsp == 0 && my == 1) {
			System.out.println("내가 이김");
		} else if(rsp == 0 && my == 2) {
			System.out.println("내가 짐");
		}
	}

}
