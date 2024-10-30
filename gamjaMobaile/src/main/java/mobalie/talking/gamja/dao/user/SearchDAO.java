package mobalie.talking.gamja.dao.user;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import mobalie.talking.gamja.dto.user.BestDTO;
import mobalie.talking.gamja.dto.user.CartDTO;
import mobalie.talking.gamja.dto.user.LibraryDTO;
import mobalie.talking.gamja.dto.user.LoanDTO;
import mobalie.talking.gamja.dto.user.SearchDTO;

@Mapper
public interface SearchDAO {

	List<SearchDTO> selectSearch(String book_name);
	List<LibraryDTO> selectLibCount(BestDTO bestDTO);
	int insertCart(CartDTO cartDTO);
	int insertRes(LoanDTO loanDTO);
	int updateRes(LoanDTO loanDTO);
	
}
