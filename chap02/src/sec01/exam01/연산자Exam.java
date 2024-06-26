package sec01.exam01;

public class 연산자Exam {

	public static void main(String[] args) {

		int a = 10;
//		a = 11;
//		a = 10 + 1;
		int b = a + 1;
		
		a++;
		++a;
		// = a += 1;
		// = a = a + 1;
		
		a =10;
		a++;	//a = a + 1 = 11
		System.out.println("a : "+ a);
		
		a -= 2;
		// = a = a - 2;
		
		a--;
		--a;
		// = a -= 1;
		
		a =10;
		a--;	//a = a - 1 = 9
		System.out.println("a : "+ a);	//a = 9
		System.out.println("a : "+ ++a);	//a = 10
		System.out.println("a : "+ a++);	//a = 10, 실행 후 a = 11
		System.out.println("a : "+ a);	//a = 11
		// ++a : 실행 전 +1
		// a++ : 실행 후 +1
		
		// a = 11
		System.out.println(a++ + ++a);
		// 11 + 13
		// a++ = 11
		// 이후 +연산자를 넘어가면 a = 12
		// ++a = 13
		
		a = 11;
		int result = a;	// a
		a = a + 1;		// ++
		a = a + 1;		// ++
		result = result + a;
		System.out.println("result : "+ result);
		
		
		boolean c = true;
		System.out.println("c : "+ c);	// true
		c = !c;
		System.out.println("!c : "+ c);	// false
		
		
		double d = 7.0;		// int에는 7.0 못 들어감
		System.out.println(d / 3);
//		System.out.println(3 / 0);
		// 나누기 0
		// -> double일 때는 Infinity
		// -> int일 때는 오류(bay zero)
		
		
		int f = 10;
		int p = 5;
		System.out.println("몫 : "+ (f / p));
		System.out.println("나머지 : "+ (f % p));
		// + 때문에 연산이 제대로 안 될 수 있음
		// 연산할 부분만 () 사용
		System.out.println("-----------------------");
		
		int money = 10000;
		int coffee = 4500;
		System.out.println(money / coffee + "잔");
		System.out.println("잔돈 : "+ money % coffee);
		System.out.println("-----------------------");
		
		int hong = 5000;
		int lip = 10000;
		double sale = 0.85;
		System.out.println("꿀홍차 15% 세일 : "+ hong * sale);
		System.out.println("꿀홍차 + 립스틱 15% 세일 : "+ (hong + lip) * sale);
		System.out.println("-----------------------");
		
		int have = 7234;
		int ooo1 = 5000;
		int ooo2 = 1000;
		int ooo3 = 500;
		int ooo4 = 100;
		int ooo5 = 50;
		int ooo6 = 10;
		int ooo7 = 1;
		
		int o1 = have / ooo1; // 1
		int oo1 = ooo1 * o1;	// 1 * 5000
		
		int o2 = (have - oo1) / 1000; // 2
		int oo2 = oo1 + o2 * ooo2; // 5000 + 2000
		
		int o3 = (have - oo2) / ooo3;	//0
		
		int o4 = (have - oo2) / ooo4;	//2
		int oo4 = oo2 + o4 * ooo4;	// 7000 + 200
		
		int o5 = (have - oo4) / ooo5;	//0
		
		int o6 = (have - oo4) / ooo6;	//3
		int oo6 = oo4 + o6 * ooo6;	// 7200 + 30
		
		int o7 = (have - oo6) / ooo7;	//4
		int oo7 = oo6 + o7 * ooo7;	// 7230 + 4

		System.out.println("5000원 : "+ o1 +"장");
		System.out.println("1000원 : "+ o2 +"장");
		System.out.println("500원 : "+ o3 +"개");
		System.out.println("100원 : "+ o4 +"개");
		System.out.println("50원 : "+ o5 +"개");
		System.out.println("10원 : "+ o6 +"개");
		System.out.println("1원 : "+ o7 +"개");
		System.out.println("-----------------------");
		
		// 더 간단한 방법
		int money1 = 7234;
		System.out.println("5000원 : "+ money1/5000);	//1
		money1 = money1 % 5000;	//2234
		System.out.println("1000원 : "+ money1/1000);	//2
		money1 = money1 % 1000;	//234
		System.out.println("500원 : "+ money1/500);	//0
		money1 = money1 % 500;	//234
		System.out.println("100원 : "+ money1/100);	//2
		money1 = money1 % 100;	//34
		System.out.println("50원 : "+ money1/50);	//0
		money1 = money1 % 50;	//34
		System.out.println("10원 : "+ money1/10);	//3
		money1 = money1 % 10;	//4
		System.out.println("1원 : "+ money1/1);	//4
		System.out.println("-----------------------");
		
		
		String left = "수박";
		String right = "멜론";
		
		String one = left;
		left = right;
		right = one;
		// swap
		
		System.out.println(left);
		System.out.println(right);
		System.out.println("-----------------------");
		
		
		System.out.println(3 > 5);
		boolean bool =3 > 5;	// 비교연산자는 boolean에 넣을 수 있음
		System.out.println(bool);
		System.out.println(0.1 == 0.1f);
		// 타입이 다름 => 제대로 된 결과가 나오지 못 할 수 있음
		// => 같은 타입으로 변경해서 비교
		System.out.println((float)0.1 == 0.1f);
		
		String str1 = "조민정";
		String str2 = "조민정";
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		// 글씨 비교는 == 사용 X, 의미가 달라지기 때문
		// => 정확한 결과값 X
		// String 변수나 ""에 .equals(비교할 것) 사용
		
//		System.out.println("3 == 3 : "+ 3 == 3);
		System.out.println("3 == 3 : "+ (3 == 3));
		// ()안에서 비교해야함 => 우선순위 때문
		
		System.out.println(10 | 3);
		// 비트 연산자 -> 2진수로 변환하여 연산
		System.out.println("-----------------------");

		
		int i1 = 7;
		int i2 = 15;
		int i3 = 7;
		System.out.println("i3이 가장 큰 값인가?"
							+ (i3 >= i1 && i3 >= i2) );
		boolean i4 = i3 > i2;
		System.out.println(i4 ? "i3이 크다" : "i3이 같거나 작다" );
		// 삼항 연산자 => 조건 ? 조건이 참일시 : 조건이 거짓일시
		System.out.println("-----------------------");
		
		
		int var1 = 5;
		int var2 = 2;
		double var3 = var1 / var2;	// 5/2 = 2.5
		int var4 = (int) (var3 * var2);	// 2 * 2 = 4
		// double =2.5인 var3를 int로 형변환을 하여 값이 2.5에서 2가 됨
		System.out.println(var4);
		
		
		// 356 -> 300으로 만들기(뒤에 두 자리 날리기)
		int value = 356;
		System.out.println(value - (value % 100));
		// % 300 -> 숫자를 바꾸면 사용 불가 => % 100 사용
		
		//다른 방법, 보편적임
		int value1 = 356;
		System.out.println(value1 / 100 * 100);
	}

}
