package mobalie.talking.gamja.dao.user;

import mobalie.talking.gamja.dto.user.JoinDTO;

public interface JoinDAO {
	
	int insertJoin(JoinDTO loanDTO);
	int checkUserIdExists(JoinDTO loanDTO);
	
}
