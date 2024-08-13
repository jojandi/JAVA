package org.zerock.w1.todo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zerock.w1.todo.dto.TodoDTO;


@WebServlet("/one")
public class TodoOneController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/one doGet 실행");
		
		request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8;");
		
		// 글씨를 담아서 브라우저에 보냄
		PrintWriter out = response.getWriter();
		out.println("<h1>h");
		out.print("e");
		out.append("ll");
		out.write("o</h1>");
		
		// 브라우저에서 보낸 파라미터를 받음
		String id = request.getParameter("id");
		System.out.println("id : " + id);
		String pw = request.getParameter("pw");
		System.out.println("pw : " + pw);
		
		out.println("<h2>id : " + id + ", pw : " + pw + "</h2>");
		out.println("<hr>");
		
		// DTO를 이용해서 todo 만들기 ( service 역할 )
		List<TodoDTO> list = new ArrayList<TodoDTO>();
		for(int i = 1; i <=10; i++) {
			
			TodoDTO dto1 = new TodoDTO();
			
			dto1.setTno(i);
			dto1.setTitle("할 일 " + i);
			dto1.setDueDate(LocalDate.now());
			// 조건에 만족하면 finished가 true -> true된 것은 checked할 것
			if(i % 3 == 0) {
				dto1.setFinished(true);
			}
			
			list.add(dto1);
		}
		
		// todo 브라우저에 출력하기 ( jsp 역할 )
		for(int i = 0; i < list.size(); i++) {
			// list를 TodoDTO 타입에 넣음
			TodoDTO dto2 = list.get(i);
			
			out.println("<div>");
			out.println(dto2.getTno() + " | ");
			out.println("<input type='checkbox' ");	
			if(dto2.isFinished()) {				
				out.println("checked='checked' ");
			} 
			out.println("> | ");
			out.println(dto2.getTitle() + " | ");
			out.println(dto2.getDueDate());
			out.println("</div>");
		}
		
	}

}
