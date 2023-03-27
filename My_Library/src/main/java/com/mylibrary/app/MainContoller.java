/*
 * 	1. 최초 작성일 : '23.03.27
 *  2. 마지막 업데이트 : '23. 03. 27
 *  3. 업데이트 내용 : Controller 기본 설정(어노테이션 추가 및 Getmapping 추가)
 *  
 */ 


package com.mylibrary.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainContoller {
	
	@GetMapping("/main")
	public String mainPage() throws Exception{
		
		
		return null;
	}

}
