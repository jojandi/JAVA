package sec02.exam05;

import java.util.ArrayList;

public class ChildExam {

	public static void main(String[] args) {

		Child child = new Child();
		
		child.method1("Child");
		System.out.println("최종 child의 field1 : " + child.field1);
		
		System.out.println("======================================");
		// 부모타입으로 자동 형변환
		Parent p = new Child();
		
		// child에서 override해서 "Child의 method1 실행" 출력
		// Child클래스의 method1에서 this.fild1은 Child클래스의 fild1을 뜻하고 
		// 그렇기 때문에 Child클래스의 fild1이 전달인자로 바뀜
		// (다만 Parent 타입에서 Child클래스의 fild1을 출력할 수 없음)
		// Parent 클래스의 fild1은 아무런 영향을 받지 않음
		p.method1("Parent"); 
		
		// 필드는 오버라이드 안 됨(메소드만 오버라이드 됨)
		// Parent 타입의 field1이 출력 됨 => "Parent의 field1" 출력
		System.out.println("최종 parent의 field1 : " + p.field1);
		
		System.out.println("======================================");
		// 부모타입에서 자식타입으로 형변환 시 강제 형변환
		Child child2 = (Child)p;
		
		// Child의 field1 출력 됨
		System.out.println("최종 child2의 field1 : " + child2.field1);
		
		
		////////////////////////////////////////////////////////////////////
		System.out.println("======================================");
		
		Parent p1 = new Child();
		Parent p2 = new Child101();
		
		
		// 오류는 나지 않음, 하지만 실행 시 오류 남
		Child c1 = (Child)p1;
		
		// instanceof : 어떤 클래스에서 왔는지(인스턴스) 확인 (true / false)
		// p2가 Child에서 왔는가?
		boolean isChild = p2 instanceof Child;
		System.out.println("isChild : " + isChild);

		if(isChild) {			
			Child c2 = (Child)p2;
		} else {
			System.out.println("p2는 Child101타입에서 왔기 때문에 Child으로 변경할 수 없습니다. ");
		}
		
		if(p2 instanceof Child101) {
			Child101 c3 = (Child101)p2;
			System.out.println("p2의 타입을 Child101으로 변경 가능 합니다. ");
		}
		
		// Object는 최상위 부모
		ArrayList list = new ArrayList();
		list.add(p1);
		Object obj1 =  list.get(0);
		Parent p3 = (Parent)obj1;
		
	}

}
