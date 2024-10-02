package human.class1.ajax.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import human.class1.ajax.dto.EmpDTO;
import human.class1.ajax.service.EmpService;

@Controller
public class EmpController {
	
	@Autowired
	EmpService empService;
	
	@RequestMapping("/listEmp")
	@ResponseBody
	public List<EmpDTO> listEmp() {
		List<EmpDTO> list = empService.listEmp();
		
		return list;
	}
	
	@RequestMapping("/emp")
	public String emp(Model model) {
		return "listEmp";
	}
	
	@RequestMapping(value = "/delEmp", method = RequestMethod.DELETE)
	@ResponseBody
	public int delEmp(@RequestBody EmpDTO empDTO) {
		System.out.println("삭제!!");
		int delete = empService.delEmp(empDTO);
		System.out.println("삭제 : " + delete);
		
		return delete;
	}

}
