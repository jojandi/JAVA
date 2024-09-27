package human.class1.rest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller // Class를 Controller Bean으로 등록
@ResponseBody // 이 Class의 모든 메소드에 @ResponseBody를 붙여줌
// @RestController // @Controller + @ResponseBody
@RequestMapping("/human/a") // 메소드 주소 앞에 공통으로 적용
public class ParamController {

	// 해당 타입의 변수에 넣을 수 있는 동일한 클래스나 자동형변환 되는 클래스를 찾아서
	// 생성(IoC) 후 변수에 넣어줌(DI)
	
	// 우선순위
	// 1. @Primary가 붙은 Class
	// 2. @Queslifier("bean id")가 있다면 특정 bean을 가져옴
//	@Autowired
//	EmpSErvice empService;
	
	// 
	@RequestMapping( value = {"/test", "/test/{key}"}, method = RequestMethod.PUT)
	@ResponseBody // 원시타입 또는 json을 돌려줌
	public EmpDTO paramTest(
			HttpServletRequest request, HttpServletResponse response, Model model,
			
			// String id = request.getParameter("id")
			// parameter의 key와 변수명이 같고, 필수가 아니라면 @RequestParam 생략 가능
			@RequestParam(value="id", required=true) String id,
			
			// getparameter로 꺼내서 필드에 set하여 넣어줌
			@ModelAttribute EmpDTO dto1,
			@ModelAttribute("dto") EmpDTO dto2,
			
			// psot, put, delete 등으로 넘어온 json을 분석하여 넣어줌 
			@RequestBody EmpDTO dto6,
			
			@PathVariable("key") String key
	) {
		
		return null;
	}
	
}
