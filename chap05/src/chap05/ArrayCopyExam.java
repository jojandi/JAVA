package chap05;

public class ArrayCopyExam {

	public static void main(String[] args) {

		// 커피 1호점에서 판매하는 메뉴
		String[] coffee = new String[3];
		coffee[0] = "따아";
		coffee[1] = "라떼";
		coffee[2] = "말차";
		
		
		// 커피 2호점 : 1호점 메뉴
		/*
			얕은 복사(shallow copy, thin clone, call by reference)
			 - stack 영역의 값(주소)만 복사
			 - 원본 변경 -> 복사본도 변경
			 - 참조 호출
		*/
		String[] coffee2 = coffee;
		for(int i = 0; i < coffee2.length; i++) {
			System.out.println(coffee2[i]);
		}
		
		// 얕은 복사로 연결 => 내거를 바꾸면 원본도 바뀜
		// => 원본의 주소만 공유 (coffee와 coffee2는 같은것)
		coffee2[1] = "연유라떼";
		System.out.println("~ coffe2[1]의 값 변경 후 원본인 coffee 출력~");
		for(int i = 0; i < coffee.length; i++) {
			System.out.println(coffee[i]);
		}
		
		
		// 크기와 내용을 동일하게 가지는 새로운 배열
		/*
			깊은 복사(deep copy, deep clone, call by value)
			 - heap 영역의 새로운 주소 생성
			 - 원본의 값들을 복사하여 채워넣음
			 - 원본과 동일한 값을 가지지만 다른 주소를 가지고 있음
			 - 내거를 바꿔도 원본은 영향 받지 않음
			 - 값 호출
			
		*/
		String[] coffee3 = new String[coffee.length];
//		coffee3[0] = coffee[0];	// coffee[0]의 값 coffee[0]에 넣어주기
		for(int i = 0; i < coffee3.length; i++) {
			coffee3[i] = coffee[i];
		}
		System.out.println("~ coffee3 출력~");
		coffee3[2] = "아샷추";
		for(int i = 0; i < coffee3.length; i++) {
			System.out.println(coffee3[i]);
		}
		
		System.out.println("~ coffe3[2]의 값 변경 후 원본인 coffee 출력~");
		for(int i = 0; i < coffee.length; i++) {
			System.out.println(coffee[i]);
		}
		
		
		// coffee3에 새로운 메뉴 추가하기
//		coffee3 = new String[]{"따아", "연유라뗴", "아샷추", "사라다빵"};
		
		/*
			~ 전략 ~
			1. coffee의 크기보다 1 더 큰 새로운 배열 생성
			2. 앞 index부터 복사
			3. 마지막 index에 추가할 값 적기
		*/
		coffee3 = new String[coffee.length+1];
		for(int i = 0; i < coffee.length; i++) {
			// i < coffee4.length;을 사용하면 coffee[3]까지 되므로 범위 초과 오류
			coffee3[i] = coffee[i];
		}
		coffee3[3] = "사라다빵";
		System.out.println("~ coffee(원본) + 새로운 메뉴를 넣은 coffee3 출력~");
		for(int i = 0; i < coffee3.length; i++) {
			System.out.println(coffee3[i]);
		}
		
		
//		for(int i = 0; i < coffee3.length; i++) {
//			String menu = coffee3[i];
//			System.out.println(menu);
//		}
		// 향상된 for문 (위의 코드를 더 간단하게)
		System.out.println("~ 향상된 for문 ~");
		for(String menu : coffee3) {
			System.out.println(menu);
		}

	
	}

}
