package exam;

public class Song_ver2 {

	// 제목, 가수명, 장르, 가사, 곡 길이
	private String title;
	private String name;
	private String genre;
	private String gasa;
	private int time;
	
	/**
	title getter 
		title 값 가져오기
		
		@param X
		@return String
	*/ 
	public String getTitle() {
		return this.title;
	}
	
	/**
	title setter 
		title 값 변경하기
		
		@param 제목 -> String
		@return void
	*/
	public void setTitle(String title) {
		this.title = title;
	}

	
	/**
	name getter 
		name 값 가져오기
		
		@param X
		@return String
	*/ 
	public String getName() {
		return name;
	}

	/**
	name setter 
		name 값 변경하기
		
		@param 가수명 -> String
		@return void
	*/
	public void setName(String name) {
		this.name = name;
	}

	
	/**
	genre getter 
		genre 값 가져오기
		
		@param X
		@return String
	*/ 
	public String getGenre() {
		return genre;
	}

	/**
	genre setter 
		genre 값 변경하기
		
		@param 장르 -> String
		@return void
	*/
	public void setGenre(String genre) {
		this.genre = genre;
	}

	
	/**
	gasa getter 
		gasa 값 가져오기
		
		@param X
		@return String
	*/ 
	public String getGasa() {
		return gasa;
	}
	
	/**
	gasa setter 
		gasa 값 변경하기
		
		@param 가사 -> String
		@return void
	*/
	public void setGasa(String gasa) {
		this.gasa = gasa;
	}

	
	/**
	time getter 
		time 값 가져오기
		
		@param X
		@return int
	*/ 
	public int getTime() {
		return time;
	}

	/**
	time setter 
		time 값 변경하기
		
		@param 곡 길이 -> String
		@return void
	*/
	public void setTime(int time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Song_ver2 [제목 : " + title + " | 가수 : " + name + 
				" | 장르 : " + genre + " | 가사 : " + gasa + " | 곡 길이 : " + time + "초 ]";
	}

	
}
