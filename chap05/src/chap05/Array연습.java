package chap05;

public class Array연습 {

	public static void main(String[] args) {

		
		/*
			~ 2차원 배열 ~
			1. 모두 출력
			2. 합계 출력
			3. 평균 출력
		*/
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
//		System.out.println(array.length);
//		System.out.println(array[0].length);
		
		
		System.out.println("~ array 출력 ~");
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
		}
		
		System.out.println();
		System.out.println("~ 합계 출력 ~");
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
		}
		System.out.println("sum : " + sum);
		
		
		System.out.println("~ 평균 출력 ~");
		int a = 0;
		for(int i = 0; i < array.length; i++) {
			// array 배열의 전체 크기(개수) 구하기
			a += array[i].length;	
			// array[0] = 2, array[1] = 3, array[2] = 5 
			// => 10
//			System.out.println(a);
			avg = (double)sum /(a);
		}
		System.out.println("avg : " + avg);
		
		
		/*
			~ 배열 속 최대값 구하기 ~
			 - 전략
			  1. 배열의 첫번째 값 기준 (혹은 절대 나올 수 없는 최저치를 기준)
			  2. 기준과 비교
			  3. 더 큰 값을 새로운 기준으로 정함
			  4. 반복하면 최대값 나옴
		*/
		
		
		System.out.println();
		System.out.println("~ 최대값 구하기 ~");
		int max = 0;
		// Integer.MIN_VALUE : int가 가질 수 있는 최소값 (<-> MAX_VALUE)
		int[] array2 = {1, 5, 3, 8, 2};
		
		for(int i = 0; i < array2.length; i++) {
			// max값을 array2[i]으로 선언
			// array2[0]과 array2[1]을 비교 가능
			// max값이 변하며 최대값만 max에 들어올 수 있게함
			if(array2[i] > max) {
				max = array2[i];
			}
		}
		
		System.out.println("max : " + max);
		
	}

}
