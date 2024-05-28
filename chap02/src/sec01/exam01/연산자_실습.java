package sec01.exam01;

public class 연산자_실습 {

	public static void main(String[] args) {
		
		/*
		 ~ 프로그래밍 하는 방법 ~
		 
		 1. 예측과 결과가 같은지 확인 - 개발
		 2. 숫자를 바꿔도 잘 나오는지 확인 - 테스트
		 */
		
		
		/*
		  7234원이 있어요
		  5000원, 1000원, 500원, 100원, 50원, 10원, 1원
		  각각 최대 몇개까지로 표현할 수 있나요?
		*/
	int money = 7234;
	
	
	/* 방법 1

	int m5000 =  money / 5000;	// int끼리 나누기 => 결과 int, 예상값 1
	System.out.println("5천원 : "+ m5000);	// 결과 : 1
	
//	int m1000 =  money / 1000;	//예상값 2
//	System.out.println("1천원 : "+ m1000);	// 결과 : 7
	// 결과값이 2가 나와야하는 데 7이 나옴
	// => 7234로 나눴기 때문 => 7234에서 5000을 뺀 나머지 금액이 필요
		
//	int m1000 = (money - 5000) / 1000;	//7000원 대 금액일 때에만 사용 가능
//	int m1000 = (money - (5000 * m5000)) / 1000;	//코드가 길어짐
	
	money = money - (5000 * m5000);
	int m1000 = money / 1000;
	System.out.println("1천원 : "+ m1000);	// 결과 : 2
	
	money = money - (1000 * m1000);
	int m500 = money / 500;	//예상 : 0
	System.out.println("500원 : "+ m500);	// 결과 : 0
	}
	
	*/
	
	//방법 2
	int m5000 =  money / 5000;
	System.out.println("5천원 : "+ m5000);
	
	money = money % 5000;
	int m1000 = money / 1000;
	System.out.println("1천원 : "+ m1000);
	
//	money = money % 1000; = money %= 1000;
	money %= 1000;
	int m500 = money / 500;
	System.out.println("500원 : "+ m500);
	}
}