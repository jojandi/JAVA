package org.zerock.w1.todo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.zerock.w1.todo.dto.TodoDTO;

public class TodoDAO {
	
	private Connection getCon() {
		
		Connection con = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver"; // 오라클 로딩
        String url = "jdbc:oracle:thin:@125.181.132.133:51521:xe"; // 오라클 연결 @ IP : SID
        String user = "scott2_4"; // id
        String password = "tiger"; // pw
        
        try {
        	// Class.forName : String을 이용하여 class 생성
        	Class.forName(driver); // 오라클 드라이버 로딩
        	
        	// DB 접속
        	con = DriverManager.getConnection(url, user, password);
        } catch(Exception e) {
        	e.printStackTrace();
        }
        return con;
	}
	
	
	
	public List<TodoDTO> selectAll(){
		List<TodoDTO> list = new ArrayList<TodoDTO>();
		
		// driver : 중간자 역할, 서로 다른 것들이 소통할 수 있게 ( 자바언어 -> 오라클언어 )
		String driver = "oracle.jdbc.driver.OracleDriver"; // 오라클 로딩
        String url = "jdbc:oracle:thin:@125.181.132.133:51521:xe"; // 오라클 연결 @ IP : SID
        String user = "scott2_4"; // id
        String password = "tiger"; // pw
        
        try {
        	// Class.forName : String을 이용하여 class 생성
        	Class.forName(driver); // 오라클 드라이버 로딩
        	
        	// DB 접속
        	Connection con = DriverManager.getConnection(url, user, password);
        	
        	// SQL 준비
        	String query = "select * from tbl_todo";
        	PreparedStatement ps = con.prepareStatement(query); // 오라클 언어로 변경 ( 컴파일 )
        	
        	// SQL 실행 및 결과 확보
        	// ResultSet : 모든 select 결과가 들어 있음
        	ResultSet rs = ps.executeQuery(); 
        	// 실행(executeQuery() -> select 전용, ResultSet 반환)
        	// executeUpdate : select 이외의 모든 것, int 반환(영향 받은 행의 수)
        	
        	
        	// 결과 활용
        	// rs.next() : 다음 줄이 있는가?, 한 줄씩 가져옴
        	while(rs.next()) {
        		// 전달인자를 컬럼명을 적고 그 내용을 형변환해서 가져옴
        		int tno = rs.getInt("tno");
        		String title = rs.getString("title");
        		// SQL date 사용
        		LocalDate dueDate = rs.getDate("duedate").toLocalDate();
        		String finished = rs.getString("finished");
        		
        		// DTO 값 넣기
        		TodoDTO dto = new TodoDTO();
        		dto.setTno(tno);
        		dto.setTitle(title);
        		dto.setDueDate(dueDate);
        		dto.setFinished( finished.equals("Y") ? true : false);
        		
        		// list에 DTO 값들 넣어주기
        		list.add(dto);
        	}

        	// 오라클 가는 문 닫기
        	rs.close();
        	ps.close();
        	con.close();
        	
        } catch(Exception e) {
        	e.printStackTrace();
        }
        return list;
	}
	
	
	
	public TodoDTO selectOne(int tno) {
		// if를 만나지 않았다면 null return
		TodoDTO dto = null;
		
		// DB 접속
		Connection con = getCon();
		if(con==null) return null; // 접속이 잘 되지 않았을 시 null return
		
		try {
			// SQL 준비
			String sql = "select * from tbl_todo where tno = ?";
			PreparedStatement ps = con.prepareStatement(sql); // 오라클 언어로 변경 ( 컴파일 )
			// ?를 값으로 채워줌 (?의 순서, 값)
			// 만약에 글씨라면 setString, 알아서 '로 감싸줌
			ps.setInt(1, tno);
			
			// SQL 실행 및 결과 확보
			ResultSet rs = ps.executeQuery(); 
			
			// 결과 활용
			// DTO 값 넣기
			if(rs.next()) {
				dto = new TodoDTO();
				dto.setTno(rs.getInt("tno"));
				dto.setTitle(rs.getString("title"));
				dto.setDueDate(rs.getDate("duedate").toLocalDate());
				dto.setFinished( rs.getString("finished").equals("Y") ? true : false);
			}
			
			// 오라클 가는 문 닫기
			rs.close();
			ps.close();
			con.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return dto;
	}
	
}
