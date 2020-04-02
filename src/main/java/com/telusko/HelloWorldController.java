package com.telusko;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	
	 
	@RequestMapping("/showForm")
	public String showForm() {
		return "hellowworld-form";
	}
	@RequestMapping("/processForm")
	public ModelAndView process(@RequestParam("name") String k) {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("processForm");
		mv.addObject("name",k);
		return mv;
		
	}
	
	
}
