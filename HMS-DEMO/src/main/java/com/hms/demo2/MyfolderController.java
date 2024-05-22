package com.hms.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class MyfolderController {

	@GetMapping("/accordianprocess")
	public String accordianprocess(Model model) {
		return "/views/responsive/thymeleaf/fragments/myfolder/accordianprocess";
		
	}
	/*@PostMapping("/details")
	public String submitForm(@ModelAttribute("patientdetails") Patients patients, Model model) {

		model.addAttribute("patients", patients);

		//r.save(patients);
		return "/views/responsive/thymeleaf/patient/details";
	}
	*/
	
}
