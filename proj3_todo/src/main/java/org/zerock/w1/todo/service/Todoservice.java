package org.zerock.w1.todo.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.zerock.w1.todo.dao.TodoDAO;
import org.zerock.w1.todo.dto.TodoDTO;

public class Todoservice {

	// DB에서 insert
	// 임시로 가짜 데이터 등록
	public void register(TodoDTO todoDTO) {
		System.out.println("등록중......" + todoDTO); // todoDTO의 toString 동작
	}
	
	// DB에서 select
	// 임시로 가짜 데이터 등록
	public List<TodoDTO> getList(){ // <타입제한>
		TodoDAO todoDAO = new TodoDAO();
		
		List<TodoDTO> list = todoDAO.selectAll();

//		List<TodoDTO> list = new ArrayList<TodoDTO>();		
//		for(int i = 0; i < 10; i++) {
//			TodoDTO dto = new TodoDTO();
//			dto.setTno(i);
//			dto.setTitle("todo.." + i);
//			dto.setDueDate(LocalDate.now());
//			
//			list.add(dto);
//		}
//		
		return list;
	}
	
	// 상세 페이지에 들어갈 내용
	// 조회한 tno에 맞는 페이지 나옴
	public TodoDTO get(int tno) {
		
		// 선생님 방식
		TodoDAO todoDAO = new TodoDAO();
		
		TodoDTO dto = todoDAO.selectOne(tno);
		
		// 내 방식
//		TodoDAO todoDAO = new TodoDAO();
//		
//		List<TodoDTO> list = todoDAO.selectAll();
//		TodoDTO dto = list.get(tno-1);
//		
//		dto.setTno(dto.getTno());
//		dto.setTitle(dto.getTitle());
//		dto.setDueDate(dto.getDueDate());
//		dto.setFinished(dto.isFinished());
		
		// 가짜 데이터
//		TodoDTO dto = new TodoDTO();
//		dto.setTno(tno);
//		dto.setTitle("sample Todo");
//		dto.setDueDate(LocalDate.now());
//		dto.setFinished(true);
		
		return dto;
	}

}
