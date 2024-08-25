package sec03.exam02;

// 추상메소드는 추상클래스에만 존재할 수 있다
// new 할 수 없음
// 생성자를 가질 수 있음 ( 자식이 new 될 때 실행 )
public abstract class Animal {

	String kind;
	
	void breathe() {
		System.out.println("숨 쉬기 =3");
	}
	
	// 실행블럭이 없는 메소드 -> 추상메소드
	// 해당 메소드를 정의만 하고 상속 받은 메소드에서 구현시키기
	// Animal 클래스를 상속 받기 위해서는 해당 메소드를 가져야함
	abstract void sound();
	
}
