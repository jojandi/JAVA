package sec01.exam01;

public class StudentExam {

	public static void main(String[] args) {
		
		// Student class 선언 및 변수에 저장
		// 왼쪽 Student : 저장 타입, Student 타입으로 저장한다
		// 오른쪽 Student : Student class
		Student s1 = new Student();
		
		// 다른 변수에 또 저장 가능
		Student s2 = new Student();
		
		// 변수만 만들고 heap영역에 연결하지 않음
		Student s3 = null;
		
		s3 = s1; // 같은 주소 공유, 둘 중 하나만 수정해도 모두 적용 됨
		
		System.out.println("s3 == s1 : " + (s3 == s1)); // heap 영역 주소 같음
		System.out.println("s1 == s2 : " + (s1 == s2)); // heap 영역 주소 다름
		

	}

}
