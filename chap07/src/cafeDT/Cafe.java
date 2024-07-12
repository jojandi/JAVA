package cafeDT;

public class Cafe {

	/**
	 * 드라이브스루
	 * 
	 *  기본형 : false -> 드라이브스루 지원 안 함
	 *  
	 *  전달인자 : X
	 *  리턴타입 : boolean
	*/
	boolean isDT() {
		return false;
	}
	
	
	void order(String menu) {
		System.out.println(menu + "을(를) 주문받았습니다. \n");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	}
	
}
