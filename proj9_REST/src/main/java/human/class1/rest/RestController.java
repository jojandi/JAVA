package human.class1.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/human")
@ResponseBody // controller에 @ResponseBody를 붙이면 모든 메소드에 @ResponseBody가 붙음
//@RestController // @Controller + @ResponseBody 
public class RestController {

	@RequestMapping("/test1")
	public int test1() {
		return 100;
	}
	@RequestMapping("/test2")
	public String test2() {
		return "ajax";
	}
	
}





