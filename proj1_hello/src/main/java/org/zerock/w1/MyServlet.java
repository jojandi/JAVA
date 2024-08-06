package org.zerock.w1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// webServlet의 전달인자 글씨로 주소가 연결됨
// 1. 전달인자로 urlPatterns={"주소1", "주소2"} 로 적기
// 2. 책 28p처럼 다른 요소 넣기
// 주소 하나만 쓴다면 모두 생략 가능
@WebServlet("/my")
public class MyServlet extends HttpServlet {
	// 없어도 됨
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	// 생성자 : 거의 안 씀
    public MyServlet() {
        // 부모 생성자
    	super();
    	
    	System.out.println("생성자 실행");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() 실행");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	// get 방식으로 요청한 경우 doGet 매소드를 Tomcat이 실행시켜줌
	// 우리는 doGet을 override해서 원한는 알고리즘을 수행할 수 있음
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() 실행");
		// 전달인자 HttpServletRequest : 요청에 관련된 모든 내용
		// 전달인자 HttpServletResponse : 응답에 관련된 모든 내용을 넣어주면 브라우저까지 전달
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// java를 통해 html, css, javasctipt 사용하기
		PrintWriter out = response.getWriter();
		out.println("<h1>");
		out.print("hello servlet");
		out.println("</h1>");
		
		out.println("<hr>");
		for(int i = 0; i < 10; i++) {
			out.println(i + "<br>");			
		}
		
	}

}
