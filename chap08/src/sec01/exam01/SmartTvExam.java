package sec01.exam01;

public class SmartTvExam {

	public static void main(String[] args) {

		System.out.println("-------- SmartTv 타입 --------");
		SmartTv sTv = new SmartTv();
		// 모든 인터페이스 사용 가능
		sTv.search("abc");
		sTv.setVoulume(-10);
		
		System.out.println("\n------ RemoteControl 타입 ------");
		RemoteControl rTv = sTv;
//		rTv.search("abc"); -> RemoteControl 타입에 넣으면 Searchable 인터페이스 사용 불가
		rTv.setVoulume(5);
		
		System.out.println("\n------- Searchable 타입 -------");
		Searchable scTv = sTv;
//		scTv.setVoulume(5); -> Searchable 타입에 넣으면 RemoteControl 인터페이스 사용 불가
		scTv.search("abc");
		
	}

}
