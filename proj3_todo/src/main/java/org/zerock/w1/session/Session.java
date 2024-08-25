package org.zerock.w1.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Session")
public class Session extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 세션 가져오기
		// 기존 세션이 없으면 새로 생성해줌
		HttpSession session = request.getSession(); 

		// 기존 세션이 없으면 null, 있다면 가져옴
		// 로그인 여부를 알아야할 때 사용 ( ex. null 일 시 로그인 페이지로 이동 )
//		HttpSession session = request.getSession(false); 
		
		// 세션에 가져오는 법
		String value = (String)session.getAttribute("key"); // key가 없으면 null
		System.out.println("value : " + value); 
		String level = (String)session.getAttribute("level"); // key가 없으면 null
		System.out.println("level : " + level); 
		
		// isNew : 세션이 처음 생성된 건지 여부 (true/false)
		// 관리하고 있는 JSESSIONID가 아닌 경우 응답으로 JSESSIONID를 줌 (이때 true가 됨)
		System.out.println("session.isNew() : " + session.isNew());
		
		// getLastAccessedTime : 이전에 마지막으로 접속했던 시간
		System.out.println("session.getLastAccessedTime() : " + session.getLastAccessedTime());
		
		// 로그인 여부
		if("admin".equals(request.getParameter("id"))) {
			session.setAttribute("isLogon", true); // 로그인 여부 판별에 이용
			session.setAttribute("level", "관리자");
		}
		
		// 세션에 넣는 법
		session.setAttribute("key", "value");
	}

}
