package org.zerock.w1.todo.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zerock.w1.todo.dto.TodoDTO;

@WebServlet("/DB")
public class DbOneController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("DB toGet start");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8;");
		
		// driver : 중간자 역할, 서로 다른 것들이 소통할 수 있게 ( 자바언어 -> 오라클언어 )
		String driver = "oracle.jdbc.driver.OracleDriver"; // 오라클 로딩
        String url = "jdbc:oracle:thin:@125.181.132.133:51521:xe"; // 오라클 연결 @ IP : SID
        String user = "scott2_4"; // id
        String password = "tiger"; // pw
        
        // DB 갔다 오는 시간 측정
        long start = System.currentTimeMillis();
        
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
        	
        	List<TodoDTO> list = new ArrayList<TodoDTO>();
        	// 결과 활용
        	// rs.next() : 다음 줄이 있는가?, 한 줄씩 가져옴
        	while(rs.next()) {
        		// 전달인자를 컬럼명을 적고 그 내용을 형변환해서 가져옴
        		int ton = rs.getInt("tno");
        		String title = rs.getString("title");
        		// SQL date 사용
        		LocalDate dueDate = rs.getDate("duedate").toLocalDate();
        		String finished = rs.getString("finished");
        		
        		// DTO 값 넣기
        		TodoDTO dto = new TodoDTO();
        		dto.setTno(ton);
        		dto.setTitle(title);
        		dto.setDueDate(dueDate);
        		dto.setFinished( finished.equals("Y") ? true : false);
        		
        		// list에 DTO 값들 넣어주기
        		list.add(dto);
        	}
        	
        	// jsp
        	for(int i = 0; i < list.size(); i++) {
        		TodoDTO dto2 = list.get(i);
        		
        		response.getWriter().println
        		(dto2.getTno() + " | " + dto2.getTitle() + " | " + dto2.getDueDate() + " | " + dto2.isFinished() + "<hr>");
        	}
        	
        	// 오라클 가는 문 닫기
        	rs.close();
        	ps.close();
        	con.close();
        	
        } catch(Exception e) {
        	e.printStackTrace();
        }
        
        long end = System.currentTimeMillis();
        System.out.println("걸린 시간 : " + (end - start));
        
	}

}
