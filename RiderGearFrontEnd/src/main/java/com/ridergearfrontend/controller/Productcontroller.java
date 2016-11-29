package com.ridergearfrontend.controller;


import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import rider.dao.ProductDAO;
import rider.model.Product;

@Controller
public class Productcontroller {
	
	private ProductDAO pd;
	

	
	/*@RequestMapping("/AP")
	 public String prod1(Model model)
	 {
		
		 return "AP";
	 }
	

	*/

}
