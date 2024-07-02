package sec02.exam01;

public class CarExam {

	public static void main(String[] args) {

		Car myCar = new Car();
		Car myCar2 = new Car();
		
		System.out.println(myCar.model);
		
		// myCar와 myCar2는 다른 주소를 가지고 있기 때문에 
		// myCar의 model을 바꿔도 myCar2는 변경되지 않음
		myCar.model = "흑팔라";
		System.out.println("myCar.model : " + myCar.model);
		System.out.println("myCar2.model : " + myCar2.model);
		
		// speed 값을 지정하지 않음 => 0
		System.out.println("myCar.speed : " + myCar.speed);
		myCar.speed = 300;
		System.out.println("myCar.speed : " + myCar.speed);
		
	}

}
