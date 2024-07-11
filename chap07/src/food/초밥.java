package food;

public class 초밥 extends Food {
	
	초밥(){
//		System.out.println("초밥 생성자 실행");
		
		this.name = "초밥";
		this.price = 10000;
		this.recipe = "연어";
		this.type = "일식";
	}
	
	/**
	 * setSpricy 메소드
	 * 
	 * this.name에 맵기 정도 추가
	 * 
	 * 전달인자 : String 맵기정도
	 * 리턴타입 : 없음
	*/
	void setSeaFood(String seafood) {
		this.recipe = seafood;
		this.name = this.recipe + this.name;  
	}

}
