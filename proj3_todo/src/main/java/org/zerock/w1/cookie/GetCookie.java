package org.zerock.w1.cookie;

import java.io.IOException;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie/get")
public class GetCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
	    response.setContentType("text/html; charset=utf-8;");
		
	    // 쿠키가 없다면 null
	    Cookie[] cookies = request.getCookies();
	    
	    boolean isShow = true;
	    if(cookies != null) {
	    	for(int i = 0; i < cookies.length; i++) {
	    		Cookie c = cookies[i];
	    		
	    		String name = c.getName(); // 쿠키 name 가져오기
	    		String value = c.getValue(); // 쿠키 value 가져오기
	    		
	    		System.out.println("name : " + name + ", value : " + value);
	    		
	    		if("name3".equals(name)) {
	    			String str = URLDecoder.decode(value);
	    			if("안보여줌".equals(str)) {
	    				isShow=false;
	    			}
	    		}
	    		
	    	}
	    }
	    
	    if(isShow) {	    	
	    	response.getWriter().println("<div style='border: 1px solid red;'>");
	    	response.getWriter().println("팝업!");
	    	response.getWriter().println("</div>");
	    }
	}

}
