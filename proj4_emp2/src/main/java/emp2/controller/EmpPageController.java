package emp2.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp2.service.EmpService;


@WebServlet("/emp/page")
public class EmpPageController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("emp page 실행!!");
		
		String countPerPage = request.getParameter("countPerPage"); // 한 페이지 당 몇 개
		String page = request.getParameter("page"); // 현재 페이지
		
		// 기본값 설정
		if(countPerPage == null) countPerPage = "10";
		if(page == null) page = "1";
		
		
		
		EmpService service = new EmpService();
		Map map = service.getPage(countPerPage, page);
		
		request.setAttribute("map", map);
		request.setAttribute("countPerPage", countPerPage);
		request.setAttribute("page", page);
		
		request.getRequestDispatcher("/WEB-INF/views/empPageList.jsp").forward(request, response);
	}

}
