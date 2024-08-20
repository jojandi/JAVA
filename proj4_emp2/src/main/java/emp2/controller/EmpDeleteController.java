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

@WebServlet("/emp/delete")
public class EmpDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("delete toPost 실행!");
		
		String Pename = request.getParameter("ename");
		System.out.println("ename : " + Pename);

		EmpDTO dto = new EmpDTO();
		dto.setEname(Pename);
		
		EmpService service = new EmpService();
		int result = service.delete(dto);
		
		System.out.println("delete 결과 : " + result);
		
		String contextPath = request.getContextPath();
		response.sendRedirect( contextPath + "/emp/get");
	}

}
