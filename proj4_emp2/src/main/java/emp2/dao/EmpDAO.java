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
	
	public List selectPage(int start, int end) {
		List list = new ArrayList();
		
		try {
			Context ctx = new InitialContext();
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			// 커넥션 풀에서 접속 정보 가져오기
			Connection con = dataFactory.getConnection();
		  
			// # SQL 준비
			String query =  " select * ";
            query += " from ( ";
            query += " select rownum as rnum, empno, ename, job, deptno ";
            query += " from ( ";
            query += " select empno, ename, job, deptno ";
            query += " from emp2 ";
//            query += " order by ename ";
            query += " ) ";
            query += " ) ";
            query += " where rnum >= ? and rnum <= ?";
            PreparedStatement ps = new LoggableStatement(con, query);
			ps.setInt(1, start);
			ps.setInt(2, end);
			
			System.out.println(((LoggableStatement)ps).getQueryString()); // 실행문 출력
			
			ResultSet rs = ps.executeQuery();

			while (rs.next()){
				EmpDTO dto = new EmpDTO();
								
				int empno = rs.getInt("empno"); // emp 컬럼의 값을 int로 형변환해서 가져옴
				dto.setEmpno(empno);
				
				String ename = rs.getString("ename"); 
				dto.setEname(ename);
				
				dto.setJob(rs.getString("job"));
				
//				java.sql.Date hireDate = rs.getDate("hireDate");
//				dto.setHireDate(hireDate);
				
//				dto.setMgr(rs.getInt("mgr"));
//				dto.setSal(rs.getInt("sal"));
//				dto.setComm(rs.getInt("comm"));
				dto.setDeptno(rs.getInt("deptno"));
				dto.setRnum(rs.getInt("rnum"));
				
				list.add(dto);
			}
			ps.close();
			con.close();
			rs.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public int totalPage() {
		int result = -1;
		
		try {
			Context ctx = new InitialContext();
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			// 커넥션 풀에서 접속 정보 가져오기
			Connection con = dataFactory.getConnection();
		  
			// # SQL 준비
			String query =  " select count(*) cnt from emp2";

            PreparedStatement ps = new LoggableStatement(con, query);
			
			System.out.println(((LoggableStatement)ps).getQueryString()); // 실행문 출력
			
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {				
				result = rs.getInt("cnt");
			}
			
			ps.close();
			con.close();
			rs.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
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
			if(Pempno == "" && Pename == "") {
				query = "select * from emp2";
				ps = con.prepareStatement(query); // 컴파일
				System.out.println("모든것 실행!");
			}
			else if(Pempno != null && Pename != null) {
				query = "select * from emp2 ";
				query += "where lower(empno) like lower('%'||?||'%') and lower(ename) like lower('%'||?||'%')";
				ps = con.prepareStatement(query); // 컴파일
				ps.setString(1, Pempno);
				ps.setString(2, Pename);
				System.out.println("실행!");
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
			ps.close();
			con.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List read(String Pempno) {
		List list = new ArrayList();
		
		try {
			Context ctx = new InitialContext();
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			// 커넥션 풀에서 접속 정보 가져오기
			Connection con = dataFactory.getConnection();
		  
			
			// # SQL 준비
			
			String query = "select * from emp2 where empno = ?";
			PreparedStatement ps = con.prepareStatement(query); // 컴파일
			ps.setString(1, Pempno);
				
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
			ps.close();
			con.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public int insert(EmpDTO dto) {
		int result = -1;
		try {			
			Context ctx = new InitialContext();
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			// 커넥션 풀에서 접속 정보 가져오기
			Connection con = dataFactory.getConnection();
			String query = "insert into emp2 (empno, ename, job, mgr, hiredate, sal, comm, deptno) ";
			query += "values (?, ?, ?, ?, ?, ?, ?, ?) ";
			
//			PreparedStatement ps = con.prepareStatement(query);
			// 원래 실행되는 것을 LoggableStatement가 가져가서 이후 최종 실행문 출력 가능
			PreparedStatement ps = new LoggableStatement(con, query);
			ps.setInt(1, dto.getEmpno());
			ps.setString(2, dto.getEname());
			ps.setString(3, dto.getJob());
			ps.setInt(4, dto.getMgr());
			ps.setDate(5, dto.getHireDate());
			ps.setInt(6, dto.getSal());
			ps.setInt(7, dto.getComm());
			ps.setInt(8, dto.getDeptno());
			
			System.out.println(((LoggableStatement)ps).getQueryString()); // 실행문 출력
			
			result = ps.executeUpdate(); // 몇 줄이 업데이트 되었는지 int로 받음
			
			ps.close();
			con.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int update(EmpDTO dto) {
		int result = -1;
		try {			
			Context ctx = new InitialContext();
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			// 커넥션 풀에서 접속 정보 가져오기
			Connection con = dataFactory.getConnection();
			String query = "update emp2 set ";
			query += "ename = ?, job = ?, mgr = ?, hiredate = ?, sal = ?, comm = ?, deptno =? ";
			query += "where empno = ? ";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, dto.getEname());
			ps.setString(2, dto.getJob());
			ps.setInt(3, dto.getMgr());
			ps.setDate(4, dto.getHireDate());
			ps.setInt(5, dto.getSal());
			ps.setInt(6, dto.getComm());
			ps.setInt(7, dto.getDeptno());
			ps.setInt(8, dto.getEmpno());
			
			result = ps.executeUpdate(); // 몇 줄이 업데이트 되었는지 int로 받음
			
			ps.close();
			con.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int delete(EmpDTO dto) {
		int result = -1;
		try {			
			Context ctx = new InitialContext();
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			// 커넥션 풀에서 접속 정보 가져오기
			Connection con = dataFactory.getConnection();
			String query = "delete emp2 ";
			query += "where ename = ?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, dto.getEname());

			result = ps.executeUpdate(); // 몇 줄이 업데이트 되었는지 int로 받음
			
			ps.close();
			con.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
