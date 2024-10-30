package mobalie.talking.gamja.dao.user;

import org.apache.ibatis.annotations.Mapper;

import mobalie.talking.gamja.dto.user.UserDTO;

@Mapper //MyBatis에서 해당 인터페이스가 데이터베이스 쿼리 작업을 수행할 수 있도록 
			//설정해주는 애너테이션

public interface LoginDAO {
//	List<LoginDTO> selectTbl_user(LoginDTO loginDTO);

	// UserDTO를 받아 UserDTO를 조회하여 반환하는 역할 
	UserDTO selectLoginUser(UserDTO userDTO);
	
	UserDTO selectLoginAdmin(UserDTO userDTO);
	UserDTO selectLoginMes(UserDTO userDTO);
	
	}

