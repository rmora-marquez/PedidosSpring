package com.mpersd.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	public HelloController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/hello")
	public ModelAndView saluda(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("titulo", "Tutorial Spring MVC");
		mv.addObject("mensaje","Mi primera aplicacion spring MVC");
		mv.setViewName("hello");
		return mv;
	}

}
