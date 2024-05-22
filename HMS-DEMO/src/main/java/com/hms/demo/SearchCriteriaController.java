package com.hms.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SearchCriteriaController {

	@Autowired
	private Searchcriteriarepo sc;
	
	
	
	@GetMapping("/search")
	public String searchCriteria(Model model) {
		model.addAttribute("pageTitle","Search");
		
		return  "views/responsive/thymeleaf/pages/searchcriteria";
		}
	
	
	@PostMapping("/search/result")
	public String searchCriteriaResult(@ModelAttribute SearchCriteria searchcriteria1,  Model model) {
		model.addAttribute("pageTitle","Search Result");
		if(searchcriteria1.getPatientContactNumber().isEmpty()){
		return  "views/responsive/thymeleaf/pages/searchcriteria";
	}
		
		sc.save(searchcriteria1);
	
		System.out.println(searchcriteria1.getPatientContactNumber());
		model.addAttribute("searchcriteria1", searchcriteria1);
		
		return  "views/responsive/thymeleaf/pages/searchcriteria";
		
	}

	
}
