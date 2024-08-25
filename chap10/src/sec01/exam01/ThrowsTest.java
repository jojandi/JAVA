package sec01.exam01;

public class ThrowsTest {

	// throws : 예외 떠넘기기, 해당 메소드를 만들 때는 try 하지 않아도 되지만
	// 사용할 땐 try 사용해야함
	void method2(String name) throws ClassNotFoundException {
		Class clazz = Class.forName(name);
	}
	
	void method1() {
		try {
			method2("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	void throwException() {
		System.out.println("오류 만들기!");
		throw new NumberFormatException("문자 넣기");
	}
	
	void human(int e) throws HumanException {
		System.out.println("human 실행 - e : " + e);
		
		if(e < 5) {		
			// throw : 강제로 에러 발생 시킴
			throw new HumanException("EC05");
		} else if( e > 10 ) {
			throw new HumanException("EC10");
		} else {
			throw new HumanException("5 이상 10 이하로 정상입니다. ");
		}
	}
	

}
