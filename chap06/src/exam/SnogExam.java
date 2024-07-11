package exam;

import java.util.ArrayList;

public class SnogExam {

	public static void main(String[] args) {

		Song s1 = new Song();
		
		s1.title("제목");
		s1.name("가수명");
		s1.genre("장르");
		s1.gasa("가사");
		s1.time("곡 길이");
		
		s1.print();
		
		Song s2 = new Song();
		
		s2.title("제목!!");
		s2.name("가수명!!");
		s2.genre("장르!!");
		s2.gasa("가사!!");
		s2.time("곡 길이!!");
		
		s2.print();
		
		Song s3 = new Song();
		
		s3.title("제목~");
		s3.name("가수명~");
		s3.genre("장르~");
		s3.gasa("가사~");
		s3.time("곡 길이~");
		
		s3.print();
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=");
		ArrayList list = new ArrayList();
		
		Song_ver2 sv21 = new Song_ver2();
		
		sv21.setTitle("Supernova");
		sv21.setName("aespa");
		sv21.setGenre("K-pop");
		sv21.setGasa("가사~~");
		sv21.setTime(193);
//		System.out.println(sv21);
		list.add(sv21);
		
		Song_ver2 sv22 = new Song_ver2();
		
		sv22.setTitle("愛が灯る");
		sv22.setName("ロクデナシ");
		sv22.setGenre("J-pop");
		sv22.setGasa("가사~~");
		sv22.setTime(200);
//		System.out.println(sv22);
		list.add(sv22);
		
		Song_ver2 sv23 = new Song_ver2();
		
		sv23.setTitle("천상연");
		sv23.setName("이창섭");
		sv23.setGenre("발라드");
		sv23.setGasa("가사~~");
		sv23.setTime(275);
//		System.out.println(sv23);
		list.add(sv23);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}
