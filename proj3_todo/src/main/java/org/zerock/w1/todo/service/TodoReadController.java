package org.zerock.w1.todo.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zerock.w1.todo.dto.TodoDTO;

@WebServlet("/todo/read")
public class TodoReadController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/read doGet start");
		
		int tno = Integer.parseInt(request.getParameter("tno"));
		
		Todoservice service = new Todoservice();
		TodoDTO dto = service.get(tno); // 상세페이지 생성
		
		request.setAttribute("dto", dto);
		request.getRequestDispatcher("/WEB-INF/todo/read.jsp").forward(request, response);
		
	}

}
