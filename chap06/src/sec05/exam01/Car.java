package sec05.exam01;

public class Car {

	String model;
	int speed;
	
//	Car(String m){
//		model = m;
//	}
	
	// 지역변수와 필드의 이름이 같을 시 필드가 지역변수가 됨
	// 지역변수와 필드의 이름은 다르게!
	Car(String model){
		// 아래 코드(int a)와 비슷한 느낌, 아무런 효력 없음
//		model = model;
//		
//		int a = 10;
//		a = a;
//		
		// 지역변수와 필드 이름 같게 하고 싶다면 이렇게 써도 되지만 this가 훨씬 편함
//		Car c1 = new Car();
//		c1.model = model;
		
		// 지역변수와 필드 이름을 같게 하고 싶다면
		// this 사용
		// this : new가 된 나 자신 = 나 그 자체
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
}
