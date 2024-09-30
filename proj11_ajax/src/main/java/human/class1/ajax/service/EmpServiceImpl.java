package human.class1.ajax.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import human.class1.ajax.dao.EmpDAO;
import human.class1.ajax.dto.EmpDTO;

@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired EmpDAO empDAO;

	@Override
	public List<EmpDTO> listEmp() {
		return empDAO.selectEmp();
	}

	@Override
	public EmpDTO oneEmp(EmpDTO empDTO) {
		return empDAO.selectOneEmp(empDTO);
	}

	@Override
	public int joinEmp(EmpDTO empDTO) {
		return empDAO.insertEmp(empDTO);
	}

	@Override
	public int editEmp(EmpDTO empDTO) {
		return empDAO.updateEmp(empDTO);
	}

	@Override
	public int delEmp(EmpDTO empDTO) {
		return empDAO.deleteEmp(empDTO);
	}

}
