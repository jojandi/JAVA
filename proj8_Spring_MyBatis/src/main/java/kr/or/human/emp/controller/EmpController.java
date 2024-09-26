package kr.or.human.emp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.or.human.HomeController;
import kr.or.human.emp.dto.EmpDTO;
import kr.or.human.emp.service.EmpService;

@Controller
public class EmpController {
	
	private static final Logger logger = LoggerFactory.getLogger(EmpController.class);

	@Autowired
	EmpService empService;
	
	@RequestMapping("/member")
	public String listEmp(Model model) {
		
		List<EmpDTO> list = empService.listEmp();
		
		model.addAttribute("list", list);
		
		// 출력 단계 구분하기
//		System.out.println("list.size() : " + list.size());
		logger.debug("debug | list.size() : " + list.size());
		logger.info("info | list.size() : " + list.size()); // syso 대신 출력
		logger.warn("warn | list.size() : " + list.size());
		logger.error("error | list.size() : " + list.size());
		
		return "listEmp";
	}
	
	// 상세정보
	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public String readEmp(@RequestParam int empno, Model model) {
		
		EmpDTO empDTO = new EmpDTO();
		empDTO.setEmpno(empno);
		
		EmpDTO dto = empService.oneEmp(empDTO);
		
		model.addAttribute("dto", dto);
		model.addAttribute("cmd", "info");
		
		return "joinEmp";
	}
	
	// 회원가입
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String joinEmpForm(Model model) {
		
		model.addAttribute("cmd", "join");
		
		return "joinEmp";
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String joinEmp(EmpDTO empDTO, Model model) {
		
		int result = empService.joinEmp(empDTO);
		System.out.println("join : " + result);
		
		return "redirect:member";
	}
	
	// 수정
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String editEmpForm(@RequestParam int empno, Model model) {
		
		EmpDTO empDTO = new EmpDTO();
		empDTO.setEmpno(empno);
		
		EmpDTO dto = empService.oneEmp(empDTO);
		
		model.addAttribute("dto", dto);
		model.addAttribute("cmd", "edit");
		
		return "joinEmp";
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String editEmp(EmpDTO empDTO, Model model) {
		
		int result = empService.editEmp(empDTO);
		System.out.println("edit : " + result);
		
		return "redirect:member";
	}
	
	// 삭제
	@RequestMapping(value = "/del", method = RequestMethod.POST)
	public String delEmp(EmpDTO empDTO, Model model) {
		
		int result = empService.delEmp(empDTO);
		System.out.println("del : " + result);
		
		return "redirect:member";
	}
	
}
