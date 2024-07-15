package sec01.exam01;

public interface RemoteControl {

	// 인터페이스에서는 상수가 필드임
	// 상수 : static fianl, 변수명을 모두 대문자로, 절대 변하지 않는 수
	// interface에서는 public static final 생략 가능
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	
	//추상 메소드
	// public abstract 생략 가능
	public abstract void turnOn();
	void turnOff();
	void setVoulume(int volume);
	
}
