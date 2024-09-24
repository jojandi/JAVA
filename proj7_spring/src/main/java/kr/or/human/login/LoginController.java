package kr.or.human.login;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@GetMapping("/loginForm.do")
	public ModelAndView loginForm() {
		System.out.println("loginForm 실행");

		return new ModelAndView("login");
	}
	
	@PostMapping("/login")
	public ModelAndView login(HttpServletRequest req) {
		System.out.println("login 실행");
		String userID = req.getParameter("userID");
		String userPW = req.getParameter("userPW");
		System.out.println("userID : " + userID);
		System.out.println("userPW : " + userPW);
		
		MemberDTO dto = new MemberDTO();
		dto.setUserID(userID);
		dto.setUserPW(userPW);
		System.out.println(dto);
		
		ModelAndView mav = new ModelAndView("result");
		mav.addObject("dto", dto);
		
		return mav;
	}
	
	@PostMapping("/login2")
	public ModelAndView login2(
			// request.getParameter("name") 의 역할
			@RequestParam("userID") String userID,
			// parameter의 key와 변수명이 같다면 @RequestParam 생략 가능
			@RequestParam(value = "userPW", required = false) String userPW 
	) {
		System.out.println("login 실행");
		System.out.println("userID : " + userID);
		System.out.println("userPW : " + userPW);
		
		MemberDTO dto = new MemberDTO();
		dto.setUserID(userID);
		dto.setUserPW(userPW);
		System.out.println(dto);
		
		ModelAndView mav = new ModelAndView("result");
		mav.addObject("dto", dto);
		
		return mav;
	}
	
	@PostMapping("/login3")
	public ModelAndView login3(@RequestParam Map user) {
		System.out.println("login 실행");
		String userID = (String)user.get("userID");
		String userPW = (String)user.get("userPW");
		System.out.println("userID : " + userID);
		System.out.println("userPW : " + userPW);
		
		MemberDTO dto = new MemberDTO();
		dto.setUserID(userID);
		dto.setUserPW(userPW);
		System.out.println(dto);
		
		ModelAndView mav = new ModelAndView("result");
		mav.addObject("dto", dto);
		
		return mav;
	}
	
	@PostMapping("/login4")
	public ModelAndView login4(MemberDTO dto2) {
		System.out.println("login 실행");

		System.out.println(dto2);
		
		ModelAndView mav = new ModelAndView("result");
		
		return mav;
	}
	
	@PostMapping("/login5")
	public String login5(String userID, MemberDTO dto, Model model) {
		System.out.println("login 실행");
		System.out.println("userID : " + userID);
		System.out.println(dto);
		
		model.addAttribute("userID", userID);
		model.addAttribute("dto", dto);
		
		return "result";
	}
	
	@RequestMapping("/test/result.do")
	public void login6(MemberDTO dto) {
		// return type이 void거나 return값이 null일 때,
		// url의 마지막 묶음에서 . 앞의 주소를 ViewResolver로 보냄 ( 해당 주소.jsp 호출 )
		// 단, 읽기 좋게 명시적으로 return을 해주는 것이 좋다
	}

}

