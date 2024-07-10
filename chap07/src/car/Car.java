package car;

public class Car {

	// 부모 클래스
	
	String name; // 차 종류
	int speed; // 속도
	int gas; // 기름양 
	boolean isOn; // 시동 여부
	
	/**
	 * getSpeed
	 * 
	 * 전달인자 X
	 * 리턴타입 int speed의 1/10
	*/
	int getSpeed() {
		return this.speed / 10;
	}
	
	
	/**
	 * 시동 on
	 * 
	 * 해당 메소드를 실행하면 isOn = true, "시동이 켜졌습니다. " 출력
	 * 
	 * 전달인자 : X
	 * 리턴타입 : X
	*/
	void on() {
		if(isOn) {
			System.out.println(this.name + "(이)의 이미 시동이 켜져있습니다. ");
		} else {
			isOn = true;
			System.out.println(this.name + "(이)의 시동이 켜졌습니다. ");
		}
	}
	


	/**
	 * 시동 off
	 * 
	 * 해당 메소드를 실행하면 isOn = false, "시동이 끕니다. " 출력
	 * 
	 * 전달인자 : X
	 * 리턴타입 : X
	 */
	void off() {
		if(isOn) {
			isOn = false;
			System.out.println(this.name + "(이)의 시동을 끕니다. ");
		} else {
			System.out.println(this.name + "(이)의 이미 시동이 껴져있습니다. ");
		}
	}
	
	
	/**
	 * 드라이브 메소드
	 * 
	 * 시동이 켜져있을 때 출발
	 * speed에 따라 주행거리(m)가 달라짐
	 * for문에서 증감식을 speed에 따라 차등할 것
	 * 
	 * 전달인자 : int 주행할 거리
	 * 리턴타입 : x
	*/
	void drive(int m) {
		while(this.isOn) {
			System.out.println("==============================");
			System.out.println("출발!");
			System.out.println(m + "m 앞에 목적지가 있습니다. ");
			
			int cnt = 0; // 이동한 거리
			
			for(int i = 0; i < m; i += getSpeed()) {
				System.out.println("------------------------------");
				System.out.println("시속 : " + this.speed + "km");

				cnt += getSpeed(); // 속도에 따라 이동거리 조절
				int a = m - cnt; // 남은 거리
				
				this.gas -= getSpeed(); // 속도에 따라 기름의 양 조절
				
				System.out.println(a + "m 앞에 목적지가 있습니다. ");
				System.out.println("현재 기름양 : " + this.gas);
				
				if(gas <= 0) {
					System.out.println("주유가 필요합니다. ");
					off();
					break;
				} else if(a == 0) {
					off();
					break;
				}
				System.out.println("------------------------------");
				System.out.println("목적지에 도착했습니다. ");
			}
		}
	}
	
	/**
	 * 주유 메소드
	 * 
	 * 단위 : L, 100L가 완충
	 * 
	 * 전달인자 : int 얼마나 넣을지
	 * 리턴타입 : x
	*/
	void in(int gas) {
		if(this.gas != 100) {
			System.out.println("주유를 시작합니다. ");
			this.gas += gas;
			System.out.println("주유양 : " + gas);
			System.out.println("현재 기름양 : " + this.gas);
		}
	}
	
}
