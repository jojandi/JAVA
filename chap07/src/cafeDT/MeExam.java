package cafeDT;

public class MeExam {

	public static void main(String[] args) {

		Twosome TS = new Twosome();
//		Cafe TS = new Twosome();
		Starbucks SB = new Starbucks();
//		Cafe SB = new Starbucks();
		
		Me m = new Me();
		
		m.me(TS, "아이스아메리카노"); // 타입이 Cafe로 자동형변환
		m.me(SB, "자몽허니블랙티"); // 타입이 Cafe로 자동형변환
		
	}

}
