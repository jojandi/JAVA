package exam;

import java.util.Scanner;

public class Game {

	//임의의 수 0~9에서 하나 결정 // ex 7
	// 사회자양반여기정답(3)
	// >> UP (시도회수: 1)
	// 사회자양반여기정답(8)
	// >> DOWN (시도회수: 2)
	// 사회자양반여기정답(7)
	// >> 정답 (시도회수: 3)
	Scanner scan = new Scanner(System.in);
	
	int a;
	int count = 1;
	boolean is = false;
	
	void try_ (int t) {
		
		if(t == a) {
			System.out.println("정답입니다! (시도회수 : "+count+")");
			is = true;
		} else if(t > a) {
			System.out.println("DOWN! (시도회수 : "+count+")");
			count++;
			is = false;
		} else {
			System.out.println("UP! (시도회수 : "+count+")");
			count++;
			is = false;
		}
		
	}
	
	void run() {
		double num = Math.random() * 10;
		a = (int)num;
		System.out.println("임의의 수 : " + a);
		while(!is){
			int t = scan.nextInt();
			System.out.println("도전하는 수 : " + t);
			try_(t);
		}
	}
	
}
