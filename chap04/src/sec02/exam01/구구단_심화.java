package sec02.exam01;

public class 구구단_심화 {

	public static void main(String[] args) {

		//1단계
		System.out.println("----------------1단계----------------");
		for(int m = 2; m <= 9; m++) {
			System.out.print(m+"단 : ");
			for(int n = 1; n <= 9; n++) {
				System.out.print(m +"*"+ n +"="+ (m * n) +"\t");
			}
			System.out.println(" ");
		}
		
		//2단계
		System.out.println();
		System.out.println("----------------2단계----------------");
		int m, n, d;
		for(m = 2; m <= 9; m += 4) {
			// n단씩 출력되게 하기 위해서는 m += n
			for(n = 1; n <= 9; n++) {
//				if(m + 2 >= 10) {
//					m = 9;
//				} 10단까지 나오는 문제
				// -> m+2의 값을 9로 변경 => 실패 --> m+2를 변수로?

				int c = m + 3;
				// n단씩 출력되게 하기 위해서는 c = m + (n-1);
				if( c >= 10) {
					c = 9;
				}
				// m + 2를 변수 c로 저장
				// => c의 값이 10 이상이면 9가 되도록 함
				// => 10단 이상은 출력되지 않음
				// max값 조절 방법
				
				for(d = m; d <= c; d++) {	//3단씩 출력되게 함
					System.out.print(d +"*"+ n +"="+ d * n +"\t");	
				}
				System.out.println();	//3단 한 줄이 출력 되면 줄바꿈
			}
		System.out.println("----------------------");
		}
		
	}

}
