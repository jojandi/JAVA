package sec05.exam02;

public class CalcExam {

	// 자바 즉, java.exe가 특정 클래스를 실행할 때 (ex. CalcExam을 실행할 때)
	// CalcExax.main(스트링 배열)을 실행
	// new CalcExam()하지 않고 바로 실행됨
	public static void main(String[] args) {

		/* 
		Calc를 new하지 않았음에도 실행됨 -> 정적 필드
		  	자바 실행과 동시에 static 영역에 올라가고
		 	자바가 Calc 안에 있는 pi 변수가 뭔지 이미 알고 있기 때문에
		 	new 하지 않아도 실행 됨
		*/
		System.out.println("new하지 않은 상태에서 사용 가능 -> Calc.pi : " + Calc.pi); 

		Calc c1 = new Calc();
		Calc c2 = new Calc();

		// Calc를 new 해야지 사용할 수 있음
		c1.color = "RED";
		c2.color = "BLUE";
		
		// c1의 pi값만 바꿨는데 c2의 pi값도 변경됨
		// 공통으로 사용되는 값(정적 필드)를 변경했기 때문에 pi 자체가 일괄 변경
		System.out.println("-----------------------------------------------");
		System.out.println("변경 전 c1.pi : " + c1.pi);
		c1.pi = 3;
		System.out.println("~ 정적필드 pi의 값을 한 변수에서 변경하면 일괄 변경 됨 ~");
		System.out.println("변경 후 c1.pi : " + c1.pi);// 변수로 pi를 접근하면 비효율, class로 접근하는게 효율
		System.out.println("변경 후 c2.pi : " + c2.pi);

		System.out.println("-----------------------------------------------");
		Calc.test();
		c1.test2();
	
		print();
	}
	
	// main은 static이기 때문에 main 내에서 함수를 실행하려면 static을 붙여줘야함
	static void print() {
		System.out.println("main에서 내 메소드 사용하기!");
	}
}
