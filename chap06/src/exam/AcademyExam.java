package exam;

public class AcademyExam {

	public static void main(String[] args) {

		// 리스트
		Academy a1 = new Academy("천안");
		
		Student s1 = new Student("김영희", 20);
		Student s2 = new Student("김철수", 25);
		Student s3 = new Student("강아지", 23);
		Student s4 = new Student("고영희", 27);
		Student s5 = new Student("이슬기", 30);
		
		a1.join(s1);
		a1.join(s2);
		a1.join(s3);
		a1.join(s4);
		a1.join(s5);
		
		a1.viewList();
		
		System.out.println("=============================================================");
		// 배열
		AcademyArray aa1 = new AcademyArray("수원");
		
		Student as1 = new Student("김영희", 20);
		Student as2 = new Student("김철수", 25);
		Student as3 = new Student("강아지", 23);
		Student as4 = new Student("고영희", 27);
		Student as5 = new Student("이슬기", 30);
		
		aa1.join(as1);
		aa1.join(as2);
		aa1.join(as3);
		aa1.join(as4);
		aa1.join(as5);
		
		aa1.viewList();
	}

}
