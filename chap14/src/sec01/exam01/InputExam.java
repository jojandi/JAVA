package sec01.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputExam {

	public static void main(String[] args) {

		String path = "c:\\temp\\test.txt";
		
		try( InputStream is = new FileInputStream(path) ){
			
			// 내 파일의 내용을 가져올 바가지의 크기 설정
			int BUFFER_SIZE = 1024 * 8;
			// 실질적인 바가지
			byte[] datas = new byte[BUFFER_SIZE];
			
			// 몇 바이트만큼 읽었는지 표시
			int result = 0;
			
			// 실제로 읽은 것에 대한 내용 누적
			String data = "";
			
//			while(result != -1) {
//				// read : 바가지로 읽은 바이트를 돌려줌, 읽을 게 없으면 -1
//				result = is.read(datas);
//				
//				if(result != -1 ) {
//					// 바이트 배열이 String으로 변함, result(읽은 것)만큼만 가져와서 글씨로 바꿔라
//					data += new String(datas, 0, result);	
//					System.out.println(data);
//				}
//			}
			
			// 간단하게 쓰기
			while( (result = is.read(datas)) != -1) {
				data += new String(datas, 0, result);	
			}
			System.out.println("-----------------------");
			System.out.println(data);
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
