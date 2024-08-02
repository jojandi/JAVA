package sec01.exam01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputExam {

	public static void main(String[] args) {
		
		String path = "c:\\temp";
		String fileName = "test.txt";
		
		OutputStream os = null;
		
		try {
			// 스트림 열기
			os = new FileOutputStream(path + "\\" + fileName);
			
			String data = "abc\n한글\n123";
			byte[] datas = data.getBytes(); // String 을 byte 배열로 바꾸는 법
			
			// 쓰기
			os.write(datas);
			// 다 보내지 못한 것들 보내기
			os.flush();
			// 스트림 닫기
//			os.close();  -> 쓰다가 오류 발생하면 close를 못하기 때문에 finally에 빼줌
			
			
		} catch (FileNotFoundException e) {
			// 스트림 여는 과정에서 문제 생겼을 때
			e.printStackTrace();
			
		} catch (IOException e) {
			// 쓰는 과정에서 문제 생겼을 때
			e.printStackTrace();
			
		} finally {
			
			if(os != null) {				
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		
		// try-with-resources
		// 괄호 안에 AutoClosable 인터페이스를 구현한 클래스를 선언하면 알아서 close() 실행해줌
		// try의 새로운 용법 -> 자동으로 close 해줌
		try(OutputStream os2 = new FileOutputStream(path + "\\" + fileName);){
			
			String data = "abc\n한글\n123";
			byte[] datas = data.getBytes(); // String 을 byte 배열로 바꾸는 법
			
			// 쓰기
			os2.write(datas);
			// 다 보내지 못한 것들 보내기
			os2.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
