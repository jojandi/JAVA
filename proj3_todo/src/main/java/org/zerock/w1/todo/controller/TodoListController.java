package org.zerock.w1.todo.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zerock.w1.todo.dto.TodoDTO;
import org.zerock.w1.todo.service.Todoservice;

@WebServlet("/todo/list")
public class TodoListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("/todo/list doGet start");
		
		Todoservice service = new Todoservice();
		List<TodoDTO> todoList = service.getList(); // list 생성
		
		request.setAttribute("list", todoList); // list.jsp에 todoList를 보내기 위해 request에 담음
		
		request.getRequestDispatcher("/WEB-INF/todo/list.jsp").forward(request, response);
		
	}

}
