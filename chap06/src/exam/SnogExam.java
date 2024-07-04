package exam;

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
	}

}
