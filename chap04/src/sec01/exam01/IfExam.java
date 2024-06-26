package sec01.exam01;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {

		int score = 91;
		
		if(score >= 90) {
			System.out.println("90점 이상입니다.");
			
			if(score >= 95) {
				System.out.println("95점 이상입니다.");
			}
		}
		if(score < 90) {
			System.out.println("90점 미만입니다.");
		}
		
		
		//참고
		boolean up90 = score >= 90;
		if(up90) { 
			System.out.println("90점 이상입니다.");
		}
		if(!up90	/* 거짓일 시 동작 */) {
			System.out.println("90점 미만입니다.");
		}
		
		
		if(up90) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		// else : 위의 조건이 하나도 만족하지 않는 경우 실행
		
		System.out.println("-----------------------");
		
		if(score >= 90) {
			System.out.println("90점 이상입니다.");
			System.out.println("학점 : A");
		} 
		if(score >= 80) {
			System.out.println("80점 이상입니다.");
			System.out.println("학점 : B");
		}
		// score가 90 이상일 시 둘 다 동작
		// 서로 연관이 없음, 각자 동작


		// if, else if, else로 묶여있다면 그 중 하나만 실행됨
		if(score >= 90) {
			System.out.println("학점 : A");
		} else if(score >= 80) {
			System.out.println("학점 : B");
			// if가 참이라면 아래 조건 안 봄, if가 거짓일 시에만 아래 조건 봄
			// => else if에 if의 조건을 한 번 더 쓸 필요 없음
		} else {
			System.out.println("학점 : C");
		}
		System.out.println("-----------------------");
		
		
		//3은 짝수인가?
		int num = 3;
//		Scanner input = new Scanner(System.in);
//		num = input.nextInt();
		if(num % 2 == 0){
			System.out.println(num +"은 짝수다");
		} else {
			System.out.println(num +"은 홀수다");
		}
		System.out.println("-----------------------");
		
		
		String a = "abc";
		String b = "abc";
		// 글씨 비교 시 == 사용 불가, 입력 받을 시 다른 값으로 인식
		// => equals 사용
		if(a.equals(b)) {
			System.out.println(a +"와"+ b +"는 같다");
		} else {
			System.out.println(a +"와"+ b +"는 다르다");
		}
		System.out.println("-----------------------");
		
		
		double rand = Math.random();
		System.out.println(rand);
		// random의 값 : 0 이상 1 미만
		
		
		//주사위 : 1~6까지
		double random = Math.random();
		int number = ((int)(random * 10000) % 6) + 1;
		System.out.println("주사위 숫자는 "+ number);
		
		
		
		
		System.out.println("-----------------------");
		double rand2 = Math.random();
		int dice = ((int)(rand2 * 10000) % 6) + 1;
		System.out.println("주사위 : "+ dice);
		
//		if(dice == 1) {
//			System.out.println("주사위 1이 나왔습니다");
//		} else if(dice == 2){
//			System.out.println("주사위 2가 나왔습니다");
//		}
		
		// if 중에서 == 또는 equals인 경우 switch로 바꿀 수 있다
		// char, byte, short, int(int 이하), String만 사용 가능
		// boolean, long, double, float 사용 불가
		switch(dice) {
			case 1 : 
				System.out.println("주사위 1이 나왔습니다");
				break;	//break가 없다면 아래 case까지 실행
			case 2 : 
				System.out.println("주사위 2이 나왔습니다");
				break;
			case 3 : 
				System.out.println("주사위 3이 나왔습니다");
				break;
			case 4 : 
				System.out.println("주사위 4이 나왔습니다");
				break;
			case 5 : 
				System.out.println("주사위 5이 나왔습니다");
				break;
			default :	//if의 else
				System.out.println("주사위 6이 나왔습니다");
				break;
		}
		
		
		int month = 1;
		if(month >= 3 && month <= 5) {
			System.out.println("봄");
		} else if(month >= 6 && month <= 8) {
			System.out.println("여름");
		} else if(month >= 9 && month <= 11) {
			System.out.println("가을"); 
		} //else 사용 가능 
		  else if (month == 12 || month == 1 || month ==2){
			System.out.println("겨울"); 
		}
		
		
		switch(month) {
		// OR 처럼 사용하기 
		// break가 없을 때 다음 case도 실행되는 원리 이용
		case 3 :
		case 4 : 
		case 5 :
			System.out.println("봄2");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println("여름2");
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println("가을2");
			break;
		default :
			System.out.println("겨울2");
		}
		
		
		
		if(month >= 1) System.out.println("한 줄만 if에 적용");
		// 되도록 쓰지 말 것, 중요하지 않을 때 사용
		
		
		
		//삼항 연산자 <-> if문
		String str;
		if(month >= 3 && month <=5) {
			str = "봄임";
		} else {
			str = "봄 아님";
		}
		System.out.println(str);
		
		
		str = (month >= 3 && month <=5) ? "봄임" : "봄 아님";
		System.out.println(str);
	}
}
