package com.ja.aoptest;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository		//DAO는 이거
public class BoardDao {
	
	public ArrayList<String> selectAll() {
		
		//DB 연동
		ArrayList<String> list = new ArrayList<String>();
		list.add("안녕1");
		list.add("안녕2");
		list.add("안녕3");
		list.add("안녕4");
		
		return list;
		
	}
	
}
