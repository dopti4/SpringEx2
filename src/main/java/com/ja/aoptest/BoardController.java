package com.ja.aoptest;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	
	@Autowired		//조립
	private BoardServiceImpl boardService;
	
	@RequestMapping("/main_page.do")
	public String mainPage(HttpServletRequest request) {
		
		//new BoardDao().selectAll();	이렇게 안 하겠다 이말이야~
		//서비스라는 티어 하나 더 나눠서 하겠다 이말이야~
		//그니까 컨트롤러 - 서비스 - DAO 요런식으로. 컨트롤러에 코드 너무 많아질 수 있으니 서비스에서 DAO 처리.
		//서비스에서 데이터 처리하고, 컨트롤러는 어떤 서비스를 이용할건지 선택 느낌.
		//BoardServiceImpl s = new BoardServiceImpl();
		ArrayList<String> list = boardService.getBoardList();
		
		request.setAttribute("xxxx", list);
		
		return "main_page";
		
	}
	
	@RequestMapping("/read_content_page.do")
	public String readContentPage() {
		
		return "read_content_page";
		
	}
	
	@RequestMapping("/test1")
	public String test1() {
		
		boardService.adminFunction();
		
		boardService.getContent();
		
		return "aaaa";
	}
	
}
