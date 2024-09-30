package human.class1.ajax.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import human.class1.ajax.dto.EmpDTO;

@Mapper
public interface EmpDAO {

	List<EmpDTO> selectEmp();
	
	EmpDTO selectOneEmp(EmpDTO empDTO);
	
	int insertEmp(EmpDTO empDTO);
	
	int updateEmp(EmpDTO empDTO);
	
	int deleteEmp(EmpDTO empDTO);
	
	
}
