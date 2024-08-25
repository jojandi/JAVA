package org.zerock.w1.cookie;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie/set")
public class SetCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
	    response.setContentType("text/html; charset=utf-8;");
	    
	    Cookie c = new Cookie("name", "value"); // key, value -> 쿠키 생성
	    c.setMaxAge(10); // 초단위, 쿠키가 얼마나 살아있을지
//	    c.setMaxAge(24 * 60 * 60); // 하루짜리 쿠키
	    response.addCookie(c); // 브라우저가 쿠키를 가지고 감
	    
	    Cookie c2 = new Cookie("name2", "value2");
	    // 세션쿠키 : 만료일이 없는 쿠키
	    // setMaxAge를 설정하지 않거나
	    // 음수를 넣어서 만든다
	    // 이러면 브라우저 메모리에만 저장
	    // 브라우저의 모든 탭을 끄면 사라짐
	    c.setMaxAge(-1); // 음수로 설정하면 세션쿠키라고 부름, 만료일 없음, 모든 탭을 꺼야지 사라짐
	    response.addCookie(c2);
	    
	    String value = "안보여줌";
	    value = URLEncoder.encode(value, "utf-8"); // 한글 안 깨지게 하기
	    Cookie c3 = new Cookie("name3", value); // key, value -> 쿠키 생성
	    response.addCookie(c3); // 브라우저가 쿠키를 가지고 감
	}

}
