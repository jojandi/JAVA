package sec02.exam01;

public class 피라미드 {

	public static void main(String[] args) {
		//피라미드
		//0단계
		System.out.println("--------0단계--------");
		for(int k = 1; k <= 5; k++) {
			System.out.println("+");
		}
		
		
		//1단계
		System.out.println("--------1단계--------");
		for(int k = 1; k <= 5; k++) {
			System.out.print("+");
		}
		System.out.println();
		
		
		//2단계
		System.out.println("--------2단계--------");
		for(int k = 1; k <= 3; k++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print("+");
			}
			System.out.println();
		}
		
		
		//2-1단계
		System.out.println("--------2-1단계--------");
		for(int k = 1; k <= 3; k++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print("+");
				System.out.print(".");
			}
			System.out.println();
		}
		
		int n =5;
		// 피라미드 단수 변경
		
		//3단계
		System.out.println("--------3단계--------");
		for(int k = 1; k <= n; k++) {
			for(int j = 1; j <= k; j++) {
				System.out.print("+");
			}
			System.out.println();
		}
		
		
		//4단계
		System.out.println("--------4단계--------");
		int k, j, r;
		for(k = 1; k <= n; k++) {
			for(j = 1; j <= k; j++) {
				System.out.print("+");
			}
			// r <= n - k -> 전체 n에서 *인 k값을 빼 공백을 .으로 채우기 위해
			// k 대신 j를 넣으면 .의 갯수가 하나 모자름
			// j는 큰 for문이 끝나야 +1 되어서 그런듯
			for(r = 1; r <= n - k; r++) {
				System.out.print(".");
			}			
			System.out.println();
		}
		
		
		//5단계
		System.out.println("--------5단계--------");
		for(k = 1; k <= n; k++) {
			for(r = 1; r <= n - k; r++) {
				System.out.print(".");
			}			
			for(j = 1; j <= k; j++) {
				System.out.print("+");
			}
			System.out.println();
		}
		
		
		//6단계
		System.out.println("--------6단계--------");
		for(k = 1; k <= n; k++) {
			for(r = 1; r <= n - k; r++) {
				System.out.print(".");
			}			
			// j <= (k * 2) - 1 -> *의 갯수를 1, 3, 5 ...로 늘리기 위해
			for(j = 1; j <= (k * 2) - 1; j++) {
				System.out.print("+");
			}
			System.out.println();
		}
		
		
		//7단계
		System.out.println("--------7단계--------");
		for(k = 1; k <= n; k++) {
			for(r = 1; r <= n - k; r++) {
				System.out.print(".");
			}			
			for(j = 1; j <= (k * 2) - 1; j++) {
				System.out.print("+");
			}
			for(int i = 1; i <= n - k; i++) {
				System.out.print(".");
			}
			System.out.println();
		}
		
		
		//8단계
		System.out.println("--------8단계--------");
		for(k = 1; k <= n; k++) {
			for(j = 1; j <= k - 1; j++) {
				System.out.print(".");			
			}
			for(r = 1; r <= (n - k)* 2 + 1; r++) {
				System.out.print("+");			
			}
			for(j = 1; j <= k - 1; j++) {
				System.out.print(".");			
			}
			System.out.println();
		}
		
		
		//9단계
		System.out.println("--------9단계--------");
		for(k = 1; k <= n - 1; k++) {
			// k <= n - 1 -> 마름모 모서리를 한 줄만 나오게 하기 위해
			for(j = 1; j <= n - k; j++) {
				System.out.print(".");
			}
			for(r = 1; r <= (k * 2) - 1; r++) {
				System.out.print("+");
			}
			for(j = 1; j <= n - k; j++) {
				System.out.print(".");
			}
			System.out.println();
		}
		for(k = 1; k <= n; k++) {
			for(j = 1; j <= k - 1; j++) {
				System.out.print(".");			
			}
			for(r = 1; r <= (n - k)* 2 + 1; r++) {
				System.out.print("+");			
			}
			for(j = 1; j <= k - 1; j++) {
				System.out.print(".");			
			}
			System.out.println();
		}
	}

}
