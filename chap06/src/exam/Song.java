package exam;

import java.util.Scanner;

public class Song {

	/*
	~ 멜론을 만들자! ~
		필드 : 제목, 가수명, 장르, 가사, 곡 길이
		
		메소드
		- 각각의 값을 지정하는 것(제목바꾸기 같이)
		- 모든 정보 표시
		
		class SongExam
		- 3곡 이상의 노래를 등록해서 관리
	*/
	
	String title;
	String name;
	String genre;
	String gasa;
	String time;
	
	String title(String t) {
//		System.out.println(t);
		title = t;
		return title;
	}
	
	String name(String t) {
//		System.out.println(t);
		name = t;
		return name;
	}
	
	String genre(String t) {
//		System.out.println(t);
		genre = t;
		return genre;
	}
	
	String gasa(String t) {
//		System.out.println(t);
		gasa = t;
		return gasa;
	}
	
	String time(String t) {
//		System.out.println(t);
		time = t;
		return time;
	}
	
	void print() {
		System.out.println(title + ", " + name + ", " + genre + ", " + gasa + ", " + time);
	}
	
}
