package sec01.exam01;

public class LottoExam {

	public static void main(String[] args) {
		
		double rand = Math.random();
		// 0 이상 1 미만의 값
		// 0 <= rand && rand < 1

//		int number = (int)(rand * 45);	// 0~44까지의 값
//		number += 1;	// 1~45까지의 값
		int number = (int)(rand * 45) + 1;	//한 번에 정리
		
		number = ((int)(rand * 10000) % 45) + 1;	//1 ~ 45
		
		System.out.println(number);
		
		rand = Math.random();
		number = ((int)(rand * 10000) % 45) + 1;
		System.out.println(number);
		
		rand = Math.random();
		number = ((int)(rand * 10000) % 45) + 1;
		System.out.println(number);
		
		rand = Math.random();
		number = ((int)(rand * 10000) % 45) + 1;
		System.out.println(number);
	}

}
