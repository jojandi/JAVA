package exam;

import java.util.ArrayList;

public class Academy {
	
	String aname; // 학원이름
	ArrayList ss = new ArrayList(); // 학생 10명이 있는 리스트
	int cnt = 0; // 10명 이상 들어갈 수 없게 카운트 적립 ( join 메소드에서 if문 조건으로 사용)

	// 안 불러와도 됨!!!
	//	Student s = new Student(); // 학생 클래스를 가져와서 join 메소드에 넣을 거임
	
	/**
	생성자
		학원 이름을 설정해주지 않으면 실행되지 않게 함
		전달인자 : 학원 이름 -> String
	*/
	Academy(String an){
		aname = an;
		System.out.println("학원 이름 : " + aname);
		System.out.println("-------------------------------------------------------------");
	}
	
	/**
	join(학원생)을 하면 Students 배열에 들어가게 하기!
		전달인자 : 학생 그 자체 -> Student
		
		만약 cnt가 10보다 작으면(0~9 => 10명만 넣을 수 있음) list ss에 학생 추가
		이후 cnt++
	*/
	void join(Student s) {
		if(cnt < 10) {			
			ss.add(s); 
			System.out.println(s + "님을 명단에 추가합니다. ");
			cnt++;
		} else {
			System.out.println("더이상 학원생을 받을 수 없습니다. ");
		}
	}
	
	
	/**
	등록된 학원생들의 이름과 나이 출력
		list ss 자체를 출력
		=> Student 클래스에서 s1, s2 등이 출력된 내용과 같이 출력됨
	*/
	void viewList() {
		System.out.println("-------------------------------------------------------------");
		System.out.println(aname + " 학원의 학원생 명단");
		System.out.println(ss);	
		
		
		// list 안에 내용을 순차적으로 출력해주는 코드
//		for(int i = 0; i < ss.size(); i++) {
//			System.out.println(ss.get(i));
//		}
	}
	
	
}
