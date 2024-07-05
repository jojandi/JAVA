package exam;

public class StudentExam {

	public static void main(String[] args) {

		Student s1 = new Student();
		
		// 필드의 기본값 : 0, null, false
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.hasGlasses);
		
		s1.name = "조민정";
		s1.age = 20;
		s1.hasGlasses = false;
		
		System.out.println("-------------");
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.hasGlasses);
		
		// s1.name과 나의 지역변수 name은 관계 없음
		String name = "아무거나";
		
		// 지역변수는 초기화 없이 사용 불가
//		int a;
//		System.out.println(a);
		
	}

}
