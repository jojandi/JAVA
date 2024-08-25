package chap09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderExam extends MemberDTO {

	public static void main(String[] args) {

		MemberDTO m1 = new MemberDTO();
		MemberDTO m2 = new MemberDTO();
		MemberDTO m3 = new MemberDTO();
		MemberDTO m5 = new MemberDTO();
		
		m1.setAge(21);
		m1.setName("조민정");
		
		m2.setAge(23);
		m2.setName("조민지");
		
		m3.setAge(22);
		m3.setName("김해민");
		
		m5.setAge(21);
		m5.setName("조민정");
		
		if(m1.equals(m5)) {
			System.out.println("이름과 나이가 같은 사람입니다. ");
		} else {
			System.out.println("이름과 나이가 다른 사람입니다. ");
		}
		
		System.out.println(m1.getAge() > m2.getAge()); // false
		
		MemberDTO m4 = compareMemberDTO(m1, m2);
		System.out.println(m4);
		
		// 나이 큰 순서대로 정렬하기
		List list = new ArrayList();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		System.out.println(list);
		
		
		
//		Comparator comp = new OrderBy(); 아래의 익명객체와 완전히 동일한 코드
		
		// 익명 객체 -> 상속받을 것이 필요
		// new interface(하나만 사용 가능)(){
		// 		클래스};
		// => 해당 interface를 구현한 익명 클래스가 생성된 것이다. 
		Comparator comp = new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				
				MemberDTO dto1 = (MemberDTO)o1;
				MemberDTO dto2 = (MemberDTO)o2;
				
				return dto1.getAge() - dto2.getAge();
			}
			
		};
		
		// 나이순으로 정렬
		// comp : 내림차순인지 오름차순인지
		Collections.sort(list, comp);
		System.out.println(list);
		
		
	}
	
	/**
	 * 
	 * 둘 중에 나이가 큰 MemberDTO를 돌려줌
	 * 
	 * @param MemberDTO, MemberDTO
	 * @return age가 더 큰 MemberDTO 
	*/
	static MemberDTO compareMemberDTO(MemberDTO dto1, MemberDTO dto2) {
		MemberDTO a = null;
		
		// 내 방식
//		if(dto1.getAge() > dto2.getAge()) {
//			a = dto1;
//		} else {
//			a = dto2;
//		}
		
		// 선생님 방식
		if(dto1.getAge() - dto2.getAge() > 0) {
			a = dto1;
		} else {
			a = dto2;
		}
		
		return a;
	}

}
