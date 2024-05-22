package com.hms.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MysearchController {
     
	@Autowired
	private Search1repo sr;
	
	
	@GetMapping("/search1")
	public String search(Model model) {
		model.addAttribute("pageTitle", "search1");
		return "/views/responsive/thymeleaf/pages/search1";
	}
	
	@PostMapping("/search1/result")
	public String searchResult(@ModelAttribute Searchmodel searchmodel,  Model model) {
		model.addAttribute("pageTitle","SearchResult");
	if(searchmodel.getFirstname().equals("haripriya")) {
		
	                                                    //	searchmodel.setFirstname("boini");
		searchmodel.setLastname("boini");
	}
		sr.save(searchmodel);
		model.addAttribute("searchmodel",searchmodel);
		 
		                                  //model.addAttribute("patientdetails",patientdetails);
		
		return "/views/responsive/thymeleaf/pages/search1" ;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
  