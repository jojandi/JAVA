package emp2.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import emp2.dto.EmpDTO;

@WebServlet("/emp")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/emp doGet start!!!");
		
		String Pempno = request.getParameter("empno");
		System.out.println("empno : " + Pempno);
		
		String Pename = request.getParameter("ename");
		System.out.println("empno : " + Pename);
		
		try {
			// DB에서 emp2 조회하기
			
			// # DB 접속
			// JNDI 방식으로 Servers 폴더의 context.xml 중 Resource 태그(노드)를 가져옴
			// DB 정보가 있고 그것으로 DataSource(커넥션 풀)를 만듦
			Context ctx = new InitialContext();
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			// 커넥션 풀에서 접속 정보 가져오기
			Connection con = dataFactory.getConnection();
		  
			String query = null;
			PreparedStatement ps = null;
			
			// # SQL 준비
			if(Pempno != null && Pename != null) {
				query = "select * from emp2 where empno = ? and ename = ?";
				ps = con.prepareStatement(query); // 컴파일
				ps.setString(1, Pempno);
				ps.setString(2, Pename);
			} else if(Pename != null){
				query = "select * from emp2 where ename = ?";
				ps = con.prepareStatement(query); // 컴파일
				ps.setString(1, Pename);
			} else if(Pempno != null){
				query = "select * from emp2 where empno = ?";
				ps = con.prepareStatement(query); // 컴파일
				ps.setString(1, Pempno);
			} else {
				query = "select * from emp2";
				ps = con.prepareStatement(query); // 컴파일
			}
		
			
			// # SQL 실행 및 결과 확보
			// ResultSet : select문 조회 결과 전체, 테이블 느낌
			ResultSet rs = ps.executeQuery();
			
			// # 결과 활용
			// 한 줄씩 DTO에 넣기 -> 그 DTO를 list에 넣기

			List<EmpDTO> list = new ArrayList<EmpDTO>();
			// next : 다음 줄이 있다면 true, 없다면 false
			// 다음 줄이 있으면 rs는 다음줄 덩어리 : tanle의 tr 한 줄, 1차원 배열
			while (rs.next()){
				EmpDTO dto = new EmpDTO();
				
								
				int empno = rs.getInt("empno"); // emp 컬럼의 값을 int로 형변환해서 가져옴
				dto.setEmpno(empno);
				
				
				String ename = rs.getString("ename"); 
				dto.setEname(ename);
				
				dto.setJob(rs.getString("job"));
				
				java.sql.Date hireDate = rs.getDate("hireDate");
				dto.setHireDate(hireDate);
				
				dto.setMgr(rs.getInt("mgr"));
				dto.setSal(rs.getInt("sal"));
				dto.setComm(rs.getInt("comm"));
				dto.setDeptno(rs.getInt("deptno"));
				
//				System.out.println("dto : " + dto);
				
				list.add(dto);
			}
			// 브라우저에서 서버로 요청한 모든 정보가 있음
			// setAttribute : 서버에 태워 보낼 정보
//			System.out.println(list);
			request.setAttribute("list", list);
			
			// jsp로 이동
			// forward 방식은 request도 전달해줌 -> setAttribute 쓰는 이유
			request.getRequestDispatcher("/WEB-INF/views/empList.jsp").forward(request, response);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/emp doPost start!!!");
	}

}
