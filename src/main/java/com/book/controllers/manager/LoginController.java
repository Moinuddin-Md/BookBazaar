package com.book.controllers.manager;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("adminlogin")
public class LoginController 
{
	@RequestMapping("login")
	public String adminLogin(String uid,String pass,RedirectAttributes at,Model model,HttpSession ses) 
	{	
		if(uid.trim().equals("admin") && pass.trim().equals("admin"))
		{
			ses.setAttribute("name","Admin");
			return "redirect:/manager/home";
		}
		else
		{
			at.addAttribute("msg", "Bad credentials");
			return "redirect:/bookstore/adminlogin";
		}
	}
}
