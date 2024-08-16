package emp2.service;

import java.util.List;

import emp2.dao.EmpDAO;

public class EmpService {

	public List getEmp(String Pempno, String Pename) {
		return new EmpDAO().selectEmp(Pempno, Pename);
	}
	
}
