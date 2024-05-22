package com.hms.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MyController {
	
	@Autowired 
	private MyRepo r;

	@GetMapping("/accordianexample")
	public String accordianexample(Model model) {
		model.addAttribute("patients", new Patients());
		return "views/responsive/thymeleaf/patient/accordianexample";

	}

	@PostMapping("/details")
	public String submitForm(@ModelAttribute("patientdetails") Patients patients, Model model) {

		model.addAttribute("patients", patients);

		r.save(patients);
		return "/views/responsive/thymeleaf/patient/details";
	}
	
	//new one
	
	
	
	
	
	
	
	
	
	//GetMapping("/display")
	//public String displayData(Model model) {
		//List<Patient> dataList =r.findAll();
	//model.addAttribute("datalist",datalist);
	 //return "/views/responsive/thymeleaf/patient/display;
	//}
	
	 @GetMapping("/PatientInformation")
     public String mypatient() {
   	  return "/views/responsive/thymeleaf/patient/PatientInformation";
     }

}
