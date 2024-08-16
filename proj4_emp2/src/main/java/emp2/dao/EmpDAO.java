package emp2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import emp2.dto.EmpDTO;

public class EmpDAO {

	public List selectEmp(String Pempno, String Pename) {
		List list = new ArrayList();
		
		try {
			Context ctx = new InitialContext();
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			// 커넥션 풀에서 접속 정보 가져오기
			Connection con = dataFactory.getConnection();
		  
			String query = null;
			PreparedStatement ps = null;
			
			// # SQL 준비
			if(Pempno != null && Pename != null) {
				query = "select * from emp2 where empno = ? or ename = ?";
				ps = con.prepareStatement(query); // 컴파일
				ps.setString(1, Pempno);
				ps.setString(2, Pename);
				System.out.println("실행!");
			} else if(Pename != null){
				query = "select * from emp2 where ename = ?";
				ps = con.prepareStatement(query); // 컴파일
				ps.setString(1, Pename);
				System.out.println("ename 실행!");
			} else if(Pempno != null){
				query = "select * from emp2 where empno = ?";
				ps = con.prepareStatement(query); // 컴파일
				ps.setString(1, Pempno);
				System.out.println("empno 실행!");
			} else {
				query = "select * from emp2";
				ps = con.prepareStatement(query); // 컴파일
				System.out.println("모든것 실행!");
			}
			ResultSet rs = ps.executeQuery();

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
				
				list.add(dto);
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
