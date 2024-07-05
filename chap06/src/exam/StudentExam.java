package exam;

public class StudentExam {

	public static void main(String[] args) {

		Student s1 = new Student();
		
		// 필드의 기본값 : 0, null, false
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.hasGlasses);
		
		s1.name = "조민정";
		s1.age = 21;
		s1.hasGlasses = false;
		
		System.out.println("-------------");
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.hasGlasses);
		
		// s1.name과 나의 지역변수 name은 관계 없음
//		String name = "아무거나";
//		System.out.println(name);
		
		// 지역변수는 초기화 없이 사용 불가
//		int a;
//		System.out.println(a);
		
		Student s2 = new Student();

		System.out.println("-------------");
		System.out.println(s2.name);
		
		s2.name = "조민지";
		s2.age = 23;
		
		System.out.println("-------------");
		System.out.println(s2.name);
		System.out.println(s2.age);
		
		System.out.println(s1.name);

		// public String toString() 덕분에 s1 출력하면 자동으로 해당 내용이 나옴
		System.out.println(s1);
		int s1_intel = s1.study("JAVA Class");
		System.out.println("지식 : " + s1_intel);
		System.out.println(s1);
		
		int s1_hungry = s1.eat("마라탕");
		System.out.println("허기 : " + s1_hungry);
		System.out.println(s1);
		
		s1.sleep(8);
		System.out.println(s1);
		
		s1.game("심즈4", 5);
		System.out.println(s1);
		
		s1.study("CSS");
		System.out.println(s1);

		System.out.println("==========================================================================================");
		Student s3 = new Student("조재희", 49);
		System.out.println(s3);
		System.out.println("==========================================================================================");
		Student s4 = new Student("조경순");
		System.out.println(s4);
		
	}

}
