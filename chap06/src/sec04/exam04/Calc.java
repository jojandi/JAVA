package sec04.exam04;

public class Calc {
	
	// 메소드 안에서 다른 메소드 호출!
	
	int plus(int x, int y) {
		int result = x + y;
		return result; // 3. return 값을 avg의 sum에 넣어줌
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
	}
}
