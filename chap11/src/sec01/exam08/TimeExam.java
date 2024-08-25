package sec01.exam08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeExam {

	public static void main(String[] args) {

		// timestamp
		// unix time
		long time = System.currentTimeMillis();
		System.out.println(time);
		
		for(int i = 0; i < 1000000000; i++) {
			
		}
		// i가 10억번 도는 데 걸리는 시간
		// 지금 시간 - time(for문 전에 저장한 시간)
		System.out.println(System.currentTimeMillis() - time);
		

		Date date = new Date();
		System.out.println(date);
		
		String format = "yyyy년 MM월 dd일 HH:mm:ss.SSS";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String strDate = sdf.format(date);
		System.out.println(strDate);
		
		
	}

}
