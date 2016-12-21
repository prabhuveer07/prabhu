package com.ridergearfrontend.controller;
 
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import rider.dao.ProductDAO;
import rider.dao.UserDAO;
import rider.model.Product;
import rider.model.RiderModel;


@Controller
public class Homecontroller {
	HttpSession session;
	
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
    public ModelAndView printListcust(HttpServletRequest request){
		
		List<Product> list1=pd.prod(request.getParameter("lion"));
		ModelAndView pro=new ModelAndView("Categories");
		pro.addObject("cat",list1);
		
	    return pro;
	   
	  }
	
	@RequestMapping("/Logout")
    public ModelAndView Logout() {
		session.invalidate();
	    return new ModelAndView("Home");
	   
	  }
	
	
	
	
	
	
	@RequestMapping("/Signin")
    public ModelAndView register(HttpServletRequest req) throws ServletException,IOException {
		
		session=req.getSession(true);
		String s= req.getParameter("username");
		String p=req.getParameter("password");
		List<RiderModel>ls=userd.list1(s,p);
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
				
					System.out.println("This is session object  "+session);
					System.out.println(ls.get(i).getUsername());
					session.setAttribute("mt", ls.get(i).getUsername());
					
				mv.setViewName("/AP");
				
				}
				else
				{
					session.setAttribute("mt",ls.get(i).getUsername());
					mv.setViewName("Home");
				}
			}
			else
			{
				mv.setViewName("Login");
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
		 public String prod2(@ModelAttribute(value="prod") Product prod, MultipartFile file,HttpServletRequest request )throws IOException{
	    	 
	     System.out.println("imguploaded");
	     pd.insert(prod);
		 MultipartFile file1 = prod.getFile();
		 System.out.println(file1.getOriginalFilename());
		 
		 String path = "C:/Users/HP/git/prabhu/RiderGearFrontEnd/src/main/webapp/resources/image/" +prod.getId()+".jpg";
		 byte[] bytes=file1.getBytes();
		 BufferedOutputStream image = new BufferedOutputStream(new FileOutputStream(new File(path)));
		 image.write(bytes);
		 image.close();
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

	   

	