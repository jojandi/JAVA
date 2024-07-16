package chap09;

import java.util.Comparator;

// 남이 만든 인터페이스 가져옴(implements Comparator)
public class OrderBy implements Comparator {

	// Comparator의 추상메소드 구현
	@Override
	public int compare(Object o1, Object o2) {
		
		// 내가 비교할 것으로 타입 변환
		MemberDTO dto1 = (MemberDTO)o1;
		MemberDTO dto2 = (MemberDTO)o2;
		
		return dto1.getAge() - dto2.getAge();
	}

}
