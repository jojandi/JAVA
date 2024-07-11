package sec01.exam01;

// extends 상속 받고 싶은 클래스명
public class Child extends Parent {
	
	/*
	~ 상속 ~
		부모 안에 있는 내용을 복사해 옴
	*/
	
	// overshadow
	//  : 부모 필드명 == 자식 필드명 
	//  : 부모의 필드를 가리는 현상
	// 부모의 name을 사용하고 싶다면 super.name 사용
	String name = "Child의 name";
	
	// 상속 받았을 때 기본 생성자
	public Child() {
		// 부모으 생성자 호출
		// 내 생성자를 가져오는 this와 비슷
		// 맨 첫 줄에 있어야만 함
		super("Child 생성자 : 부모에 전달인자가 있기 때문에 \n super을 사용하여 부모생성자에 전달인자를 써 줌");
	}
	
	// 기본생성자
//	Child(){
//		super(); -> super()은 무조건 생성됨! 무조건 필요!!
//		System.out.println("Child 기본 생성자");
//	}
	
	// 부모의 name을 변경하는 메소드
	// 부모의 필드를 변경 가능
	// 단, 자식에 같은 필드명을 가지고 있는 것이 있다면 this는 자식을 의미
	void setName(String name) {
		this.name = name;
	}
	
	void setName2(String n) {
		name = n;
	}
	
	// shadow 
	//  : 전달인자명 == 필드명일 때
	//  : 전달인자가 필드를 가리는 현상
	void setName3(String name) {
		this.name = name;
	}
	
	void printName() {
		System.out.println("this.name : " + this.name); // 내가 가진 name
		System.out.println("super.name : " + super.name); // 부모가 가진 name
	}
}
