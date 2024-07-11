package sec01.exam03;

public class Computer extends Calc {
	
	/*
	~ OverRide ~
	 부모와 자식의 메소드명, 전달인자타입과 개수, 리턴타입이 같음
	 부모의 내용을 자식이 덮어씀 ( 필드의 오버새도우 느낌)
	 전달인자의 변수명은 달라도 됨
	 
	 // @ : 어노테이션
	 @Override : 부모것과 비교해 오버라이드 조건에 맞지 않는다면 오류남, 
	 		   : 써도 되고 안 써도 되지만 쓰는게 안전
	*/
	@Override
	double areaCircle(double r) {
		System.out.println("Calc의 areaCorcle() 실행");
		return Math.PI * r * r;
	}

}
