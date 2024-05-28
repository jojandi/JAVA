package sec02.exam01;

public class ForExam {

	public static void main(String[] args) {
		
		// 1씩 증가하는 걸 5번 반복
		// 1 + 1 + 1 + 1 + 1
		int sum = 0;
		sum += 1;	//sum++; sum = sum + 1
		sum += 1;
		sum += 1;
		sum += 1;
		sum += 1;
		System.out.println("sum : "+ sum);
		System.out.println("-----------------------");
		
		
		// n*(n+1) / 2 = 1~n까지 더한 값
		// 1 + 2 + 3 + 4 + 5 
		sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		System.out.println("sum : "+ sum);
		System.out.println("-----------------------");
		
		
		// 1, 2, 3...에 해당하는 걸 변수에 넣기
		sum = 0;
		
		// 초기화식
		int i = 0;
		
		// 증감식
		i++;// 1
		
		// 실행문
		sum = sum + i;	//+1
		
		i++;// 2
		sum = sum + i;	//+2
		
		i++;// 3
		sum = sum + i;	//+3
		
		
		/*
		  ~ 반복문을 만드는 원리 ~
		  1. 반복 되는 것 찾기 : (Ctrl+c,v)해도 바뀌지 않는 것
		  2. 반복되지 않는 것
		  	패턴(규칙)을 찾을 수 있다면 반복문으로 만들 수 있음
		  	변수를 활용해서 반복되게 만들기
		  3. 반복 되지 않는 것의 '시작 조건'과 '종료 조건' 찾기
		  
		  ~ 반복문의 종류 ~
		  for : 반복 횟수를 아는 경우
		  while : 반복 횟수를 모르는 경우
		*/


		
		/*
		 처음 한 번만 초기화식 실행
		 
		 ~ 조건이 참 ~
		 	실행블럭 실행 -> 증감식 실행 -> 조건 확인 -> 반복
		 ~ 조건이 거짓 ~
		 	for문 탈출
		 
		 ~ 구조 ~
		 	for(초기화식; 조건; 증감식){
		 		실행블럭
		 	}
		*/
		
		int sum2 = 0;
		for(int e = 1; e <= 5 ; e++) {
			sum2 = sum2 + e;
			System.out.println("for문 안 e : "+ e +", sum2 : "+ sum2);
		}
		System.out.println("for 사용 sum2 : "+ sum2);
		System.out.println("-----------------------");
		
		
		// 1~10까지의 합 구하기
		int sum3 = 0;
		for(int j = 1; j <= 10; j++) {
			sum3 += j;
		}
		System.out.println("sum3 : "+sum3);
		
		
		// 1~10까지 출력
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		
		/*
 		 ~ 반복되는 걸 찾는 쉬운 방법 ~
 		 1. 복사 붙여넣기
 		 2. 변경할 부분 찾기 -> 변수로 변환
 		 3. 변경되는 규칙 찾기
		*/
		
		System.out.println(5);
		int i2 = 5 + 1;
		System.out.println(i2);	// 6
		i2 = i2 + 1;
		System.out.println(i2);	// 7
		i2 = i2 + 1;
		System.out.println(i2);	// 8
		i2 = i2 + 1;
		System.out.println("-----------------------");

		
		// 1~10까지 짝수만 출력
		// - 증감식 이용
		// - if문 이용
				
				
		for(i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				System.out.println("i : "+ i);
			}
		}
		System.out.println("-----------------------");
		
				
		// 1~10까지 한 줄에 3개씩 출력
		for(int j = 1; j <= 10; j++) {
			if(j % 3 == 0) {
				System.out.println(j);
			} else {
					System.out.print(j);
			}
		}
	}

}
