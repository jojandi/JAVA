package sec01.exam01;

public class ExtendsExam {

	public static void main(String[] args) {

		// Child만 생성했지만 Parent를 상속 받았기 때문에
		// Child 생성자와 Parent 생성자 실행
		Child c1 = new Child();
		
		// Parent에 있는 필드 가져오기 가능
		System.out.println("------------------------------");
		System.out.println("c1.name : " + c1.name);
		
		// Parent에 있는 메소드 가져오기 가능
		// 부모의 name => Parent 클래스에서 this.name이기 때문
		String str = c1.getName();
		System.out.println("c1.getName() : " + str); 
		
		System.out.println("------------------------------");
		c1.setName("자식이 보낸 이름(this)");
		System.out.println(c1.name); // 자식 클래스의 name
		
		System.out.println("------------------------------");
		c1.setName2("자식이 보낸 이름(this 없음)");
		System.out.println(c1.name); // 자식 클래스의 name
		
		System.out.println("------------------------------");
		c1.printName(); // 자식 클래스와 부모 클래스의 name 출력
	}

}
