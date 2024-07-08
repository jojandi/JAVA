package sec06.exam06;

public class Car {
	
	private int speed;
	private boolean stop;
	
	/*
	getter : 필드값을 읽어서 리턴하는 기능
		   : 값을 조건 등에 맞춰 수정하여 보낼 수 있음
		   : private 접근제한자를 사용한 필드의 값 읽어 올 수 있음
	~ getter 규칙 ~
		- 메소드명 : get + 필드명(첫글자만 대문자)
		- 전달인자 : 없음
		- 리턴타입 : 필드의 타입
	*/
	public int getSpeed() {
		return this.speed;
	}
	
	// getter 중에서 boolean 타입일 경우 메소드명을 'is+필드명' 도 가능하나
	// 오류가 발생하는 라이브러리도 있으니 'get+필드명' 사용하자
	public boolean isStop() {
		return this.stop;
	}
	
	
	/*
	setter : 필드값을 수정할 수 있는 기능
	~ setter 규칙 ~
	  	- 메소드명 : set + 필드명(첫글자만 대문자)
		- 전달인자 : 필드의 타입으로 된 변수
		- 리턴타입 : 없음
	*/
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
