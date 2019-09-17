package com.abd.RegistratonForm.cont;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.abd.RegistratonForm.services.BuyerServices;

@Controller
public class LoginController {

	@Autowired
	private BuyerServices buyerservices;
	
	
	@GetMapping("/showlogin")
	public String showLoginForm() {
		
		return "login";
	}
	
	@PostMapping("/LoginProcess")	
	public String LoginProcess(HttpServletRequest request) {
		
		
		String user = request.getParameter("un");
		String pwd = request.getParameter("pwd");
		
	int count =	buyerservices.LoginProcessServices(user,pwd);
		
		if(count==1) {
			return "redirect:/Showlist";
		}else
		{
			return "redirect:/showlogin";
		}
		
		
	}
	
	
	
}
