package emp2.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp2.service.EmpService;


@WebServlet("/emp/read")
public class EmpReadController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("emp read  toGet 실행!!");
		
		String Pempno = request.getParameter("empno");
		System.out.println("empno : " + Pempno);
		
		EmpService service = new EmpService();
		List list = service.read(Pempno);
		
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("/WEB-INF/views/empRead.jsp").forward(request, response);
	}

}
