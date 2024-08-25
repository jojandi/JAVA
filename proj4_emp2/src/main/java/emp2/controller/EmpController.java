package emp2.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp2.service.EmpService;


@WebServlet("/emp/get")
public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("emp 나눈거 실행!!");
		
		String Pempno = request.getParameter("empno");
		System.out.println("empno : " + Pempno);
		
		String Pename = request.getParameter("ename");
		System.out.println("ename : " + Pename);
		
		EmpService service = new EmpService();
		List list = service.getEmp(Pempno, Pename);
		
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("/WEB-INF/views/empList.jsp").forward(request, response);
	}

}
