package sec01.exam01;

public class VarTypeExam {

	public static void main(String[] args) {
		
		byte b = 127;
//		b = 128; -> byte는 -128 ~ 127까지만 저장 가능
		
		char c = 97;
		System.out.println(c);
		c = 97 + 5;		//아스키 코드 -> f
		c = 'c' + 5;	//c 다음에 5번째 -> h
		System.out.println(c);
		char c1 = 'a';	//문자 하나만 저장하는 용도, ''로 감싼다

		long balance = 3000000000L;	
		//명확하게 long으로 지정하려면 숫자 뒤에 l 또는 L을 붙여줌
		
		// \n : 줄바꿈 , \t : tap 효과
		String s = "문\t자\n열";	//String에서 S는 대문자!!
		System.out.println(s);
		
		
		boolean car = false;
		int smart = 2;
		String name ="조민정";
		float var = 3.3f;
		float var5 = var * 5;
		System.out.println(var5);
	}
}
