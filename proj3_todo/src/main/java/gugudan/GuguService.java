package gugudan;

import java.util.ArrayList;
import java.util.List;

public class GuguService {
	
	public List gugu(int num) {
		List list = new ArrayList();
		
		for(int i = 1; i < 10; i++) {
			GuguDTO dto = new GuguDTO();
			dto.setNum1(num);
			dto.setNum2(i);
			dto.setResult(i * num);
			
			list.add(dto);
		}
		
		return list;
	}

}
