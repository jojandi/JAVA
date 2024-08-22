package emp2.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import emp2.dao.EmpDAO;
import emp2.dto.EmpDTO;

public class EmpService {
	
	public List getEmp(String Pempno, String Pename) {
		return new EmpDAO().selectEmp(Pempno, Pename);
	}

	public Map getPage(String countPerPage, String page) {
		
		int count = Integer.parseInt(countPerPage);
		int pageNo = Integer.parseInt(page);
		
		// 시작 번호 : 이전 페이지까지 보여준 것 바로 다음 것
		int start = ((pageNo - 1) * count) + 1;
		// 마지막 번호
		int end = start + count - 1;
		
		EmpDAO dao = new EmpDAO();
		List list = dao.selectPage(start, end);
		
		int totalCount = dao.totalPage();
		
		Map map = new HashMap();
		map.put("list", list);
		map.put("totalCount", totalCount);
		
		return map;
	}
	
	public List read(String Pempno) {
		return new EmpDAO().read(Pempno);
	}
	
	public int insert(EmpDTO dto) {
		return new EmpDAO().insert(dto);
	}
	
	public int update(EmpDTO dto) {
		return new EmpDAO().update(dto);
	}
	
	public int delete(EmpDTO dto) {
		return new EmpDAO().delete(dto);
	}
	
}
