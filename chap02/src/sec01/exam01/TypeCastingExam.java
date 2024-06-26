package sec01.exam01;

import java.util.Scanner;

public class TypeCastingExam {

	public static void main(String[] args) {

		int a = 2 + 2 * 2;	// a = 6
		long b = (long) a;	// b = a = 6
		// int type인 a를 long type으로 바꾼 후 long type인 b에 넣음
		// ->형변환(type casting)

		long c = a;	// c = a = 6
		// 작은 타입 -> 큰 타입 => 손실 X
		// 형변환 생략 가능 => 자동 형변환(묵시적, 암시적 형변환)

		System.out.println("c : "+ c);

		a = (int) c;
		// 큰 타입 -> 작은 타입 => 손실이 있을 수 있음
		// 형변환 생략 불가 => 명시적, 강제 형변환
		
		
		long d = 3000000000L;
		int a2 = (int) d;
		System.out.println("a2 : "+ a2);
		
		double d2 = 3.14;
		int i = (int)d2;
		System.out.println("i : "+ i);
		// 실수 -> 정수 => 소수점 이하의 값은 버림
		
		
//		int result = 43;
//		double result = (double)43;
		double result = 43;
		int count = 10;
		System.out.println("(double)count : "+ (double)count);
		System.out.println(result / (double)count);
		System.out.println(result / count);
		// int, int 연산 => 정수 (소수점 이하 버림)
		// int, double 연산 => 실수 
		// int가 double로 자동 형변환 (더 큰 타입으로 변환)
		
		
		int i2 = 2100000000;
		int i3 = i2 * 2;
		System.out.println("i3 : "+ i3);
		// int의 허용 범위를 넘어서도 int끼리의 계산이기 때문에 오류 X
		// 하지만 값이 초과되었기 때문에 정상적인 값을 얻을 순 없음
		
		
		System.out.println(3 + "문자");
		System.out.println(3 + 4 + "문자");
		// 숫자 연산 후 문자로 변환됨
		System.out.println("" + 1 + 300 + "px");
		// ""이 앞에 오면 문자로 변환 후 계산
		// ex. "1" + "3" = "13" => 문자 연결
		// "1" + 300 + "px" -> "1300" + "px" -> "1300px"
		System.out.println("" + (1 + 300) + "px");
		// 문자 + 숫자 + 숫자 + 문자 구조에서 숫자 연산을 먼저 하고 싶다면 
		// () 안에 숫자를 넣어줌
		
		System.out.println("-----------------------");
		
		System.out.print("첫번째줄");
		System.out.print("두번째줄");
		// print : 자동 줄바꿈 안 됨(html의 span과 비슷)
		// prinatln : 자동 줄바꿈 됨
		System.out.println();	//br효과
		System.out.println("-----------------------");
		
		System.out.printf("i3의 값은 : %d", i3);
		System.out.println();
		System.out.println("i2의 값은 : "+ i2 +", i3 : "+i3);
		System.out.printf("i2의 값은 : %d, i3 : %d", i2, i3);
		// printf : c언어에서 주로 사용, 자동 줄바꿈 안 됨
		
		
		System.out.println();
		System.out.println("-----------------------");
		
		
		// 실무에서 사용하지 않지만 연습하기 위해!
		System.out.println("아무거나 입력하시오.");
		Scanner scan = new Scanner(System.in);	//입력 받기위한 준비
		String input = scan.nextLine();	
		// scan.nextLine(); : 엔터를 칠 때까지 입력
		System.out.println("input : "+ input);
		// 글씨 입력 후 엔터 -> String type인 input 변수에 저장 
		// -> input을 출력하면 내가 입력한 것이 나옴
	}

}
