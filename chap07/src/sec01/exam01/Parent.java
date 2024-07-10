package sec01.exam01;

public class Parent {
	
	String name = "Parent의 name";
	
	Parent (){
		// super와 this는 함께 쓸 수 없다.
		// 둘 다 가장 첫 줄에 있어야하기 때문
		
//		super();
//		this();
		
		System.out.println("Parent 기본 생성자");
	}
	
	Parent(String name){
		System.out.println("Parent 기본 생성자");
		System.out.println(name);
	}
	
	String getName() {
		System.out.println("Parent의 getName 실행");
		return this.name;
	}
	
}
