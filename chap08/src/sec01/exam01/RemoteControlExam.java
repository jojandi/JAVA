package sec01.exam01;

import java.util.ArrayList;
import java.util.List;

public class RemoteControlExam {

	public static void main(String[] args) {

		// 인터페이스 : 부모클래스 라고 생각하면 됨
		// 부모여야 의미가 생기는 객체
		
		RemoteControl rTv = new Tv();
		
		Tv tv = new Tv();
		Audio audio = new Audio();
	
		tv.turnOn();
		rTv.turnOn();
		audio.turnOff();

		audio.setVoulume(15);
		audio.setVoulume(-5);
		tv.setVoulume(8);
		
		// RemoteControl 타입이기 때문에 rTv자체는 voulume을 가지고 있지 않음
		// 다만 setVoulume 메소드가 실행될 때 Tv클래스의 메소드를 오버라이드하여
		// 그 안에 있는 this.voulume을 사용
		// 그렇기 때문애 Tv 클래스에 있는 voulume을 사용할 수 있음
		rTv.setVoulume(7);
		
		// List : 인터페이스 -> new 불가
		List list = new ArrayList();
	
	}

}
