package com.lojaArtesanato.artesanato.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class IndexController {
	
	public static String INDEX = "index";
	
	@RequestMapping("/")
	public String index(){
		return INDEX;
	}
}
