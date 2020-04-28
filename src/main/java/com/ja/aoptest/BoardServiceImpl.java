package com.ja.aoptest;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service	//service는 이거
public class BoardServiceImpl {
	
	//로그 찍을 용도
	//private LogAdvice logAdvice = new LogAdvice();
	
	
	@Autowired	//자동으로 주입해
	private BoardDao boardDao;
	
	
	//어노테이션 쓸 때는 굳이 세터 필요없다!
//	public void setBoardDao(BoardDao boardDao) {
//		this.boardDao = boardDao;
//	}
	
	public ArrayList<String> getBoardList(){
		
		//logAdvice.printLog();
		
		//service에서 DAO 생성해서 사용하겠다~
		//데이터를 만들고 처리하는 역할.
		ArrayList<String> list = new BoardDao().selectAll();
		
		return list;
	}
	
	
	//로그 찍는 습관 들이자 이말이야~
	public void login() {
		
		//logAdvice.printLog();
		//로그인과 관련된 매우 중요한 기능들 수행한다고 가정~
		
	}
	
	public void getContent() {
		
		//logAdvice.printLog();
		//읽기와 관련된 로직~
		System.out.println("컨텐트 가져오기 기능 수행");
	}
	
	public void adminFunction() {
		
		//logAdvice.printLog();
		//관리자 관련 로직
		System.out.println("관리자 기능 수행");
	}
	
}
