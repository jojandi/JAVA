package emp2.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp2.dto.EmpDTO;
import emp2.service.EmpService;

@WebServlet("/emp/insert")
public class EmpInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("insert toGet 실행!");
		
		request.getRequestDispatcher("/WEB-INF/views/empInsert.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("insert toPost 실행!");
		request.setCharacterEncoding("utf-8");
	    response.setContentType("text/html; charset=utf-8;");
		
		String empno = request.getParameter("empno");
		String ename = request.getParameter("ename");
		String job = request.getParameter("job");
		String mgr = request.getParameter("mgr");
		String hireDate = request.getParameter("hireDate");
		String sal = request.getParameter("sal");		
		String comm = request.getParameter("comm");
		String deptno = request.getParameter("deptno");
		System.out.println
		("empno : " + empno + ", ename : " + ename + ", job : " + job + ", mar : " + mgr 
				+ ", hireDate : " + hireDate + ", sal : " + sal + ", comm : " + comm + ", deptno :" + deptno);
		
		EmpDTO dto = new EmpDTO();
		dto.setEmpno(Integer.parseInt(empno));
		dto.setEname(ename);
		dto.setJob(job);
		dto.setMgr(Integer.parseInt(mgr));
		dto.setHireDate(Date.valueOf(hireDate));
		dto.setSal(Integer.parseInt(sal));
		if(comm == "") {
			comm = null;
		}
		dto.setComm(Integer.parseInt(comm));
		dto.setDeptno(Integer.parseInt(deptno));
		
		System.out.println(dto);
		
		EmpService service = new EmpService();
		int result = service.insert(dto);
		System.out.println("insert 결과 : " + result);
		
		String contextPath = request.getContextPath();
		response.sendRedirect( contextPath + "/emp/get");
	}

}
