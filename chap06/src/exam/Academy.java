package exam;

import java.util.ArrayList;

public class Academy {
	
	String aname; // 학원이름
	ArrayList ss = new ArrayList(); // 학생 10명이 있는 리스트
	int cnt = 0; 
	Student s = new Student();
	
	Academy(String an){
		aname = an;
		System.out.println("학원 이름 : " + aname);
		System.out.println("-------------------------------------------------------------");
	}
	
	/**
	join(학원생)을 하면 Students 배열에 들어가게 하기!
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
	*/
	void viewList() {
		System.out.println("-------------------------------------------------------------");
		System.out.println(aname + " 학원의 학원생 명단");
		System.out.println(ss);	
		
//		for(int i = 0; i < ss.size(); i++) {
//			System.out.println(ss.get(i));
//		}
	}
	
	
}
