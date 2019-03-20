package com.newer.mongo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author wtao
 *
 */
@RestController
public class HomeController {
	
	/**
	 * 
	 * @return
	 */
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	/**
	 * 
	 * tzk
	 */
	@GetMapping("/kai")
	public String update() {
		return "kai";
	}

}
