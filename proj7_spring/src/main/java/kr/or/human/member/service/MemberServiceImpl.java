package kr.or.human.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import kr.or.human.member.dao.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService  {

	
	// IoC (Inversion of Control)
	// 제어의 역전, 찾아서 new까 대신 해 즘
	
	// DI (Dependency Injection)
	// 의존성 주입, 변수에 넣기
	
	// 우선순위
	// 1. 완전히 동일한 클래스
	// 2. 자동 형변환이 가능한 클래스
	@Autowired
	@Qualifier("memberDAOImpl2")
	MemberDAO memberDAO;

	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	@Override
	public List<Integer> listMember() {
		List list = this.memberDAO.selectMember();
		
		return list;
	}

}
