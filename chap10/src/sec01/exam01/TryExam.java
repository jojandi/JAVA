package sec01.exam01;

public class TryExam {

	public static void main(String[] args) {
		

		// 실행예외 : 실행되기 전까지 에러가 나는지 모르는 오류들 //
		// 예외 : 실행하면서, 실행 되는 도중에 오류 나는 것들
		// 예외는 처리 가능
		// 에러는 처리 불가능
		// 자바에선 예외와 오류를 구분한다
		
		// 잘 모르겠으면 그냥 전체를 try로 감싸버리자!!
		try {
			
			// 에러가 발생할 수도 있는 코드
			
			String s1 = null;
//			System.out.println(s1.length()); //NullPointerException
			System.out.println(s1);
			
			int[] a = new int[2];
//			a[100] = 3; //ArrayIndexOutOfBoundsException
			
			
			String s2 = "20";
			int age = 0;
			age = Integer.parseInt(s2); // NumberFormatException
			System.out.println(age + 1);	

			
			System.out.println("-----------------------------------------");
			ThrowsTest tt = new ThrowsTest();
//			tt.throwException();
			
			tt.human(3);
			
		} catch (HumanException he) { // HumanException 예외가 발생했을 때 아래 내용 실행
			
			System.out.println("-----------------------------------------");
			String message = he.getMessage();	
			
			if("EC05".equals(message)) {
				System.out.println("5 미만을 입력하셨습니다. 확인해주세요.");
			} else if("EC10".equals(message)) {
				System.out.println(" 10 초과를 입력하셨습니다. 확인해주세요.");
			}
			
			
		} catch (Exception e) { // Exception(모든 예외의 부모) e(변수명)
			// 예외 발생 시 아래의 코드 실행
			// catch 안에 내용이 없다면 예외가 있는지 없는지 모름
			// 그러니 적어도 e.printStackTrace();은 써주자
			
			System.out.println("-----------------------------------------");
			System.out.println("오류발생");
			System.out.println(e); // ex) java.lang.NumberFormatException: For input string: "20a"
			System.out.println("=========================================");
			
			e.printStackTrace(); // 에러 내용 전체 출력, 이거는 꼭 출력하자!!!!!!
			
			System.out.println("=========================================");
			System.out.println(e.getMessage()); // 에러 내용만 출력 (ex) For input string: "20a")
			System.out.println("-----------------------------------------");
			
		}
		
		System.out.println("완료");
		
		
	}

}
