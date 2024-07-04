package exam;

import java.util.Scanner;

public class Login {
	/*
	~ 로그인 기능을 만들자! ~
		생성자로 id, pw를 받아서 저장해 놓음 (회원가입)
		login(아이디, 패스워드) 실행하면
		login메소드 안에서...
		만약 같으면 "메인페이지" 출력하고 true 돌려줌
		다르면 "로그인 화면으로 돌아감" 출력하고 false 돌려줌
	*/
	Scanner scan = new Scanner(System.in);
	String id;
	String pw;
	boolean is = false;
	
	Login(){
		System.out.println("아이디를 설정하세요. ");
		id = scan.next();
		System.out.println("비밀번호를 설정하세요. ");
		pw = scan.next();
		
		System.out.println("아이디 : " + id + ", 비밀번호 : " + pw);
	}
	
	boolean login() {
		while(true) {			
			System.out.println("아이디를 입력하세요. ");
			String i = scan.next();
			System.out.println("비밀번호를 입력하세요. ");
			String p = scan.next();
			
//			System.out.println(i);
//			System.out.println(p);
			
			if(i.equals(id) && p.equals(pw)) {
				System.out.println("메인페이지");
				is = true;
				break;
			} else {
				System.out.println("로그인 화면으로 돌아감");
				is = false;
			}
		}
		return is;
	}
	
	
}
