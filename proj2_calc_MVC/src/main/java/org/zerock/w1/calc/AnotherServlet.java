package org.zerock.w1.calc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Another")
public class AnotherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청 내용의 한글 깨짐 방지
		request.setCharacterEncoding("UTF-8");
		// 응답 내용의 한글 깨짐 방지
		response.setContentType("text/html; charset=UTF-8;");
		
		System.out.println("another doGet start");
		
		String text = request.getParameter("text");
		System.out.println("text : " + text);
		System.out.println("---------------------------");
		
		response.getWriter().println("한글");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청 내용의 한글 깨짐 방지
		request.setCharacterEncoding("UTF-8");
		// 응답 내용의 한글 깨짐 방지
		response.setContentType("text/html; charset=UTF-8;");
		
		System.out.println("another doPost start");
		
		String text = request.getParameter("text");
		System.out.println("text : " + text);
		System.out.println("---------------------------");
	}

}
