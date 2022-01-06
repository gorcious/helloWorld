package com.springboot.petclinic.web;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.petclinic.service.PetClinicService;

@Controller
public class PetClinicController {

	@Autowired
	public PetClinicService petClinicService;
	
	@RequestMapping("/owners")
	public ModelAndView getOwners(){
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("owners",petClinicService.findOwners());
		mav.setViewName("owners");
		return mav;
	}
	
	@RequestMapping("hello")
	public ModelAndView hello() {
		ModelAndView view = new ModelAndView();
		view.addObject("message","Hello World");
		view.addObject("time",new Date());
		view.setViewName("hello");
		return view;
	}
}
