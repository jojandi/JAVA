package emp2.service;

import java.util.List;

import emp2.dao.EmpDAO;
import emp2.dto.EmpDTO;

public class EmpService {

	public List getEmp(String Pempno, String Pename) {
		return new EmpDAO().selectEmp(Pempno, Pename);
	}
	
	public List read(String Pename) {
		return new EmpDAO().read(Pename);
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
