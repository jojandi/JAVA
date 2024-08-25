package org.zerock.w1.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/*")
public class CheckFilter implements Filter {

	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// 서블릿 실행 전 처리
		System.out.println("doFilter 실행 전");
		
		long before = System.currentTimeMillis();
		
		// 한글 관련
		request.setCharacterEncoding("utf-8");
	    
	    // Filter의 doFilter에서의 전달인자는 우리가 사용했던 
	    // HttpServlet의 부모형태로 캐스팅한 변수를 사용하고 있어서
	    // 필요한 메소드 사용을 위해 다시 자식 형태로 변환
	    HttpServletRequest req = (HttpServletRequest)request;
	    HttpServletResponse resp = (HttpServletResponse)response;

	    System.out.println( "getServletPath : " + req.getServletPath() );
	    
	    
	    if(isExclude(req.getServletPath())) {
	    	System.out.println("세션 없이 진행");
	    	
	    	// 주소에 /assets가 포함되지 않았을 경우 HTML 한글 깨짐 방지
	    	if(req.getServletPath().indexOf("/assets/") == -1) {	    		
	    		response.setContentType("text/html; charset=utf-8;");
	    	}
	    	chain.doFilter(request, response);
	    } else {
	    	// 세션을 점검
	    	HttpSession session = req.getSession();
			Boolean isLogon = (Boolean)session.getAttribute("isLogon");
			
	    	// 로그인 되어있는 경우에만 통과
			if(isLogon != null && isLogon == true) {
				System.out.println("로그인 되어있음!");
		    	chain.doFilter(request, response);
	    	} else {
	    		System.out.println("로그인 안 되어있음...");
				resp.sendRedirect(req.getContextPath() + "/Session");
			}
	    }
	    	
		// 서블릿 실행 후 처리
		System.out.println("---------------------------------------------");
		System.out.println("doFilter 실행 후");
		long after = System.currentTimeMillis();
		System.out.println("걸린 시간 : " + (after - before));
		System.out.println("---------------------------------------------");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("필터 init 실행");
	}

	private boolean isExclude(String servletPath) {
		// 로그인 없어도 되는 페이지
		if("/login".equals(servletPath) 
			|| "/logout".equals(servletPath) 
			|| ! "/Session/mypage".equals(servletPath)) {
			return true;
		} else { // 로그인 있어야하는 페이지
			return false;
		}
	}
	
}
