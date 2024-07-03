package sec04.exam01;

public class Calc {
	
	// 전원 상태
	boolean isOn = false;
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	// 클래스 안에서 필드는 값을 변경하지 못 함(실행 불가)
	// 하지만 매소드 안에서 필드 값 변경 가능(실행 가능)
	void powerOn() {
		System.out.println("전원을 켭니다.");
		isOn = true;
	}
	
	// 아래의 주석은 실제로 plus를 사용할 때 커서를 올리면 내용을 보여줌
	// @를 쓰면 엔터 쳐져서 이쁘게 나옴
	// 안 써도 괜춘
	/**
	~ 더하기 기능을 하는 매소드 만들자! ~
		- 두 정수를 받아서 더한 결과를 돌려줌
		
		- 매소드 명 : plus
		- 전달인자 : int, int ( 받아 올 두 수 )
		- 리턴 타입 : int ( 두 수를 더한 결과 )
		
		@author : mg518220@gamil.com
		@param : int x, int y
		@return : int
	*/
	// 전달인자, 지역변수는 선언되고 매소드 또는 {}가 끝나면 사라짐
	int plus(int x, int y) {
		System.out.println("~ 더하기 ~");
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		return x + y;
	}
	
	/**
	~ 나누기 기능을 하는 매소드 만들자! ~
		- 두 정수를 받아서 나눈 결과를 실수로 돌려줌
		
		- if, 두번째 전달인자가 0인 경우
		- if(y == 0) => 0으로 나눌 수 없습니다 출력
					=> return 값은 0
					
		- 매소드 명 : divide
		- 전달인자 : int, int
		- 리턴 타입 : double ( x를 double로 강제 형변환 )
		
		
	*/
	double divide(int x, int y) {
		System.out.println("~ 나누기 ~");
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		double resutl = -9999;
		if(y == 0) {
			System.out.println("0으로 나눌 수 없습니다. ");
			resutl = 0;
		} else {
			resutl = (double)x / y;
		}
		return resutl;
	}
	
	
	/**
	~ 더하기 기능을 하는 매소드 만들자! 근데 전달인자가 배열임. ~
		 - 전달인자 : int 배열
		 - 리턴타입 : int
	*/
	int plus2(int[] num) {
		System.out.println("~ 더하기 v2 ~");
		int x = num[0];
		int y = num[1];
		
		return x + y;
	}
	
	
	/**
	~ 전달인자의 개수를 지정하지 않고 전달 받은 만큼 처리하는 방법 ~
	 - "..." 가변인자, 가변 길이 파라메터
	 - (type ... 변수이름)
	 - 전달 받은 모든 전달인자를 배열로 처리
	 - 거의 안 씀
	*/
	int plus3(int...num) {
		System.out.println("num : " + num);
		int sum = 0;
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return sum;
	}
	

}
