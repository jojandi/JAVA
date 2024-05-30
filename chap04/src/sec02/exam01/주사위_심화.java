package sec02.exam01;

public class 주사위_심화 {

	public static void main(String[] args) {
		/*
		 주사위 2개 굴림
		 
		 1단계
		  - 주사위 2개를 굴려서 나올 수 있는 모든 조합(1 1, 1 2 ...) 모두 출력
		  
		 2단계
		  - 합 별로 나올 수 있는 조합
		  	합이 2 : [1 1]
		  	합이 3 : [1 2] [2 1]
		  	...
		 
		*/
		
		//1단계
		System.out.println("-------------1단계-------------");
		
		int d1, d2;
		int coun = 0;
		
		for(d1 = 1; d1 <= 6; d1++) {
			for(d2 = 1; d2 <= 6; d2++) {
//				System.out.println("["+d1+","+d2+"] ");
				coun++;
			}
		}
		System.out.println("주사위 2개를 굴려서 나올 수 있는 조합의 갯수 : "+coun+"개");

		
		//2단계
		System.out.println();
		System.out.println("-------------2단계-------------");
		int c, c1, c2, c3;
		for(c = 2; c <= 12; c++) {
			System.out.print("합이 "+c+"\t: ");	
			for(c1 = 1; c1 <= 6; c1++) {
				for(c2 = 1; c2 <= 6; c2++) {
					c3 = c1 + c2;
					if(c3 == c) {
						// if를 하나만 쓸 수 있음
						// c의값이 2이라면 c1+c2의 값(c3)의 값도 2여야 if 실행
						// => 합이 2~12가 한 번 나오면서 간단한 코드
						System.out.print("["+c1+" "+c2+"] ");
					}
				}	
			}
			System.out.println();
		}
}
}


