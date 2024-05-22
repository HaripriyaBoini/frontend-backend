package com.hms.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class FullPageController {
    
	@GetMapping("/PatientInformation")
	public String accordianexample(Model model) {
		model.addAttribute("pageTitle", "PatientInfo");
		return "views/responsive/thymeleaf/patient/PatientInformation";

	}
	
	@GetMapping("/test")
	public String test(Model model) {
		model.addAttribute("pageTitle", "test");
		return "views/responsive/thymeleaf/patient/test";

	}
}
