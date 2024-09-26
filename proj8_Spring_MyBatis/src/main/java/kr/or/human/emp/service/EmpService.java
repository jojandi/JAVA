package kr.or.human.emp.service;

import java.util.List;

import kr.or.human.emp.dto.EmpDTO;

public interface EmpService {
	
	List<EmpDTO> listEmp();
	
	EmpDTO oneEmp(EmpDTO empDTO);
	
	int joinEmp(EmpDTO empDTO);
	
	int editEmp(EmpDTO empDTO);
	
	int delEmp(EmpDTO empDTO);

}
