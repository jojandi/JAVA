package sec06.exam02.pack1;

// 해당 패키지에 있는 클래스만 가져옴
// 하위 패키지 제외.
//import sec06.exam02.pack2.*;
import sec06.exam02.pack2.Receipt_3;
import sec06.exam02.pack2.Receipt_1;

public class Receipt_2 {

	/*
	~ 다른 패키지의 클래스를 찾을 때 ~
		1. 내 패키지에 있는가?
		2. java.lang에 있는가? (java.lang : java 실행 시 자동으로 import 됨)
		3. import한 곳에 있는가?
	*/
	
	Receipt_2(){
		// pack1에 있는 Receipt_1 => 같은 패키지
		// *로 로딩해도 내 패키지를 가져옴
		// 명확하게 import해주면 다른 패키지에 있는 것을 가져옴
		Receipt_1 r1 = new Receipt_1();
		
		// pack1의 Receipt_1 사용하려면?
		// 다른 패키지의 클래스를 가져오자!
		// => 패키지 정보와 클래스 정보를 한 번에 쓰기
		// 귀찮아서 import 씀
		// 부득이한 경우 사용할 수 있음
		sec06.exam02.pack1.Receipt_1 r1_1 = new sec06.exam02.pack1.Receipt_1();
		
		// pack2에 있는 Receipt_3 -> import로 가져와야 new 할 수 있음
		// ctrl + shift + O(영문) => 자동으로 import 됨
		Receipt_3 r3 = new Receipt_3();
		r3.a = 8;
//		r3.test(); // 접근제한자 때문에 못 씀
	}
	
}
