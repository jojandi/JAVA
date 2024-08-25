package emp2.controller;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp2.dto.EmpDTO;
import emp2.service.EmpService;

@WebServlet("/emp/update")
public class EmpUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("update toGet 실행!");
		
		String Pename = request.getParameter("ename");
		System.out.println("empno : " + Pename);
		
		EmpService service = new EmpService();
		List list = service.read(Pename);
		
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("/WEB-INF/views/empUpdate.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("update toPost 실행!");
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
		
		EmpDTO dto = new EmpDTO();
		dto.setEmpno(Integer.parseInt(empno));
		dto.setEname(ename);
		dto.setJob(job);
		dto.setMgr(Integer.parseInt(mgr));
		dto.setHireDate(Date.valueOf(hireDate));
		dto.setSal(Integer.parseInt(sal));
		dto.setComm(Integer.parseInt(comm));
		dto.setDeptno(Integer.parseInt(deptno));
		
		System.out.println(dto);
		
		EmpService service = new EmpService();
		int result = service.update(dto);
		System.out.println("update 결과 : " + result);
		
		String contextPath = request.getContextPath();
		response.sendRedirect( contextPath + "/emp/get");
	}

}
