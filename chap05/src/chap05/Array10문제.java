package chap05;

import java.util.Scanner;

public class Array10문제 {

	public static void main(String[] args) {

		/*
			{1, 5, 2, 4}
			1. 배열 뒤집기 -> {4, 2, 5, 1}
			2. 첫 번째 자리에 0 넣기 -> {0, 1, 5, 2, 4}
			3. 마지막 숫자를 첫번째에 넣기 -> {4, 1, 5, 2}
			
			{3, 4, 7, 5, 1, 4, 6, 4, 5}
			4. 홀수와 짝수의 개수 출력(홀 : 5, 짝 : 5)
			5. 주어진 수(scanner 사용 / 지정) 보다 큰 숫자의 개수
			
			- 난이도 높아짐 -
			6. 두 번째 최대값 구하기
			7. 내림차순으로 정렬(큰 수부터 작은 수 순으로)
			
			로또 6개 번호(1~45)
			8. 중복되지 않게 숫자 선정
			
			9. 자리 예약
			 - 자리가 10개 있는 소극장 예약 시스템 만들기
			 - 1~10번까지 번호가 있음
			 - 1) 예약할 자리는? 하고 입력 받음
			 - 1-1) 예약이 가능하면 "예약했습니다" 출력
			 - 1-2) 예약이 불가하면 "이미 예약 되어있습니다" 출력
			 - 2) 모든 자리의 예약 가능 여부 출력
			 - 3) 예약 가능한 자리만 출력
			
			10. 임시비밀번호 8자리 만들기
			 - 1) 모두 다 숫자로
			 - 2) 모두 다 소문자로 (char ascii 사용)
			 - 3) 숫자 2개 이상, 대문에 1개 이상, 소문자 1개 이상 조합
		*/
		
		int[] array1 = {1, 5, 2, 4};
		
		// 1. 배열 뒤집기 -> {4, 2, 5, 1}
		System.out.println("~ 1. 배열 뒤집기 ~");
		
		int[] a1 = new int[array1.length];
		for(int i = 0, j = 3; i < a1.length; i++, j--) {
			a1[i] = array1[j];
		}
		
		for(int i = 0; i < a1.length; i++) {
			System.out.print(a1[i]+" ");
		}
		System.out.println();
		
		
		
		// 2. 첫 번째 자리에 0 넣기 -> {0, 1, 5, 2, 4}
		System.out.println();
		System.out.println("~ 2. 첫 번째 자리에 0 넣기 ~");
		
		int[] a2 = new int[array1.length + 1];
		for(int i = 1, j = 0; i < a2.length; i++, j++) {
			a2[i] = array1[j];
		}
		a2[0] = 0;
		for(int i = 0; i < a2.length; i++) {
			System.out.print(a2[i]+" ");
		}
		System.out.println();
		
		
		
		// 3. 마지막 숫자를 첫번째에 넣기 -> {4, 1, 5, 2}
		System.out.println();
		System.out.println("~ 3. 마지막 숫자를 첫번째에 넣기 ~");
		
		int[] a3 = new int[array1.length];
		int n = array1.length;
		
		for(int i = 0; i < n; i++) {
			a3[(i+1) % n] = array1[i];
		}
		for(int i = 0; i < n; i++) {
			System.out.print(a3[i]+" ");
		}
		
		
		System.out.println();

		
		
		int[] array2 = {3, 4, 7, 5, 1, 4, 6, 4, 5};
		
		// 4. 홀수와 짝수의 개수 출력(홀 : 5, 짝 : 5)
		System.out.println();
		System.out.println("~ 4. 홀수와 짝수의 개수 출력 ~");
		
		int c1 = 0;
		int c2 = 0;
		for(int i = 0; i < array2.length; i++) {
			if(array2[i] % 2 == 0) {
//				System.out.println("짝수");
				c1++;
			} else {
//				System.out.println("홀수");
				c2++;
			}
		}
		System.out.println("짝수 : "+c1+", 홀수 : "+c2);
		System.out.println();
		
		
		
		Scanner scanner = new Scanner(System.in);
		/*
		// 5. 주어진 수(예를 들어 4)보다 큰 숫자의 개수
	    System.out.println("~ 5. 주어진 수보다 큰 숫자의 개수 ~");
	    int scan = scanner.nextInt();
	    int count = 0;
	    for(int i = 0; i < array2.length; i++) {
	        if(scan < array2[i]) {
	           count++;
	        }
	    }
	    System.out.println(scan + "보다 큰 숫자의 개수 : " + count + "개");
	    System.out.println();
	    */
		
		
		
		// 6. 두 번째 최대값 구하기
		System.out.println("~ 6. 두 번째 최대값 구하기 ~");
		int[] a6 = new int[array2.length];
		int x1 = 0;
	    for(int i = 0; i < a6.length; i++) {
	    	a6[i] = array2[i];
	    }
	    for(int i = 0; i < a6.length; i++) {
	    	for(int j = i+1; j < a6.length; j++) {
	    		if(a6[i] < a6[j]) {
	    			x1 = a6[i];
	    			a6[i] = a6[j];
	    			a6[j] = x1;
	    		}
	    	}
	    }
	    System.out.println(a6[1]);
		System.out.println();
		
		
		
		// 7. 내림차순으로 정렬(큰 수부터 작은 수 순으로)
		System.out.println("~ 7. 내림차순으로 정렬(큰 수부터 작은 수 순으로 ~");
	    int[] a7 = new int[array2.length];
	    int x2 = 0;
	    for(int i = 0; i < a7.length; i++) {
	    	a7[i] = array2[i];
	    }
	    for(int i = 0; i < a7.length; i++) {
	    	for(int j = i+1; j < a7.length; j++) {
	    		if(a7[i] < a7[j]) {
	    			x2 = a7[i];
	    			a7[i] = a7[j];
	    			a7[j] = x2;
	    			System.out.print(a7[i]+" ");
	    		}
	    	}
	    	System.out.println();
	    }
	    for(int i = 0; i < a7.length; i++) {
	    	System.out.print(a7[i]+" ");
	    }
	    System.out.println();
	    System.out.println();
	    
	    
	    
		// 8. 로또 6개 번호(1~45) 중복되지 않게 숫자 선정
	    System.out.println("~ 8. 로또 6개 번호 중복되지 않게 숫자 선정 ~");
	    int[] a8 = new int[6];
	    for(int i = 0; i < a8.length; i++) {
	        double rand = (Math.random() * 45) + 1;
	        a8[i] = (int)rand;
//	        System.out.print(a8[i]+" ");
	        for(int j = 0; j < i; j++) {
	        	if(a8[i] == a8[j]) {
	               i--;
	            }
	        }
	    }
	    System.out.println();
	    for(int i = 0; i < a8.length; i++) {
	        System.out.print(a8[i]+" ");
	    }
	    System.out.println();
	    System.out.println();
		
	    
	    
/*
//        9. 자리 예약
//         - 자리가 10개 있는 소극장 예약 시스템
//         - 1~10(또는 0~9)번까지 번호의 자리
//         - 예약할 자리는? 하고 입력 받음
//         1-1) 예약이 가능하면 "예약했습니다"
//         1-2) 예약 불가능하면 "이미 예약 되어있습니다"
//         2) 모든 자리의 예약 가능 여부 출력
//         3) 예약 가능한 자리만 출력

	    System.out.println("~ 9. 자리 예약 ~");
	    int[] sit = new int[10]; // 좌석
	    int[] res = new int[10]; // 예약 가능 여부(1: 예약됨, 0 = 예약 안 됨)
	    for(int i = 0; i < sit.length; i++) {
	    	sit[i] = i + 1;   // 1~10번 좌석 지정
	    }
	    System.out.println("자리 예매 서비스를 시작합니다. ");
	    while(true) {
	    System.out.println("-----------------------------------------------------------------");
	    System.out.println
	    ("1. 예약 | 2. 예약 가능 좌석 | 3. 좌석 별 예약 가능 여부 | 0. 종료");
	    System.out.println("-----------------------------------------------------------------");
	    int u = scanner.nextInt();
	    System.out.println("선택 > "+ u);
	    System.out.println();
        
	    if(u == 1) { // 예약      
	    	System.out.println("예약할 좌석을 입력해주세요. (1~10)");
	    	int you = scanner.nextInt();
	    	if(you <= 10 && you >= 1) {
	    		if(res[you-1] == 1) { // res = 0~9, you = 1~10
	    			System.out.println("이미 예약된 좌석입니다. 다른 좌석을 선택해주세요. ");
	    		} else {
        		  	res[you-1] = 1;
        		  	System.out.println(you+"번 좌석이 예약되었습니다. ");
	    		}
	    	} else {
	    		System.out.println("존재하지 않는 자리입니다. (1~10까지 입력)");
	    	}
	    	System.out.println();
	    }
        
	    if(u == 2) { // 예약 가능 좌석
	    	System.out.println("예약 가능 좌석 : ");
	    	for(int i = 0; i < sit.length; i++) {
	    		if(res[i] == 0) {
	    			System.out.print(sit[i]+"번, ");
	    		}
           	}
	    	System.out.println();
	    	System.out.println();
	    }
       
	    if(u == 3) { // 좌석 별 예약 가능 여부
	    	System.out.println("좌석 별 예약 가능 여부");
	    	for(int i = 0; i < sit.length; i++) {
	    		if(res[i] == 1) {
	    			System.out.println(sit[i]+"번 좌석 : 예약 불가");
        		   	} else {
        		   		System.out.println(sit[i]+"번 좌석 : 예약 가능");
        			}
        	}
	    	System.out.println();
        }
        
	    if(u == 0) { // 종료
	    	System.out.println("서비스를 종료합니다. ");
	    	break;
        }
	    }
	    System.out.println();
	    */
	    
	    
	    /*
	      10. 임시비밀번호 8자리 만들기
	       1) 모두 다 숫자로
	       2) 모두 다 소문자로(hint: char ascii)
	       3) 숫자 2개 이상, 대문자 1개 이상, 소문자 1개 이상 조합
	    */
	    System.out.println("~ 10. 임시비밀번호 8자리 만들기 (숫자) ~");
	    int[] pw1 = new int[8];
	    for(int i = 0; i < pw1.length; i++) {
	    	double num = Math.random() * 10;
	    	// 0 ~ 9.9999
	        pw1[i] = (int)num;
	    }
	    for(int i = 0; i < pw1.length; i++) {
	    	System.out.print(pw1[i]+" ");
	    }
	    System.out.println();
	      
	      
	    System.out.println("~ 10. 임시비밀번호 8자리 만들기 (소문자) ~");
	    char[] pw2 = new char[8];
	    for(int i = 0; i < pw2.length; i++) {
	    	double ch = Math.random() * 26;
	    	// 0~25.999 -> 알파벳 개수(25개)
	    	pw2[i] = (char)(ch + 97);
	        // 소문자 a -> ascii code 97 => + 97하면 소문자 알파벳 나옴
	    }
	    for(int i = 0; i < pw2.length; i++) {
	    	System.out.print(pw2[i]+" ");
	    }
	    System.out.println();
	      

	    System.out.println
	    ("~ 10. 임시비밀번호 8자리 만들기 (숫자 2개 이상, 대문자 1개 이상, 소문자 1개 이상) ~");
	    // ascii 사용
	    char[] pw3 = new char[8];
	    // 숫자 : 48~57, 대문자 : 65~90, 소문자 : 97~122
	    
	    // index 0~3 -> 숫자 숫자 대문자 소문자
	    for(int i = 0; i < 2; i++) {
	    	double num = Math.random() * 10 + 48; // 숫자 랜덤
	    	pw3[i] = (char)(num);
	    }
	    double A = Math.random() * 26 + 65; // 대문자 랜덤
	    pw3[2] = (char)(A);
	    
	    double a = Math.random() * 26 + 97; // 소문자 랜덤
	    pw3[3] = (char)(a);
	    
	    // index 4~7 -> 숫자, 대문자, 소문자 랜덤
	    for(int i = 4; i < pw3.length; i++) {
	    	double num = Math.random() * 10 + 48;
	    	A = Math.random() * 26 + 65;
	    	a = Math.random() * 26 + 97;
	    	double b = Math.random() * 3;
		    int bool = (int) b; // 0~2
		    
	        if(bool == 0) {
	        	pw3[i] = (char)(num); // 숫자 랜덤
	        } else if(bool == 1){
	        	pw3[i] = (char)(A); // 대문자 랜덤
	        } else{
	        	pw3[i] = (char)(a); // 소문자 랜덤
	        }
	    }
	    
	    
	    int[] pw = new int[8];
	    char[] one = new char[8];
	    
	    for(int i = 0; i < pw.length; i++) {
	    	double ch4 = Math.random() * 8; // 0~7.999
	    	pw[i] = (int)ch4;
//	    	System.out.print(pw5[i]+" ");
	    	for(int j = 0; j < i; j++) { //중복 제거
	    		if(pw[i] == pw[j]) {
	    			i--;
	    		}
	    	}
	    }
	    for(int i = 0; i < one.length; i++) {
	    	one[i] = pw3[pw[i]];
	    	// ex) pw[0] = 4?
	    	// one[0] = pw3[pw[0]] -> one[0] = pw3[4] -> one[0] = 랜덤(숫자/대소문자)
	    }
	    
//	    for(int i = 0; i < pw3.length; i++) {
//	    	System.out.print(pw3[i]+" ");
//	    }
//	    for(int i = 0; i < pw.length; i++) {
//	    	System.out.print(pw[i]+" ");
//	    }
	    for(int i = 0; i < one.length; i++) {
	    	System.out.print(one[i]+" ");
	    }
	    
	    
	}

}
