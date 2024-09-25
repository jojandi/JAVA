package kr.or.human.member.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl2 implements MemberDAO {

	@Override
	public List selectMember() {
		List list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		
		return list;
	}

}
