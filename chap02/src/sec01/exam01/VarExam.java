package sec01.exam01;

public class VarExam {

	public static void main(String[] args) {
		
		/*
		 ~ 변수명을 정하는 규칙 ~
		  
		  1. 숫자로 시작 X (ex. 30int -> X)
		  2. 예약어 사용 X (ex. int, double -> X)
		  3. 허용하는 특수문자 : _, $(ex. int_a, int$a)
		  4. 소문자로 시작(자바에서만)
		 
		 */
		
		
		// 변수 선언 : 자료의 종류(type) 이름
		int score; // 선언부
		score = 90; // 할당(값 저장)

//		int value;
//		value = 30;
		int value = 30; // 선언과 동시에 초기화
		value = 31;	//값 변경 : 변수는 값 변경 가능
		
		value = score + value;
//		= 90  + 31
		
		// int val;	
		//선언 후 값을 할당하지 않았다면 사용 불가
//		int val2 = val + 10;
		//같은 이름의 변수를 선언할 수 없다
//		int val;
		
		System.out.println(value);
		
		
		int var1 = 10;
		int var2 = 20;
		
		System.out.println("var1 : "+ var1);
		System.out.println("var2 : "+ var2);
		
		
		int x = 10;
		int y = x;
	}
	
	int j=2;{
		int j=1;	//선언불가(자손 중괄호에도 영향을 받기 때문)
	}
	
	{ int i = 0; }
	int i = 1;	//선언가능(선언 된 중괄호가 끝났기 때문)

}
