package sec04.exam03;

public class Car {
	
	// 필드는 여러 메소드가 기억해야할 때 쓰면 좋음

	// 필드는 클래스 생성(new하는 순간에)과 함께 생성되고 
	// 클래스 소멸 시까지 생존
	// 메모리를 차지하며 계속 저장된다
	// 메소드에서 변경하는 경우 다음번 실행까지 저장
	//  => 계속 초기화해야하는 상황이 발생할 수 있음
	// 장점 : 클래스 내에의 모든 곳에서 사용 가능
	int gas = 6;
	/**
	~ gas가 얼마나 남았을까? ~
		- gas가 0이라면 false return
		- gas가 있다면 true return
		
		- 메소드 명 : isLeftGas
		- 전달인자 : 없음
		- 리턴타입 : boolean
	*/
	boolean isLeftGas() {
		boolean result;
		
		if(gas == 0) {
			System.out.println("gas가 없습니다. ");
			result = false;
		} else {
			System.out.println("gas가 있습니다. ");
			result = true;
		}
		return result;
	}
	
	/**
	~ 주행 ~
		- gas가 없을 때까지 달리기
		- gas가 없어지면 return을 통해 while문 종료

		- 메소드 명 : run
		- 전달인자 : 없음
		- 리턴타입 : void
	*/
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("주행 중... (gas잔량 : " + gas + ")");
				gas --;
			} else {
				System.out.println("정지! (gas잔량 : " + gas + ")");
				// break를 사용해도 되지만 return이 더 강력 
			    // => return : 메소드 자체가 끝남
				// => break : while문을 끝냄
				return;
			}
		}
	}
	
	// 아래 주석의 예시
	// 메소드에서 변경하는 경우 다음번 실행까지 저장
	//  => 계속 초기화해야하는 상황이 발생할 수 있음
	String name;	
	/**
	~ name의 값을 변경하자! ~
		- name의 길이가 0인 경우 변경하지 않음
		- 전달인자 : String
		- 리턴타입 : 없음
	*/
	void setName(String nick) {
		System.out.println(nick.length());
		if(nick.length() != 0) {
			name = nick;
		} else {
			System.out.println("이름은 필수입니다. ");
		}
		
	}

}
