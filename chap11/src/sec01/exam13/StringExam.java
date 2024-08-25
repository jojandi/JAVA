package sec01.exam13;

public class StringExam {

	public static void main(String[] args) {

		String s1 = "영일이삼사오육칠팔구";
		System.out.println(s1);
		
		char c = s1.charAt(3);
		System.out.println("charAt : " + c); // 삼, 해당 index의 문자
		
		int i = s1.length();
		System.out.println("length : " + i); // 10, 해당 문자열의 길이
		
		int i2 = s1.indexOf("이");
		System.out.println("indexOf : " + i2); // 2, 해당 문자의 index 위치를 알려줌
		System.out.println("indexOf 없는 것 : " + s1.indexOf("아")); // -1, 일치하는 게 없다면 -1
		
		i2 = s1.indexOf("사오");
		System.out.println("indexOf(사오)" + i2); // 4, 첫번째  index 나옴, 정확하게 일치하는 게 없다면 -1
		
		
		// 블로그 주소인지 아닌지 판별하기
		String blog = "blog.naver.com";
		String cafe = "cafe.naver.com";
		
		if(blog.indexOf("blog") != -1) {
			System.out.println("블로그 주소");
		} else {
			System.out.println("블로그 주소 아님");
		}
		
		if(cafe.indexOf("blog") != -1) {
			System.out.println("블로그 주소");
		} else {
			System.out.println("블로그 주소 아님");
		}
		
		System.out.println("---------------------------------------------------------");
		
		// 메일 주소 형식이 맞는지 판별하기
		// @ 와  .이 있는지
		
		String email = "mg220518@gmail.com";
		String notEmail = "mg220518";
		
		if(email.indexOf("@") != -1 && email.indexOf(".") != -1) {
			System.out.println("이메일 주소를 입력 받았습니다. ");
		}else{
			System.out.println("정확한 이메일 주소를 입력해주세요. ");
		}
		
		if(notEmail.indexOf("@") != -1 && notEmail.indexOf(".") != -1) {
			System.out.println("이메일 주소를 입력 받았습니다. ");
		}else{
			System.out.println("정확한 이메일 주소를 입력해주세요. ");
		}
		
		
		// indexOf 구현해보기
		char c3 = 'g';
		boolean flag = false; // 값이 없다면 false
		
		for(int j = 0; j < email.length(); j++) {
			char c2 = email.charAt(j); // j만큼 꺼내서 비교하기
			if(c2 == c3) {
				flag = true; // 값이 있다면 true
				System.out.println(j); 
				break;
			} 
		}
		// indexOf에서 없는 값일 때
		if(!flag) {
			System.out.println(-1);
		}
		
		
		// replace : 첫번째 전달인자를 두번째 전달인자로 "모두" 바꿔줌
		String s2 = s1.replace("삼사", "34");
		System.out.println("replace 전 : " + s1);	// 영일이삼사오육칠팔구, 원본을 해치지 않음
		System.out.println("replace 후 : " + s2);	// 영일이34오육칠팔구
		
		String s3 = "123123123";
		System.out.println( s3.replace("12", "다른글씨") ); // 다른글씨3다른글씨3다른글씨3
		
		
		// substring : 첫번째 인덱스부터 두번째 인덱스 바로 앞가지 추출
		// 전달인자가 하나인 경우 끝까지 추출
		String s4 = s1.substring(1, 4);
		System.out.println("substring(1, 4) : " + s4); // 일이삼
		
		String ssn = "210312-3123123";
		String s5 = ssn.substring(7, 8);
		if(s5.equals("1") || s5.equals("3")) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
		// substring 안 쓰고 3 추출하기
		int ssni = ssn.indexOf("-") + 1;
		char ssnc = ssn.charAt(ssni);
		System.out.println(ssni); // 7
		System.out.println(ssnc); //3
		
		System.out.println(ssn.substring(7));
//		System.out.println(ssn.substring(7, 100)); // StringIndexOutOfBounds 에러
		
		
		// trim : 앞 뒤 공백 제거, 가운데 공백은 제거 X
		String oldStr = "      글씨    중간띄어쓰기     ";
		System.out.println("[" + oldStr.trim() + "]"); // 글씨    중간띄어쓰기
		
		
		String id = "    ";
		String trim_id = id.trim();
		if(id.length() == 0) {
			System.out.println("아이디를 입력해주세요");
		}
		
		
		// split : 정규표현식으로 글씨를 잘라서 배열로 만들어준다. 
		// 정규표현식이 아닌 걸로 자르려면 \\. or [.]
		String menu = "돼지국밥,마라탕,제육,냉면";
		String[] menus = menu.split(","); 
		for(String m : menus) {
			System.out.println(m);
		}
		
		String[] urls = blog.split(".");
		System.out.println(urls.length); // 0 (3이 나와야하는데 .은 특수문자라 split 안 댐)
		urls = blog.split("[.]");
		System.out.println(urls.length); // 3
		System.out.println(urls[1]); // naver
		
		System.out.println("------------------------------------------------------------");
		String search = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EC%9D%B4%EC%BC%80%EC%95%84";
		int si = search.indexOf("?") + 1;
		search = search.substring(si);
		System.out.println(search);

		String[] params = search.split("&");
		for(int j = 0; j < params.length; j++) {
			System.out.println(params[j].replace("=", ":"));
			
			String key = params[j].split("=")[0];
			String value = params[j].split("=")[1];
			
			System.out.println("key : " + key + ", value : " + value );
			System.out.println("------------------------------------------------------------");			
		}
		
		// contains 구현
		String ccc = "red big px";
		String target = "big";
		
		String[] c2 = ccc.split(" ");
		boolean isTarget = false;
		for(int j = 0; j < c2.length; j++) {
			
			if(c2[j].equals(target)) {
				isTarget = true;
				break;
			}
			
		}
		if(isTarget) {
			System.out.println("클래스가 있습니다. ");
		} else {
			System.out.println("클래스가 없습니다. ");
		}
		
		
		
	}

}
