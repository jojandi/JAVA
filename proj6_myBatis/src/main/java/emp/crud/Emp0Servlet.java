package emp.crud;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/emp0")
public class Emp0Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("emp0 toGet Start");
		
		String cmd = request.getParameter("cmd");
		
		if(cmd == null) {
			// 검색어
			String type = request.getParameter("searchType");
			String keyword = request.getParameter("keyword");
			String[] checks = request.getParameterValues("check");
			String orderType = request.getParameter("orderType");
			
			System.out.println("keyword : " + keyword);
			System.out.println("searchType : " + type);
			System.out.println("orderType : " + orderType);
			
			EmpDTO dto = new EmpDTO();
			dto.setKeyword(keyword);
			dto.setSearchType(type);
			dto.setChecks(checks);
			dto.setOrderType(orderType);
			
			// 전체 목록 조회 및 검색
			EmpDAO dao = new EmpDAO();
			List<EmpDTO> list = dao.selectEmp(dto);
			System.out.println("List : " + list);
			request.setAttribute("list", list);
			request.setAttribute("keyword", keyword);
			request.setAttribute("searchType", type);
			request.setAttribute("orderType", orderType);
			
			request.getRequestDispatcher("/WEB-INF/views/emp.jsp").forward(request, response);
			
		} else if("join".equals(cmd)) {
			request.setAttribute("cmd", "join");
			request.getRequestDispatcher("/WEB-INF/views/empJoin.jsp").forward(request, response);
		} else if("edit".equals(cmd)) {
			int empno = Integer.parseInt(request.getParameter("empno"));
			System.out.println("empno : " + empno);
			
			EmpDAO dao = new EmpDAO();
			EmpDTO dto = dao.selectEmpno(empno);
			System.out.println("dto : " + dto);
			request.setAttribute("dto", dto);
			request.setAttribute("cmd", "edit");
			
			request.getRequestDispatcher("/WEB-INF/views/empJoin.jsp").forward(request, response);
		} 
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("emp0 doPost Start");
		
		String cmd = request.getParameter("cmd");
		
		if(cmd == null) {
			String strEmpno = request.getParameter("empno");
			String enme = request.getParameter("ename");
			String strHireDate = request.getParameter("hireDate");
			
			try {
				int empno = Integer.parseInt(strEmpno);
				Date hireDate = Date.valueOf(strHireDate);
				
				EmpDTO dto = new EmpDTO();
				dto.setEmpno(empno);
				dto.setEname(enme);
				dto.setHireDate(hireDate);
				
				EmpDAO dao = new EmpDAO();
				int result = dao.insertEmp(dto);
				
				System.out.println("insert : " + result);
				
				response.sendRedirect("emp0");
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		} else if("edit".equals(cmd)) {
			String strEmpno = request.getParameter("empno");
			String enme = request.getParameter("ename");
			String strHireDate = request.getParameter("hireDate");
			System.out.println("hireDate : " + strHireDate);
			
			try {
				int empno = Integer.parseInt(strEmpno);
				Date hireDate = Date.valueOf(strHireDate);
				
				EmpDTO dto = new EmpDTO();
				dto.setEmpno(empno);
				dto.setEname(enme);
				dto.setHireDate(hireDate);
				
				EmpDAO dao = new EmpDAO();
				int result = dao.updateEmp(dto);
				
				System.out.println("update : " + result);
				
				response.sendRedirect("emp0");
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		} else if("del".equals(cmd)) {
			String strEmpno = request.getParameter("empno");
			
			try {
				int empno = Integer.parseInt(strEmpno);
				
				EmpDAO dao = new EmpDAO();
				int result = dao.deleteEmp(empno);
				
				System.out.println("delete : " + result);
				
				response.sendRedirect("emp0");
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("emp0 doPut Start");
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("emp0 doDelete Start");
	}

}
