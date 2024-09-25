package kr.or.human.member.service;

import java.util.List;

import kr.or.human.member.dao.MemberDAO;

public interface MemberService {

	void setMemberDAO(MemberDAO memberDAO);
	
	public List listMember();
	
}
