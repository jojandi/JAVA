package mobalie.talking.gamja.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mobalie.talking.gamja.dao.user.LibraryDAO;
import mobalie.talking.gamja.dto.user.LibraryDTO;



@Service
public class LibraryService {
	@Autowired
	LibraryDAO libraryDAO;
	
	public LibraryDTO selectLibrary(LibraryDTO dto) {
		LibraryDTO list = libraryDAO.selectLibrary(dto);
		
		return list;
	}
	
}
