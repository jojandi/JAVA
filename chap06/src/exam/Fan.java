package exam;

public class Fan {
	
	// 선풍기
	// 전원 상태 저장 -> boolean 사용해보자
	
	// 전원 켜기
	// 전원 끄기
	// 전원이 켜졌다! -> 약풍, 강풍
	
	boolean energy;
	
	boolean on () {
		System.out.println("전원이 커졌습니다. ");
		energy = true;
		return energy;
	}
	boolean off () {
		System.out.println("전원이 꺼졌습니다. ");
		energy = false;
		return energy;
	}
	
	void bt1 () {
		if(energy) {
			System.out.println("약풍!");
		} else {
			System.out.println("전원이 꺼져있습니다. ");
		}
	}
	void bt2 () {
		if(energy) {
			System.out.println("강풍!");
		} else {
			System.out.println("전원이 꺼져있습니다. ");
		}
	}
	
}
