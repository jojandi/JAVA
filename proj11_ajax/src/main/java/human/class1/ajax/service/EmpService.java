package human.class1.ajax.service;

import java.util.List;

import human.class1.ajax.dto.EmpDTO;

public interface EmpService {

	List<EmpDTO> listEmp();
	
	EmpDTO oneEmp(EmpDTO empDTO);
	
	int joinEmp(EmpDTO empDTO);
	
	int editEmp(EmpDTO empDTO);
	
	int delEmp(EmpDTO empDTO);
	
}
