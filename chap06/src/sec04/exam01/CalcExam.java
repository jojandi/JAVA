package sec04.exam01;

public class CalcExam {

	// main 매소드 -> 자바가 자동으로 실행시킴
	public static void main(String[] args) {
		powerOn(); // 내가 가진 매소드
		
		// 남이 가진 매소드 가져오기
		Calc calc = new Calc();
		calc.powerOff();
		System.out.println(calc);
		
		
		Calc calc3 = new Calc();
		calc3.powerOn();
//		calc3.isOn = true; 
		
		int resultP = calc3.plus(3, 8);
//		int result = calc3.plus(3, calc3.plus(3, 5)); -> 이렇게 복잡해질 수 있다!
		System.out.println("calc3.plus : " + resultP);
		
		double resultD = calc3.divide(5, 2);
		System.out.println("calc3.divide : " + resultD);
		
		double resultD0 = calc3.divide(5, 0);
		System.out.println("calc3.divide : " + resultD0);
		
		// plus2의 전달인자가 배열이기 때문에 배열 만들어서 넣어주기
		int[] a = {2, 7};
		System.out.println("calc3.plus2(a) : " + calc3.plus2(a));
		
		
		int num = calc.plus3(1, 2, 3, 4);
		System.out.println("모든 num을 더한 값 : " + num);
		num = calc.plus3(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("모든 num을 더한 값 : " + num);
	}
	
	// 매소드 생성
	static void powerOn() {
		System.out.println("전원을 켭니다.-> 내가 가진 매소드");
	}

}
