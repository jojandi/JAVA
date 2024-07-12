package sec02.exam01;

public class Exam {

	public static void main(String[] args) {

		// 현재 상속 상태
		// P1 -> P2-1 -> P3-1
		// P1 -> P2-2 -> P3-2
		
		
		P3_1 p3_1 = new P3_1();
		
		// 부모타입으로 형변환 가능
//		P2_1 p3_1__2_1 = (P2_1)p3_1;

		// 부모타입으로 형변환 시 형변환 연산자 생략 가능
		P2_1 p2_1 = p3_1;
		
		P1 p1 = p2_1;
		
		// P1 안에 다이렉트로 P3-1 넣을 수 있음
//		p1 = (P1)( (P2_1) p3_1 );
		p1 = p3_1;
		
		// P2_1로 형 변환 후 P1으로 형변환 하기
//		P1 pp1 = (P1)( (P2_1) new P3_1() );
		P1 pp1 = new P3_1();
		
		
		// P2_2를 P1으로 형변환
		P1 p1_2 = new P2_2();
		
		
		// 결론적으로 둘 다 P1 타입이기 때문에 가능
		p1_2 = pp1;
		
	}

}
