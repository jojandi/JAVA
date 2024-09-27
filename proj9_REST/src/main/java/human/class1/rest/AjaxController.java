package human.class1.rest;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {

	/*
	 * "/rest/ajax.view" <<<<
	 * "/rest/ajax"
	 */
	@RequestMapping(value="/ajax.view", method=RequestMethod.GET)
	public String ajaxView() {
		return "ajax";
	}
	
	
	// @RequestBody : post로 보낸 json을 처리
	@RequestMapping(value="/ajax", method=RequestMethod.POST)
	public String ajax( 
			
			// json을 이용하면 아래 두 개는 넣어주지 않음 => null
			@RequestParam(value="ename", required=false)String ename,
			@ModelAttribute EmpDTO dto2,
			
			@RequestBody EmpDTO dto // json을 분석해서 key value를 가지고 DTO에 넣어줌
	) {
		// json으로 보낸건 @RequestParam 또는 request.getParameter로 받을 수 없다
		System.out.println("ename : "+ ename);
		System.out.println("dto2 : "+ dto2);
		System.out.println("dto : "+ dto);
		
		return "ajax";
	}
	
	// @ResponseBody : 그냥 값이나 json으로 리턴해줌
	@RequestMapping(value="/ajax/string", method=RequestMethod.POST)
	@ResponseBody // ajax가 받는 것 : return값 -> jsp로 가지 않고 human이란 글씨가 나옴
	public String ajaxString( 
			@RequestBody EmpDTO dto
	) {

		System.out.println("dto : "+ dto);
		
		return "human";
	}
	
	@RequestMapping(value="/ajax/dto", method=RequestMethod.POST)
	@ResponseBody
	public EmpDTO ajaxDTO( 
			@RequestBody EmpDTO dto
	) {

		System.out.println("dto : "+ dto);
		
		return dto;
	}
	
	@RequestMapping(value="/ajax/list", method=RequestMethod.POST)
	@ResponseBody
	public List ajaxList( 
			@RequestBody EmpDTO dto
	) {

		System.out.println("dto : "+ dto);
		
		List list = new ArrayList();
		list.add(dto);
		list.add(dto);
		list.add(dto);
		
		return list;
	}
	
	@RequestMapping(value="/ajax/forward", method=RequestMethod.GET)
	public String ajaxForward() {
		return "forward:/ajax.view";
	}
	
	@RequestMapping(value="/ajax/redirect", method=RequestMethod.GET)
	public String ajaxRedirect() {
		return "redirect:/ajax.view";
	}
	
	@RequestMapping(value="/ajax/notice/{num}/static/{str}")
	@ResponseBody
	public int notice(
			// 경로 중 num이라는 것을 읽어서 변수에 넣어라
			@PathVariable("num") int number, 
			@PathVariable("str") String str,
			
			HttpServletRequest req
	) {
		System.out.println("getParameter : " + req.getParameter("num"));
	
		System.out.println("number : " + number);
		System.out.println("str : " + str);
		
		return number;
	}
}





