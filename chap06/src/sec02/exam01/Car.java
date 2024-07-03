package sec02.exam01;

// 그냥 class는 파일명이랑 달라도 됨
class Tire {
	
}
// public 이 붙은 class는 파일명과 클래스명이 같아야함
public class Car {
	
	/* 
	~ 필드 ~
	 : 클래스 안에서 공통으로 사용할 변수 선언이 가능한 곳
	 	- 변수 선언과 동시에 초기화 가능
	 	- 따로 변수의 값을 변경(실행)하는 것은 불가능
	*/
	// 변수 선언과 동시에 초기화
	String model = "임팔라";
	
	
	// 변수 선언만 한 것
	// => int일 경우 0, boolean인 것은 false, 참조타입일 경우 null로 초기화 됨
	int speed;
	// speed 변수의 값을 60으로 바꾸는 것을 실행
	// 필드 영역에선 실행(동작) 불가능
//	speed = 60;

}
