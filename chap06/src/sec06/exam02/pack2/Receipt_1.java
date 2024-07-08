package sec06.exam02.pack2;

public class Receipt_1 {

	void test1() {
		Receipt_3 r3 = new Receipt_3();
		r3.test(); // 같은 패키지이기 때문에 가능
//		r3.donation // private 접근제한자기 때문에 내 클래스 안에서만 사용 가능
	}
	
}
