package com.ridergearfrontend.controller;
 
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import rider.dao.ProductDAO;
import rider.dao.UserDAO;
import rider.model.Product;
import rider.model.RiderModel;


@Controller
public class Homecontroller {
	
	
	private ProductDAO pd;
	
	UserDAO userd;
	public Homecontroller()
	{
AnnotationConfigApplicationContext appobj = new AnnotationConfigApplicationContext();
		
		appobj.scan("rider.config");
        appobj.refresh();
       userd =(UserDAO)appobj.getBean("userDao");
       pd=(ProductDAO) appobj.getBean("Prod");
	}


	@RequestMapping("/")
    public ModelAndView helloworld() {
	    return new ModelAndView("Home");
	   
	  }
	
	
	@RequestMapping("/Home")
    public ModelAndView Home() {
	    return new ModelAndView("Home");
	   
	  }
	
	@RequestMapping("/ABOUT US")
    public ModelAndView ABOUTUS() {
	    return new ModelAndView("ABOUT US");
	   
	  }
	
	@RequestMapping("/Login")
    public ModelAndView Login() {
	    return new ModelAndView("Login");
	   
	  }
	
	
	@RequestMapping("/Categories")
    public ModelAndView Categories() {
	    return new ModelAndView("Categories");
	   
	  }
	
	
	
	
	
	
	@RequestMapping("/Signin")
    public ModelAndView register(HttpServletRequest req) {
		String s= req.getParameter("username");
		String p=req.getParameter("password");
		List<RiderModel>ls=userd.list1();
		System.out.println(s);
		System.out.println(p);
		System.out.println(ls);
		ModelAndView mv=new ModelAndView();
		if(!ls.isEmpty())
		{
		for(int i=0;i<ls.size();i++)
		{
			if(s.equals(ls.get(i).getUsername())&&(p.equals(ls.get(i).getPassword())))
			{
			
				if(ls.get(i).getRoleId().equals("ADMIN_ROLE"))
				{
				
				mv.setViewName("/AP");
				
				}
				else
				{
					mv.setViewName("Home");
				}
			}
		}
		}
		else{
			mv.setViewName("Login");
	}
		return mv;
	
	}
	
	   @RequestMapping(value = "/Signup", method = RequestMethod.GET)
	   public ModelAndView signin() {
	      return new ModelAndView("Signup", "command", new Homecontroller());
	   }

	   
	   @ModelAttribute("user")
	   public RiderModel getRiderModel()
	   {
		   return new RiderModel();
	   }
	   
	   @RequestMapping("register")
	   public String registering(@ModelAttribute(value="user") RiderModel rider) {
	     
	    
	      userd.insert(rider);
	      return "Login";
	   }
	
	   @ModelAttribute("prod")
	   public Product getProduct()
	   {
		   return new Product();
	   }
	   
	   @RequestMapping("AP")
	   public String getProduct(@ModelAttribute(value="prod") Product prod)
	   {
		   return "AP";
	   }
	   
		 @RequestMapping(value = "productpost",method = RequestMethod.POST)
		 public String prod2(@ModelAttribute(value="prod") Product prod,ModelMap model )
		 {
			 pd.insert(prod);
			 return "redirect:/listpage";
		 }
		 
		 
		 
		 
		 @RequestMapping("/listpage")
		 public ModelAndView printList()
		 {
			 List<Product> prod=pd.list1();
			 return new ModelAndView("listpage","jaz",prod);
		 }
		 
		 
		 
		 @RequestMapping("/listPost/{id}")
		 public ModelAndView pos(@PathVariable(value="id")int id)
		 {
			Product pr=pd.prodbyid(id); 
			return new ModelAndView("ProdDesc","des",pr);
		 }
		
		 @RequestMapping("/admin/product/delete/{id}")
			public String deletebyid(@PathVariable(value="id")int pid){
				pd.delete(pid);
				return ("redirect:/listpage");
			}
			
			@RequestMapping("/admin/product/edit/{id}")
			public ModelAndView edit(@PathVariable(value="id")int pid){
			 Product product = this.pd.prodbyid(pid);
			 return new ModelAndView("edit","editProdObj",product);
			}
			
			@RequestMapping(value = "/admin/product/edit/update", method = RequestMethod.POST)
			public String edits(@ModelAttribute(value="editProdObj")Product pid)
			{
				pd.Update(pid);
				return ("redirect:/listpage");
		}
		}

	   

	