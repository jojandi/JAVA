package org.zerock.w1.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Session/mypage")
public class MyPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
	    response.setContentType("text/html; charset=utf-8;");
		
		HttpSession session = request.getSession();
//		Boolean isLogon = (Boolean)session.getAttribute("isLogon");
//		
//		if(isLogon == null) {
//			response.sendRedirect(request.getContextPath() + "/cookie.jsp");
//		}
		
		response.getWriter().println("마이페이지 진입 성공! <br> ");
		response.getWriter().println("당신은 " + session.getAttribute("level") + "입니다. ");
	}

}
