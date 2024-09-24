package kr.or.human;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

// Controller Bean으로 등록
@Controller
@RequestMapping("/sub")
public class MainController {
	
	// @RequestMapping은 HandlerAdaper가 처리
	@RequestMapping("/test/main1.do")
	public ModelAndView main1() {
		System.out.println("main1 실행");
		
		// ViewResolver로 보내는 객체
		ModelAndView mav = new ModelAndView();
		
		// jsp 이름, forward로 이동
		// viewName을 생성자에 넣어도 됨
//		ModelAndView mav = new ModelAndView("main");
		mav.setViewName("main");
		
		return mav;
	}
	
	@RequestMapping("/test/main2.do")
	public ModelAndView main2() {
		System.out.println("main2 실행");
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("main");
		
		// setAttribute() 같은 아이
		mav.addObject("msg", "조민정");
		
		return mav;
	}
	
	// 전달인자가 하나일 때는 value= 생략 가능, 두 개 이상 값을 넣을 땐 { } 안에 넣는다
	// value : url 패턴
	// method : 접근 방식 제한, 생략 시 모든 방식 허용
	@RequestMapping(
			value = { "/test/main3.do", "/test/*/search" }, 
			method = { RequestMethod.POST, RequestMethod.GET }
	)
	public ModelAndView main3() {
		System.out.println("main3 실행");
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("main");
		
		// setAttribute() 같은 아이
		mav.addObject("msg", "main3 실행");
		
		return mav;
	}
	
	// url 주소가 같으면 부팅 시 예외 발생
//	@RequestMapping("/test/main2.do")
//	public ModelAndView main4() {
//		System.out.println("main2 실행");
//		
//		ModelAndView mav = new ModelAndView();
//		
//		mav.setViewName("main");
//		
//		// setAttribute() 같은 아이
//		mav.addObject("msg", "조민정");
//		
//		return mav;
//	}
	
	@RequestMapping(value = "/test/main5.do", method = RequestMethod.GET)
	public ModelAndView main5() {
		System.out.println("main5 실행");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		mav.addObject("msg", "get");
		
		return mav;
	}
	
	@RequestMapping(value = "/test/main5.do", method = RequestMethod.POST)
	public ModelAndView main6() {
		System.out.println("main6 실행");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		mav.addObject("msg", "post");
		
		return mav;
	}
	
	// method를 put으로 제한, method = RequestMethod.PUT
	@PutMapping("/test/main5.do")
	public ModelAndView main7() {
		System.out.println("main2 실행");
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("main");
		
		// setAttribute() 같은 아이
		mav.addObject("msg", "조민정");
		
		return mav;
	}
	
}
