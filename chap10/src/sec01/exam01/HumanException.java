package sec01.exam01;

// 오류 만들기!
// Exception을 상속받으면 오류를 만들 수 있다
public class HumanException extends Exception {

	HumanException(){
		System.out.println("HumanException 생성자 실행!");
	}

	HumanException(String message){
		super(message);
		System.out.println("HumanException 전달인자 생성자 실행!");
	}
	
}
