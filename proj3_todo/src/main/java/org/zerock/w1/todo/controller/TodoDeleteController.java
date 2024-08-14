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

@WebServlet("/todo/delete")
public class TodoDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/delete toPost 실행");
		
		// 파라미터에서 tno값 가져오기
		int tno = Integer.parseInt(request.getParameter("tno"));
		
		// DTO의 tno에 파라미터에서 가져온 tno 넣어주기
		TodoDTO dto = new TodoDTO();
		dto.setTno(tno);
		
		// service의 delete메소드 실행
		Todoservice service = new Todoservice();
		int result = service.delete(dto);
		System.out.println("삭제 개수 : " + result);
		
		// 실행 후 list.jsp로 이동
		response.sendRedirect("list");
	}

}
