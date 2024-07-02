package seo04.exam01;

public class CalcExam {

	public static void main(String[] args) {
		powerOn(); // 내가 가진 매소드
		
		// 남이 가진 매소드 가져오기
		Calc calc = new Calc();
		calc.powerOff();
		System.out.println(calc);
		
	}
	
	// 매소드 생성
	static void powerOn() {
		System.out.println("전원을 켭니다.");
	}

}
