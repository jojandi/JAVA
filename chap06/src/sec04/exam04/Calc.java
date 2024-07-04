package sec04.exam04;

public class Calc {
	
	// 메소드 안에서 다른 메소드 호출!
	
	// 실행할 때 전달인자가 int int를 보내면 자료형이 동일한 것 우선 찾아서 실행
	// 만약에 없다면 자동형변환해서 들어갈 수 있는 메소드 찾아서 실행
	// 정수 연산
	int plus(int x, int y) {
		System.out.println("int int");
		int result = x + y;
		return result; // 3. return 값을 avg의 sum에 넣어줌
	}
	// 실수 연산
	double plus(double x, double y) {
		System.out.println("double double");
		double result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y); // 2. sum 메소드 실행
		double result = sum / 2; // 4. 평균 구해서 result에 넣고
		return result; // 5. return 해줘서 execute의 result에 넣어줌
	}
	
	void execute() {
		double result = avg(7, 10); // 1. avg 메소드 실행
		println("실행결과 : " + result); // 6. println 메소드 실행
	}
	
	void println(String msg) {
		System.out.println(msg); // 7. execute의 result값을 msg에 넣어준 후 msg 출력!
		
		// overloading : 메소드 이름은 같지만 전달인자 타입변수가 다름
		// 각각의 타입변수에 맞게 메소드 실행
		// 사용자를 편하게 해줌
		System.out.println("abc");
		System.out.println(123); 
	}
	
	/*
	 ~ 오버로딩 ~
	 	1. System.out.println처럼 전달인자를 신경쓰지 않게 하기 위함
	 	2. 전달인자가 너무 많고 기본값을 입력하는 경우가 빈번할 때
	 	   전달인자를 줄이는 목적으로도 사용
	 */
	
	void join(String id, String pw, String address, int age, int gender) {
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + pw);
		System.out.println("주소 : " + address);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
	}
	
	void join(String id, String pw) {
		join(id, pw, null, -1, -1);
	}
}
