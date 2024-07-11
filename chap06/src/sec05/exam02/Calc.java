package sec05.exam02;

public class Calc {
	
	/*
		지역변수 
			: 헤당 블럭에서만 사용 가능, 
			  블럭이 끝나면 사라짐
		필드변수 
			: new가 된 순간(인스턴스)부터 사용 가능, 
			  클래스 소멸 시 사라짐
		static 변수(클래스변수, 공용변수)
			: java 실행 시 사용 가능, 
			  java 종료 시 사라짐 
	*/
	
	
	// 정적 필드 사용 이유
	// -> 편하게 사용하기 위해
	static double pi = 3.141592; // 정적 필드
	String color;
	
	// class가 new 됐을 때 사용할 수 있음 -> 정적 필드 사용 가능
	// but, 정적 필드의 값을 변경할 수는 있지만 사용하지 않는게 좋은듯...
	// 기본 필드의 값은 변경할 수 없음
	Calc(){
//		pi = 2;
		System.out.println("생성자 안에서 pi(정적 필드) 사용 : " + pi);
	}
	
	// static 안에서는 static만 사용 가능!!! //
	
	// 정적 메소드
	// pi 값(정적 필드 값)을 변경할 수 있음
	// but, 그냥 필드 값은 변경할 수 없음(그냥 필드 값은 new 될 때 사용할 수 있기 때문
	static void test() {
		System.out.println("static 메소드에서 pi(정적 필드) 사용 : " + pi);
		System.out.println("static 메소드");
//		this.color = "WHITE";
//		color = "WHITE";
	}
	
	// test()는 static이기 때문에 이미 저장되어있기에 그냥 메소드에서 정적 메소드 사용 가능
	// static이 아닌 것은 static 사용 가능!
	void test2() {
		System.out.println("-----------------------------------------------");
		System.out.println("그냥 메소드");
		System.out.println("static 메소드인 test() 사용 가능");
		test();
		System.out.println("-----------------------------------------------");
	}

}
