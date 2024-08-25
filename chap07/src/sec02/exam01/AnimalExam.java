package sec02.exam01;

public class AnimalExam {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		
		/*
		 * Animal dog = new Dog() 
		 * -> Animal 생성(Dog의 부모) 
		 * -> Dog 실행, Animal의 sound 오버라이드
		 * -> Animal 타입에 담아서 Dog 클래스 안에만 존재하는 내용은 사용 불가, 
		 * 	  Animal 클래스 안에 내용 사용 가능
		 * 
		 * 주의!!
		 *  - 만약에 Dog 클래스 안에 오버라이드한 것이 아무것도 없다면
		 *    그냥 new Animal한게 됨 -> 의미 없음
		 *  - 부모타입에 클래스를 담을 거라면 오버라이드가 있어야 의미 있음!!
		 * 
		 * -> Dog 타입에 담는다면 Dog 클래스 안에만 존재하는 내용까지도 사용 가능
		*/
		Animal aDog = new Dog();
//		Animal aDog = (Animal)new Dog();
		
		Animal aCat = new Cat();
//		Animal aCat = (Animal)new Cat();
		
		// 같은 타입(Animal)이기 때문에 가능!
		aDog = aCat;
		
		aCat.sound();
//		aCat.work(); -> Dog에 있는 메소드라 Cat은 사용 불가
//		aDog.work(); -> Animal 타입에 dog를 담았기 때문에 dog에만 존재하는 메소드 등 사용 불가
		dog.work(); // Dog 타입에 담아서 사용 가능!
		
		
	}

}
