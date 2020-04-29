package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping("/")
	public String login(Model m)
	{
        return "login";
	}
	
	
	@RequestMapping("validUser")
	
	public ModelAndView logincheck(User user)
	{
		ModelAndView mv=new ModelAndView();
		if(user.getUname().equals("fresherpro" ) && user.getPsw().equals("fresherpro"))
		{
			mv.addObject(user);
	        mv.setViewName("valid");
			return mv;
		}
		else 
		{ 
			mv.addObject(user);
			 mv.setViewName("invalid");
			return mv;}
	}

}
