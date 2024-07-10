package food;

public class FoodExam {

	public static void main(String[] args) {

		제육 f1 = new 제육();
		f1.setSpricy("매운맛");

		
		f1.order(10000);
		f1.order(5000);
		f1.cook();
		
		초밥 f2 = new 초밥();
		f2.setSeaFood("광어");
		f2.order(10000);
		f2.cook();
		
	}

}
