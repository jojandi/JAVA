package sec02.exam01;

public class BreakExam {

	public static void main(String[] args) {
		
		System.out.println("START!");
		int count = 0;
		while(true) {
			int num = (int)(Math.random() * 6) + 1;
			System.out.println(num);
			count++;
			if(num == 6) {
				break;	//가장 가까운 반복문을 종료시킴
			}
//			count++;	6이 나오면 break로 인해 count 값이 안 올라감(6제외)
		}
		System.out.println(count+"번");
		System.out.println("-----------------------");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			
			if(i == 7) {
				break;
			}
			System.out.println("한 턴 종료");
		}
		System.out.println("for문 종료");
		System.out.println("-----------------------");
		/*
		 * 
		// i값이 1, 3, 5..가 되어 4를 건너뜀 -> break; 안 먹음 -> 끝까지 실행
		for(int i = 1; i <= 10; i+=2) {
			System.out.println(i);
			
			if(i == 4) {
				break;
			}
			System.out.println("한 턴 종료");
		}
		System.out.println("for문 종료");
		
		*/
		
		for(int i = 0; i < 5; i++) {
			System.out.println("i : "+ i);
			
			for(int j = 0; j < 3; j++) {
				if(j >= 1) {
					break;	
					// j에대한 for문만 실행 종료
					// 위치에 따라 1까지 출력 되고 break 되거나 
					// 0까지 출력되고 break되게 할 수 있음
				}
				System.out.println("j : "+ j);
			}
			System.out.println();
		}
		
		
		
		for(int i=0; i < 10; i++) {
			if(i % 2 != 0) {
				continue;
				// 조건이 맞지 않는다면 이후 실행문은 무시
				// 다시 위로 올라가서 조건 등 확인
			}
			System.out.println("짝수?"+i);
		}
	}

}
