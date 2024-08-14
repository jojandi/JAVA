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
@WebServlet("/todo/update")
public class TodoUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/update toGet 실행");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8;");
		
		int tno = Integer.parseInt(request.getParameter("tno"));
		
		Todoservice service = new Todoservice();
		TodoDTO dto = service.get(tno); // 상세페이지의 값 가져오기
		
		System.out.println(dto);
		
		// 기존 내용 가지고 가기
		request.setAttribute("dto", dto);
		request.getRequestDispatcher("/WEB-INF/todo/update.jsp").forward(request, response);
	}

	// update에서 submit 했을 때
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/update toPost 실행");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8;");
		
		// 파라미터 값 가져오기
		String tno = request.getParameter("tno");
		String title = request.getParameter("text");
		String dueDate = request.getParameter("dueDate");
		String finished = request.getParameter("finished");
		
		// 가져온 값 DTO에 넣기
		TodoDTO dto = new TodoDTO();
		dto.setTno(Integer.parseInt(tno));
		dto.setTitle(title);
		dto.setDueDate(LocalDate.parse(dueDate));
		if("N".equals(finished)) {
			dto.setFinished(false);
		} else {
			dto.setFinished(true);			
		}
		
		System.out.println(dto);
		
		// DB의 update 실행
		Todoservice service = new Todoservice();
		int result = service.update(dto);
		System.out.println("update 결과 : " + result);
		
		String contextPath = request.getContextPath();
		response.sendRedirect( contextPath + "/todo/list");
	}

}
