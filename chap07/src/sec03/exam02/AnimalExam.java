package sec03.exam02;

public class AnimalExam {

	
	public static void main(String[] args) {

		Dog dog = new Dog();
		
		dog.sound();
		dog.breathe();
		
		Animal d = dog;
		d.sound(); // dog.sound
		
		Cat cat = new Cat();
		cat.sound();
		
		Animal c = cat;
		c.sound(); // cat.sound
		
//		Animal a2 = new Animal(); -> 추상클래스는 new할 수 없음
		
//		Dog2 d2 = new Dog2(); -> 추상클래스를 상속받은 추상클래스
		
		System.out.println("===============================");
		Jindo jin = new Jindo();
		jin.sound();
		jin.eat();
		jin.breathe();
	}

}
