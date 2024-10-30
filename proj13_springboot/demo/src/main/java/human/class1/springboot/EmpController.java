package human.class1.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import human.class1.springboot.dao.EmpDAO;

@Controller
public class EmpController {

	@Autowired
	EmpDAO dao;
	
	@RequestMapping("/list")
	public String list(Model model) {
		List list = dao.selectEmp();
		
		model.addAttribute("list", list);
		model.addAttribute("msg", "hello world");
		return "list";
	}
	
}
