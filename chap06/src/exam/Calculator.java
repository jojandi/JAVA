package exam;

public class Calculator {
	/*
	 ~ 계산기를 만들자! ~
	 	-> +, -, *, /, % 기능
	 	
	 	1. 두 수를 받아 연산 결과를 돌려줌
	 	2. 전달인자 (숫자 문자 숫자)
	 		=> 알아서 연산 되게
	 		ex. 3 "+" 5 => 8 출력!
	*/
	
	void print(int result) {
		System.out.println("결과 : " + result);
	}
	void print(double result) {
		System.out.println("결과 : " + result);
	}
	
	void calc(int x,String a, int y) {
		if(a == "+") {
			plus(x, y);
		} else if(a == "-") {
			minus(x, y);
		} else if(a == "*") {
			multiply(x, y);
		} else if(a == "/") {
			divide(x, y);
		} else if(a == "%") {
			remainder(x, y);
		} else {
			System.out.println("계산할 수 없습니다. ");
		}
	}
	
	void plus(int x, int y) {
		int result = x + y;
		
		print(result);
	}
	
	void minus(int x, int y) {
		int result = x - y;
		
		print(result);
	}
	
	void multiply(int x, int y) {
		int result = x * y;
		
		print(result);
	}
	
	void divide(int x, int y) {
		double result = (double)x / y;
		
		print(result);
	}
	
	void remainder(int x, int y) {
		int result = x % y;
		
		print(result);
	}
	
}
