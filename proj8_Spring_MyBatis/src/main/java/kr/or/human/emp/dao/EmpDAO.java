package kr.or.human.emp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.or.human.emp.dto.EmpDTO;

// 메소드 이름과 SQL id가 같으면 해당 SQL문 실행
// mapper tag의 name을 DAO 인터페이스의 패키지.클래스명으로 지정
@Mapper
public interface EmpDAO {
	
	List<EmpDTO> selectEmp();
	
	EmpDTO selectOneEmp(EmpDTO empDTO);
	
	int insertEmp(EmpDTO empDTO);
	
	int updateEmp(EmpDTO empDTO);
	
	int deleteEmp(EmpDTO empDTO);

}
