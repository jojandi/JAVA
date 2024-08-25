package org.zerock.w1.calc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Forward")
public class ForwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("forward doGet start");
		
		String text = request.getParameter("text");
		System.out.println("text : " + text);
		System.out.println("---------------------------");
		
		request.getRequestDispatcher("Another").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("forward doPost start");
		
		String text = request.getParameter("text");
		System.out.println("text : " + text);
		System.out.println("---------------------------");
		
		request.getRequestDispatcher("Another").forward(request, response);
	}
}
