package com.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.service.AddService;

@Controller
public class AddController {
	
	@Autowired
	AddService as;
	@RequestMapping("/add")
	public ModelAndView add( @RequestParam("t1") int i,@RequestParam("t2") int j) {
		
		
		
		int h=as.addService(i, j);
		ModelAndView mv= new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result",h);
		return mv;
	}
	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
	
	

}
