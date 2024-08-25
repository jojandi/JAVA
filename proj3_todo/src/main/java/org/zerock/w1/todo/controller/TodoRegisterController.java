package org.zerock.w1.todo.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zerock.w1.todo.dto.TodoDTO;
import org.zerock.w1.todo.service.Todoservice;

/**
 * Servlet implementation class TodoRegisterController
 */
@WebServlet("/todo/register")
public class TodoRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/register toGet 실행");
		
		request.getRequestDispatcher("/WEB-INF/todo/register.jsp").forward(request, response);
	}

	// register에서 submit 했을 때
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/register toPost 실행");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8;");
		
		// 파라미터 값 가져오기
		String title = request.getParameter("text");
		String dueDate = request.getParameter("dueDate");
		String finished = request.getParameter("finished");
		
		// 가져온 값 DTO에 넣기
		TodoDTO dto = new TodoDTO();
		dto.setTitle(title);
		dto.setDueDate(LocalDate.parse(dueDate));
		if("N".equals(finished)) {
			dto.setFinished(false);
		} else {
			dto.setFinished(true);			
		}
		
		System.out.println(dto);
		
		// DB의 insert 실행
		Todoservice service = new Todoservice();
		int result = service.register(dto);
		System.out.println("insert 결과 : " + result);
		
		String contextPath = request.getContextPath();
		response.sendRedirect( contextPath + "/todo/list");
	}

}
