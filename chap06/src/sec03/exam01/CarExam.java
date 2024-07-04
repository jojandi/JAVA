package sec03.exam01;

public class CarExam {

	public static void main(String[] args) {

		Car car = new Car("검정", 2500);
		car.print();
		
		Car car2 = new Car();
		car2.print();
		System.out.println("-----------");
		new Car();
	}

}
