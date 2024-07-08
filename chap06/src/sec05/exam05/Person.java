package sec05.exam05;

public class Person {

	// final
	// 	: 변수의 값을 변경하지 못하도록 함
	final String nation = "Korea";
	// 선언과 동시에 초기화하지 않은 경우 
	// -> 생성자에서 딱 한 번 값을 초기화할 수 있음
	final String ssn;
	
	Person(){
		ssn = "1234";
//		ssn = "5678";		
	}
	
	void test() {
//		nation = "USA";
		
		// static final : 상수, 보통 변수명을 전부 다 대문자로 사용
		System.out.println(Math.PI);
	}
	
}
