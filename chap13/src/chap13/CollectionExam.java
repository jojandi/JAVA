package chap13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionExam {

	public static void main(String[] args) {

		// 리스트
		List list = new ArrayList();
		// isEmpty : 사이즈가 0인지 아닌지 판별 ( 0 일시 true)
		System.out.println(list.isEmpty()); // true
		
		list.add("10");
		int a = 20;
		list.add(a);
		list.add(true);
		System.out.println(list.isEmpty()); // false
		
		// index, 넣을것 => 해당 자리에 넣을 것이 들어가고 내용들은 밀림
		// 10, 20, true -> 10, 123, 20, true
		list.add(1, 123);
		
		list.remove(1); // 삭제
		
		// get 할 때는 object를 돌려줌 => 강제 형변환 해야함
		int b = (Integer)list.get(1);
		System.out.println(b); // 20
		System.out.println(list.size()); // 3
		System.out.println(list);
		 
//		list.get(100); // IndexOutOfBoundsException 에러
		
		// 초기화
		list.clear(); // 1번 방법
		list = new ArrayList(); // 2번 방법 => 더 많이 씀

		
		System.out.println("---------------------------------");
		
		// 해쉬맵
		Map map = new HashMap();
		
		// 추가 ( key, value )
		map.put("k1", 10);
		map.put("abc", list);
		System.out.println(map); // 순서는 랜덤
		
		int k1 = (int)map.get("k1"); // key 값으로 value값 가져오기
		System.out.println(k1); // 10
		
		// 존재하지 않는 key값 조회 : null
		// 실제로 key가 있지만 value가 null인 경우도 있을 수 있음
		System.out.println(map.get("k2")); 
		
		// 초기화
		list = new ArrayList();
		map = new HashMap();
		map.put("제목", "사건의 지평선");
		map.put("가수", "윤하");
		map.put("가수", "yun ha"); // key가 같으면 덮어쓰기
		list.add(map);
		System.out.println(list); // [{제목=사건의 지평선, 가수=yun ha}]
		
		
		map = new HashMap();
		map.put("제목", "바람이 분다");
		map.put("가수", "이소라");

		// new HashMap을 안 한다면?
		// [{제목=바람이 분다, 가수=이소라}, {제목=바람이 분다, 가수=이소라}]
		// 얕은 복사(원본 바뀌면 다 바뀜)를 하기 때문!
		list.add(map);
		System.out.println(list); // [{제목=사건의 지평선, 가수=yun ha}, {제목=바람이 분다, 가수=이소라}]
		
		
		System.out.println("---------------------------------");
		
		// 제네릭 generic : 리스트 안에 들어갈 수 있는 자료형을 제한 => get할 때 형변환 X
		// generic : 클래스를 선언할 때 리턴타입이나 전달인자의 타입을 동적으로 바꿀 수 있는 것
		
		List<String> list2 = new ArrayList<String>();
		list2.add("글씨");
//		list2.add(2); // 에러
		// 형변환 필요 없음
		String str = list2.get(0);
		
		
		// 제네릭에 int는 사용할 수 없음. 클래스만 들어올 수있음
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		map2.put("키값", 1);
		int a2 = map2.get("키값");
		
	}

}
