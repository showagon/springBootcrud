package com.abd.RegistratonForm.cont;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.abd.RegistratonForm.model.BuyerModel;
import com.abd.RegistratonForm.services.BuyerServices;

@Controller
public class BuyerController {

	@Autowired
	private BuyerServices buyerservices;
	
	@GetMapping("/showform")
	public String showForm(Model model) {
		model.addAttribute("buyer", new BuyerModel());
		return "myform";
	}
	
	@PostMapping("/saveForm")
	public String SaveForm(@ModelAttribute("buyer") BuyerModel buyer, Model model) {
		
		model.addAttribute("name", buyer.getName());
		model.addAttribute("age", buyer.getAge());
		model.addAttribute("city", buyer.getCity());
		model.addAttribute("pname", buyer.getName());
		model.addAttribute("pmodel", buyer.getPmodel());
		model.addAttribute("price", buyer.getPrice());
		model.addAttribute("ddate", buyer.getDdate());
		
		
		
		buyerservices.SaveFormservice(buyer);
		
		return "redirect:/Showlist";
	}
	
	
	@GetMapping("/Showlist")
	public String ShowBuyerList(Model model) {
		
		List<BuyerModel> buylist = buyerservices.getBuyerListservice();
		
		model.addAttribute("buyer", buylist);
		return "showlist";
		
	}
	
	
	@GetMapping("/showUpdateForm")
	public String showUpdateForm(@RequestParam("id") int theid,Model model) {
		
		BuyerModel singlebuyer = buyerservices.getSingBuyerservice(theid);
		
		model.addAttribute("buyer", singlebuyer);
		return "myform";
		
	}
	
	
	@GetMapping("/DeleteBuyer")
	public String DeleteBuyer(@RequestParam("id") int theid,Model model) {
		
		buyerservices.DeleteSingBuyerservice(theid);
		
		
		return "redirect:/Showlist";
		
	}
	
	@GetMapping("/SearchBuyer")
	public String SearchBuyer(Model model) {
		model.addAttribute("buyer", new BuyerModel());
		
		return "search";
		
	}
	
	
	@PostMapping("/SearchBuyerProcess")
	public String SearchBuyerProcess(HttpServletRequest request,Model model) {
		
	
		String name = request.getParameter("name");
		
		System.out.println("=============>"+request.getParameter("name"));
		List<BuyerModel> buylist =	buyerservices.SearchBuyerService(name);
		model.addAttribute("buyer", buylist);
		return "showlist";
	}
	
	
	
	
	
}
