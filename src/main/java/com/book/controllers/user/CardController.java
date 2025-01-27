package com.book.controllers.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.book.models.CreditCard;
import com.book.repositories.CreditCardRepository;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("card")
public class CardController
{
	@Autowired private CreditCardRepository repo;
	
	@RequestMapping("details")
	public String userHome(Model model,HttpSession ses) 
	{
		List<CreditCard> list=repo.findAllByUserid((String)ses.getAttribute("userid"));
		model.addAttribute("list", list);
		return "user/card/card-details";
	}
}
