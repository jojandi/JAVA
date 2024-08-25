package cafeDT;

public class Me {

	void me(Cafe DT, String coffee) {
		if(DT.isDT()) {
			System.out.println("드라이브스루를 이용하여 주문합니다!");
			DT.order(coffee);
		} else {
			System.out.println("드라이브스루를 이용하지 않습니다...");
			DT.order(coffee);
		}
	}
	
}
