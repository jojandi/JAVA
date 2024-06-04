package chap05;

import java.util.ArrayList;

public class ArrayExam {

	public static void main(String[] args) {

		/*
		 ~ 배열 ~
		 
		 - 한 번에 여러 변수를 만들 수 있음
		 - 같은 타입만 선언 가능
		 - 생성된 여러 변수들은  index로 관리 가능
		 
		 ~ 선언 방법 ~
		
		 타입[] 변수; -> java 스타일 
		 타입 변수[]; -> c 스타일
		*/
		
		// int로 구성된 배열
		int [] score;
		int score2 [];
		
		score = null;
		// 참조타입이기 때문에 null 사용 가능
		
		int[] score3 = null;
		
		System.out.println("---------------1--------------");
		// 배열 생성 시 크기를 줘야함
		/* 
		~ []의 의미 ~
		
		 첫번째 [] : 타입으로 이루어진 배열 
		 			 int[] => int 타입으로 이루어진 배열
		 			 모든 타입이 올 수 있음
		 두번째 [n] : 배열의 크기(한 번에 만들 변수의 갯수)
		 			  타입의 크기만큼 연달아서 메모리 할당
		 			  index 0으로 시작(n-1이 마지막 변수)
		 세번째 배열이름[0] : 만들어진 변수들 중 첫번째 변수를 뜻함
		
		*/
		int[] intarray = new int[3];
		intarray[0] = 90;	// intarray의 첫번째 변수에 90을 넣어줌 => index 0
		intarray[1] = 60;
//		intarray[2] = 70;
 		
		System.out.println("intarray[1] : "+intarray[1]);
		System.out.println("intarray[2] : "+intarray[2]);
		// 기본값은 0 또는 false 또는 null로 초기화
		
//		System.out.println("intarray[3] : "+intarray[3]);
		// java.lang.ArrayIndexOutOfBoundsException
		
		// 배열의 모든 값을 1로 바꿈
//		for(int i = 0; i < 3; i++)
		for(int i = 0; i < intarray.length; i++) {
			intarray[i] = 1;
		}
		
		for(int i = 0; i < intarray.length; i++) {
			System.out.println(intarray[i]);
		}
		
		System.out.println(intarray);	//[I@59f95c5d
		// 대략적인 주소값 나옴
		System.out.println(intarray.length);
		// 배열의 크기를 알려줌
		
		// 한 번 선언된 배열의 크기는 바꿀 수 없음
//		intarray.length = 4;
		
		
		
		System.out.println("--------------- 2 --------------");
		// 배열을 쓰는 두 번째 방법
		int [] intarray2 = new int[] {10, 20, 30, 40};
		for(int i = 0; i < intarray2.length; i++) {
			System.out.println(intarray2[i]);
		}
		
		
		
		System.out.println("--------------- 3 --------------");
		// 배열을 쓰는 세 번째 방법
		// 선언과 동시에 초기화 할 때만 사용 가능
		int[] intarray3 = {100, 200, 300, 400};
		for(int i = 0; i < intarray3.length; i++) {
			System.out.println(intarray3[i]);
		}
		
		System.out.println("-----------------------------");
		String[] a = new String[5];
		for(int i = 0; i < a.length; i++) {
			a[i] = "조민정"+(i + 1);				
		}
		// 웬만하면 배열 할당부분과 출력 부분 따로 만들기
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
		
		// 1~10까지 배열에 넣기
		// 배열의 총 합 출력
		// 배열의 평균값 출력
		int[] score_ = new int[10];
		for(int i = 0; i < score_.length; i++) {
			score_[i] = i + 1;
		}
		
		int sum = 0;
		for(int i = 0; i < score_.length; i++) {
			sum += score_[i];
		}
		System.out.println("총합 : "+ sum);
		
		double avg = (double)sum / score_.length;
		System.out.println("평균값 : "+ avg);
		
		
		
		int[] class1 = new int[22];
		int[] class2 = new int[22];
		int[] class3 = new int[22];
		int[] class4 = new int[22];
		
		// int[] 배열이 배열 안에 들어감
		// int[]을 변수들로 관리하는 배열이 됨
		// [4] : 내 크기(자식 배열의 갯수), [22] : 자식 배열의 크기
		int[][] 천안 = new int[4][22];
		
		System.out.println("천안 : " + 천안);	// [[I@9e89d68
		System.out.println("천안[0] : " + 천안[0]);	// [I@3b192d32
		System.out.println("천안[0][0] : " + 천안[0][0]);	// 0
		
		int[] 클래스1 = 천안[0];
//		int 학생1 = 클래스1[0];
		// 위 수식과 아래 수식은 같은 뜻
		int 학생1 = 천안[0][0];
		
		int[][] test = new int[3][2];
		int[][] test2 = {
						{5, 6},
						{12, 15},
						{93, 87},
						};
		
		
		int[][] 수원 = new int[4][22];
		int[][] 서울 = new int[4][22];
		
		int[][][] 휴먼 = new int[3][4][22];
		System.out.println(22 * 4 * 3);	// 총 변수 갯수
		
		System.out.println("휴먼.length : " + 휴먼.length); // 3
		System.out.println("휴먼[0].length : " + 휴먼[0].length);	// 4
		// 휴먼[0] == 천안
		System.out.println("휴먼[0][0].length : " + 휴먼[0][0].length); // 22
		
		
		int[][] 달력 = new int[12][31];
		for(int i = 0; i < 달력.length; i++) {
			// 달력.length = 12
			for(int j = 0; j < 달력[i].length; j++) {
				// 달력[i].length = 31
				System.out.println((i+1)+"월 "+(j+1)+"일"+달력[i][j]);
			}
		}
		System.out.println("-----------------------------");
		
		ArrayList list = new ArrayList();
		list.add(1);
		list.add("문자도 들어감");
		list.add("안 들어가는 게 없다! 대박!");
		list.add(true);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		// 배열의 length
		System.out.println("list.size() : "+list.size());
		System.out.println(list);
		
		
		System.out.println("-------------study-------------");
		String[] study = {
				"박규태", "이제섭", "김아영", "박경민", "정근승", "현준수", "남현우", 
				"김승환", "조민정", "이정은"};
		System.out.println("총 : "+ study.length+ "명");
		
//		// 배열에서 random으로 뽑기
//		double rand = Math.random() * study.length; // 0~9.9999...까지
//		int index = (int)rand;	// 0~9까지
//		System.out.println("실험 : "+ study[index]);
		
		
		// 100번 뽑아서 가장 많이 나온 사람 선택
		int[] vote = new int[study.length];

		for(int i = 0; i < 1000; i++) {
			double rand = Math.random() * study.length;
			int index = (int)rand;
			
			// 득표수 누적 시키기
			vote[index] += 1;
		}
		for(int i = 0; i < vote.length; i++) {
			System.out.println("index : "+ i +" 득표수 : "+ vote[i]);
		}
		for(int i = 0; i < study.length; i++) {
			System.out.println("index : "+ i +" 이름 : "+ study[i]);
		}
		int max = 0;
		for(int i = 0; i < study.length; i++) {
			if(vote[i] > max) {
				max = vote[i];
				
			}
		}
		System.out.println("최다 득표수 : "+ max);
		
		
		System.out.println("-------------lotto-------------");
		// 6개의 lotto 번호를 저장
		int[] lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)((Math.random() * 10000) % 45) + 1;
			// 중복제거?
		}
		for(int i = 0; i < lotto.length; i++) {
			System.out.println((i+1)+"번 : "+lotto[i]);
			
		}
		 
		
	}

}
