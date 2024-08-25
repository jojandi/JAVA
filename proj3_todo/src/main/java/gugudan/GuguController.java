package gugudan;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GuguController
 */
@WebServlet("/gugu/output")
public class GuguController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("구구단 출력 toGet");
		
		int num = Integer.parseInt( request.getParameter("text") );
		
		GuguService service = new GuguService();
		List gugu = service.gugu(num);
		
		request.setAttribute("gugu", gugu);
		request.getRequestDispatcher("/WEB-INF/gugu/gugu.jsp").forward(request, response);
	}

}
