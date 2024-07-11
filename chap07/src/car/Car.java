package car;

public class Car {

	// 부모 클래스
	
	String name; // 차 종류
	int speed; // 최대속도
	int gas; // 기름양 
	int max; // 최대 기름양
	boolean isOn; // 시동 여부
	
	/**
	 * setSpeed
	 * 
	 * 전달인자 int speed
	 * 리턴타입 int speed의 1/10
	*/
	int setSpeed(int speed) {
		return speed / 10;
	}
	
	/**
	 * setGas
	 * 
	 * 전달인자 int gas
	 * 리턴타입 int gas의 1/10
	 */
	int setGas(int gas) {
		return gas / 10;
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
			System.out.println("\n" + this.name + "(이)의 시동을 끕니다. \n");
		} else {
			System.out.println("\n" + this.name + "(이)의 이미 시동이 껴져있습니다. \n");
		}
	}
	
	
	/**
	 * 정지 메소드
	 * 
	 * 시동을 끄고 "정지합니다" 출력
	 * 
	 * 전달인자 : X
	 * 리턴타입 : X
	*/
	void stop() {
		System.out.println("\n정지!");
		off();
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
	void drive(int m, int speed) {
		while(this.isOn) {
			if(this.speed >= speed) { // 최대 속도보다 작거나 같을 때 출발 가능
				System.out.println("==============================");
				System.out.println("출발!");
				System.out.println(m + "m 앞에 목적지가 있습니다. ");
				System.out.println("현재 기름양 : " + this.gas);
				
				int cnt = 0; // 이동한 거리
				
				for(int i = 0; i < m; i += setSpeed(speed)) {
					System.out.println("------------------------------");
					System.out.println("시속 : " + speed + "km");

					cnt += setSpeed(speed); // 속도에 따라 이동거리 조절
					int a = m - cnt; // 남은 거리
					
					this.gas -= setSpeed(speed); // 속도에 따라 기름의 양 조절
					
					System.out.println(a + "m 앞에 목적지가 있습니다. ");
					System.out.println("\n현재 기름양 : " + this.gas);
					
					if(gas <= 0 && a > 0) {
						System.out.println("\n주유가 필요합니다. ");
						stop();
						System.out.println("------------------------------");
						break;
					} 
				}
				
				System.out.println("------------------------------");
				System.out.println("목적지에 도착했습니다. ");
				break;
			} else {
				System.out.println("최대 속도를 초과했습니다. ");
				System.out.println(this.name + "의 최대 속도는 " + this.speed + "입니다. ");
			}
		}	
	}
	
	/**
	 * 주유 메소드
	 * 
	 * this.gas가 this.max보다 같거나 크면 주유하지 못 하게함
	 * 전달인자를 받아서 /10 만큼씩 주유함
	 * 주유하다가 max값 이상이 되면 "더이상 주유할 수 없습니다" 출력
	 * 
	 * 전달인자 : int 얼마나 넣을지
	 * 리턴타입 : x
	*/
	void in(int gas) {
		System.out.println("==============================");
		if(!isOn) {
			if(this.gas != this.max) { 

				System.out.println("현재 기름양 : " + this.gas);
				System.out.println("투입양 : " + gas);
				System.out.println("\n주유를 시작합니다. ");
				
				for(int i= 1; i <= gas; i += setGas(gas)) {
					// int a = this.gas;
					// 	this.gas 대신 실험체로써 주유하다 max값 이상이 되면 
					// 	this.gas += setGas(gas)을 못 하게 함
					int a = this.gas; 
					a += setGas(gas);
					
					System.out.println("------------------------------");
					System.out.println("주유중... \n");
					if(a <= this.max) {
						this.gas += setGas(gas);
					} else if(a >= max) {
						this.gas = max;
						int gasA = gas - this.gas;
						gas = gas - gasA;
					} else {
						System.out.println("더이상 주유할 수 없습니다. ");					
					}
					System.out.println("현재 기름양 : " + this.gas);
				}
				
				System.out.println("------------------------------");
				System.out.println("주유가 완료되었습니다. ");
				System.out.println("최종 투입양 : " + gas);
				System.out.println("현재 기름양 : " + this.gas);
				
			} else {
				System.out.println("더이상 주유할 수 없습니다. ");
				System.out.println("현재 기름양 : " + this.gas);
			}
			System.out.println("==============================");
		} else {
			System.out.println("시동이 켜져있습니다. ");
			System.out.println("시동을 꺼주세요. ");
		}
		
	}
	
	
	
}
