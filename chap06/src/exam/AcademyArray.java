package exam;

public class AcademyArray {
	
	String aname; // 학원 이름
	Student[] ss = new Student[10]; // 학생 배열
	int cnt = 0;
	
	/**
	생성자
		학원 이름을 설정해주지 않으면 실행되지 않게 함
		전달인자 : 학원 이름 -> String
	*/
	AcademyArray(String an){
		aname = an;
		System.out.println("학원 이름 : " + aname);
		System.out.println("-------------------------------------------------------------");
	}
	
	/**
	join(학원생)을 하면 Students 배열에 들어가게 하기!
		전달인자 : 학생 그 자체 -> Student
		
		cnt값에 따라 배열에 넣어줌
		
		for문 사용 시(더 복잡)
			- cnt = 0 -> i = 0 -> 0번 index에 학생이 들어감
				이후 i++ 해서 for문 탈출, cnt++ 해서 다음 index에 들어갈 준비
			
			- cnt++ 가 for문 밖에 있는 이유
				i값과 cnt값을 같게 설정한 후 for문을 돌려주는 것이기 때문에 값이 무한으로 들어감
				단, 배열의 크기가 10이라 그 이상이면 오류 남
	*/
	void join(Student s) {
		// 선생님이 더 간단하게 만들어주신 코드
		
		ss[cnt] = s;
		System.out.println(ss[cnt].name + " 님을 명단에 추가합니다. ");
	
		cnt++;
		
		// 기존 내 코드
//		for(int i = cnt; i == cnt; i++) {
//			ss[i] = s;
//			System.out.println(ss[i].name + " 님을 명단에 추가합니다. ");
////			System.out.println("i : " + i + ", cnt : " + cnt);
//		}
//
//		cnt++;
		
//		// 선생님 방식1
//		for(int i = 0; i < ss.length; i++) {
//			if(ss[i] == null) {
//				ss[i] = s;
//				break;
//			}
//		}
//		
//		// 선생님 방식2
//		if(cnt < ss.length) {
//			// ss[cnt] = s;
//			// cnt++
//			ss[cnt++] = s;
//		}
	}
	
	
	/**
	등록된 학원생들의 이름과 나이 출력
		ss[i] = Student 클래스, .name, .age를 활용하여 이름과 나이만 출력 가능!!
		
		i < cnt 사용 이유
			i < ss.lenth 를 사용하면 학원생이 10명 이하일 때 남은 자리는 null으로 출력
			추가된 학생들만 출력하기 위해 cnt 사용
			( cnt : 학생을 넣을 떄마다 ++ -> 학생수를 카운트하는 역할도 있음 )
	*/
	void viewList() {
		// 내 방식으로 null 안 나오게
		for(int i = 0; i < cnt; i++) {
			System.out.println(ss[i].name + "(" + ss[i].age + ")");
		}
		// 선생님 방식으로 null 안 나오게
//		for(int i = 0; i < ss.length; i++) {
//			if(ss[i] != null) {
//				System.out.println(ss[i].name + "(" + ss[i].age + ")");				
//			}
//		}
	}
	
	/**
	student 메소드
		학생 한 명만 뽑아오기!
		
		전달인자 : 배열의 인덱스 -> int
		리턴타입 : Student
	*/
	Student student(int index) {
		return ss[index];
	}
	
}
