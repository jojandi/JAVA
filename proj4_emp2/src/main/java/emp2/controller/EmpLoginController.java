package emp2.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import emp2.dto.EmpDTO;
import emp2.service.EmpService;

@WebServlet("/login")
public class EmpLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// id와 pw를 받아서 DB 조회 후 회원이라면 list 페이지로 아니라면 로그인 페이지로
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("login doGet 실행");
		try {			
			String ename = request.getParameter("id");
			String empno = request.getParameter("pw");
			
			EmpDTO dto = new EmpDTO();
			dto.setEname(ename);
			dto.setEmpno(Integer.parseInt(empno));
			
			EmpService service = new EmpService();
			EmpDTO result = service.loginCheck(dto);
			
			// 세션에 결과 넣기
			if(result != null) { // 결과가 null이 아니라면 세션에 넣고 list 페이지로
				HttpSession session = request.getSession();
				session.setAttribute("loginDTO", result);
				
				System.out.println("로그인 성공");
				response.sendRedirect(request.getContextPath() + "/emp/get");
			} else { // 결과가 null이라면 login페이지로
				System.out.println("로그인 실패");
				response.sendRedirect(request.getContextPath() + "/login.jsp?code=LO01");				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
