package sec04.exam03;

public class CarExam {

	public static void main(String[] args) {

		Car car = new Car();
		
		boolean isLeftGas = car.isLeftGas();
		if(isLeftGas) {
			System.out.println("출발!");
			car.run();
		} else {
			System.out.println("주유가 필요합니다. ");
		}
		
		System.out.println(car.name); // null
		
		car.setName("몽식이");
		System.out.println(car.name); // 몽식이
		
		car.setName("");
		System.out.println(car.name); // else 동작, 몽식이 출력 
		// => 조건에 맞지 않기 때문에 else 동작
		// => name 자체 출력, 몽식이로 저장 되어있기 때문에 몽식이도 출력
		
	}

}
