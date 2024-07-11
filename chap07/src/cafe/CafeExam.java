package cafe;

public class CafeExam {

	public static void main(String[] args) {

		PaikCoffe p = new PaikCoffe("빽다방");
		megaCoffee m = new megaCoffee("메가커피");
		
		p.order("사라다빵");
		p.order("청포도에이드");
		p.order("할메가커피");
		m.order("할메가커피");
		
		p.pay("사라다빵", 5000);
		m.pay("사라다빵", 5000);
		m.pay("할메가커피", 5000);
		m.pay("할메가커피", 1000);
	}

}
