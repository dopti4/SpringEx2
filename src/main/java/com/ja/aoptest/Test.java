package com.ja.aoptest;

import org.springframework.web.servlet.view.*;

public class Test {
	
	public void aaa() {
		
		InternalResourceViewResolver aa = new InternalResourceViewResolver();
		
		aa.setPrefix("/WEB-INF/views/");
		
		aa.setSuffix(".jsp");
		
		
		
	}
	
}
