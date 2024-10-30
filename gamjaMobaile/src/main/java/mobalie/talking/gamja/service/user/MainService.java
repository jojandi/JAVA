package mobalie.talking.gamja.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mobalie.talking.gamja.dao.user.MainDAO;
import mobalie.talking.gamja.dto.user.NotiDTO;


@Service
public class MainService {

	@Autowired
	MainDAO mainDAO;
	
	public List<NotiDTO> selectNoti(){
		List<NotiDTO> list = mainDAO.selectNoti5();
		
		return list;
	}
	
}
