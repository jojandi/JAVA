package food;

public class 제육 extends Food {

	제육(){
//		System.out.println("제육 생성자 실행");
		this.name = "제육볶음";
		this.price = 8000;
		this.recipe = "돼지고기 앞다리";
		this.type = "한식";
		
	}
	
	/**
	 * setSpricy 메소드
	 * 
	 * this.name에 맵기 정도 추가
	 * 
	 * 전달인자 : String 맵기정도
	 * 리턴타입 : 없음
	*/
	void setSpricy(String spicy) {
		this.name += "(" + spicy + ")";  
	}
	
	
	/**
	 * override eat 메소드
	 * 
	 * 내가 추가하고 싶은 출력문 + 부모의 eat();
	*/
	@Override
	void eat() {
		System.out.println("갓 지은 밥과 함께 " + this.name + "을 상추에 싸서");
		super.eat();
	}

}
