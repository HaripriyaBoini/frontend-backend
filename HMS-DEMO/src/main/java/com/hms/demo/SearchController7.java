package com.hms.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SearchController7 {
@Autowired
	private Mysecondrepo s;
	
//		@GetMapping("/search7")
     // @GetMapping("/search8")
		public String search(Model model) {
			model.addAttribute("pageTitle", "search1");
			return "/views/responsive/thymeleaf/pages/search8";
		}
    //  @PostMapping("/search8/res")
      public String submit(Model model) {
    	  model.addAttribute("pageTitle", "search1");
			return "/views/responsive/thymeleaf/pages/search8";
      }
//		@PostMapping("/resultpage")
//		public String submitForm(@ModelAttribute("searchmodel") Searchmodel searchmodel, Model model) {
//
//			model.addAttribute("searchmodel", searchmodel);
//
//			s.save(searchmodel);
//			return "views/responsive/thymeleaf/pages/resultpage";
//		}
	            
		
}
