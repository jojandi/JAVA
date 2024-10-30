package mobalie.talking.gamja.dao.user;

import org.apache.ibatis.annotations.Mapper;

import mobalie.talking.gamja.dto.user.LibraryDTO;

@Mapper
public interface LibraryDAO {
	
	LibraryDTO selectLibrary(LibraryDTO dto);
	
	
}
