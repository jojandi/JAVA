package mobalie.talking.gamja.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mobalie.talking.gamja.dao.user.JoinDAO;
import mobalie.talking.gamja.dto.user.JoinDTO;
@Service
public class JoinService {
	
	@Autowired
	JoinDAO joinDAO;
	
	
	public int insertJoin(JoinDTO dto){
		int result = joinDAO.insertJoin(dto);
		return result;
	}
	public int checkUserIdExists(JoinDTO dto){
		int result = joinDAO.checkUserIdExists(dto);
		return result;
	}
}