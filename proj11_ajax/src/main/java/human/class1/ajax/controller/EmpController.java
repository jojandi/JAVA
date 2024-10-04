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
	
	// read
	@RequestMapping("/info")
	public String info(Model model, String empno) {
		// 파라미터로 가져온 empno를 DTO에 담아서 SQL문에 넣어줌
		System.out.println("empno : " + empno);
		EmpDTO dto = new EmpDTO();
		dto.setEmpno(Integer.parseInt(empno));
		EmpDTO empDTO = empService.oneEmp(dto);
		
		// joinEmp.jsp에서 사용
		model.addAttribute("cmd", "info");
		model.addAttribute("dto", empDTO);
		
		return "joinEmp";
	}
	
	// insert
	@RequestMapping("/join")
	public String join(Model model) {
		model.addAttribute("cmd", "join");
		return "joinEmp";
	}
	@RequestMapping(value = "/joinEmp", method = RequestMethod.POST)
	@ResponseBody
	public int joinEmp(@RequestBody EmpDTO empDTO) {
		int insert = empService.joinEmp(empDTO);
		System.out.println("추가 : " + insert);
		
		return insert;
	}
	
	// update
	@RequestMapping("/edit")
	public String edit(Model model, String empno) {
		// 파라미터로 가져온 empno를 DTO에 담아서 SQL문에 넣어줌
		System.out.println("empno : " + empno);
		EmpDTO dto = new EmpDTO();
		dto.setEmpno(Integer.parseInt(empno));
		EmpDTO empDTO = empService.oneEmp(dto);
		
		// joinEmp.jsp에서 사용
		model.addAttribute("cmd", "edit");
		model.addAttribute("dto", empDTO);
		
		return "joinEmp";
	}
	@RequestMapping(value = "/editEmp", method = RequestMethod.PUT)
	@ResponseBody
	public int editEmp(@RequestBody EmpDTO empDTO) {
		int update = empService.editEmp(empDTO);
		System.out.println("수정 : " + update);
		
		return update;
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
