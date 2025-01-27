package com.book.controllers.user;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.book.models.BookTransaction;
import com.book.repositories.TransactionRepository;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("transaction")
public class TransactionListController
{
	@Autowired private TransactionRepository repo;
	@RequestMapping("list")
	public String userHome(Model model,HttpSession ses) 
	{
		List<BookTransaction> list=repo.findByUserid((String)ses.getAttribute("userid"));
		model.addAttribute("list",list);
		return "user/purchase-list/transaction-list";
	}
}
