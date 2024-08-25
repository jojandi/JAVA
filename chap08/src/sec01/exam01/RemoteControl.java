package sec01.exam01;

public interface RemoteControl {

	// 인터페이스에서는 상수가 필드임
	// 상수 : static fianl, 변수명을 모두 대문자로, 절대 변하지 않는 수
	// interface에서는 public static final 생략 가능
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	
	// 추상 메소드
	// public abstract 생략 가능
	public abstract void turnOn();
	void turnOff();
	void setVoulume(int volume);
	
	// 인터페이스에서 메소드를 정의 + 구현까지 하려면 default 키워드 추가
	// 추상메소드인 경우 기존에 사용하던 클래스에서 무조건 구현해야하는 번거로움이 생기는데
	// 실행블럭을 구현해놓으면 사용하고 싶은 클래스만 사용 가능(해당 메소드 필요 시 오버라이드)
	default void search(String word) {
		System.out.println("word");
	}
	
}
