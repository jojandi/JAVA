package chap05;

public class RefExam {

	public static void main(String[] args) {
		
		int a;
//		System.out.println(a);
//		int b = a;
		// 값을 할당하지 않으면 사용할 수 없음
		
//		a = null;
		// 기본타입에는 null 사용 불가
		
		
		String c = "조민정";
		// = 을 기준으로 오른쪽 먼저 실행
		// "조민정"이 heap(힙) 영역에 비어있는 번지에 들어감
		// -> stack(스택) 영역의 c에 그 번지가 기록
		System.out.println("c : "+ c);
		System.out.println("c == null : "+ (c == null));
		System.out.println("c != null : "+ (c != null));
		
		c = null;
		// null : 주소값을 비워서 heap영역과 stack영역의 연결을 끊음
		// null은 상태 (값이 아님)
		System.out.println("c : "+ c);
		System.out.println("c == null : "+ (c == null));
		System.out.println("c != null : "+ (c != null));
		
		
		
		String d;
//		System.out.println(d);
		// 기본타입과 마찬가지로 값을 할당하지 않으면 사용할 수 없음
		c = "조민정";
		d = "조민정";
		System.out.println("c == d : "+ (c == d)); // 결과 : true
		// String만 특별대우 
		// => 같은 내용이 있을 때 주소 재활용(""안에 있을 때만)
		// => 메모리 절약
		
		c = new String("조민정");
		// new : 새로운 주소에 할당
		System.out.println("c == d : "+ (c == d));	// 결과 : false
		// heap 영역의 내용이 같더라도 저장된 번지수가 다르기 때문에 false
		// c의 주소값 != d의 주소값

		System.out.println("c.equals(d) : "+c.equals(d));	// 결과 : true

		c = null;
//		System.out.println("c.equals(d) : "+c.equals(d));
		// NullPointerException 에러
		
		String e = c + "abc";
		System.out.println(e);	// null을 null이란 글씨로 인식하여 출력
	}

}
