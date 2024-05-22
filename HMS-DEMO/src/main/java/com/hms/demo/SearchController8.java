package com.hms.demo;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SearchController8 {

   


    @GetMapping("/search8")
    public String search(Model model) {
        model.addAttribute("pageTitle", "search8");
        return "/views/responsive/thymeleaf/pages/search8";
    }

    
    //public String submitForm(@ModelAttribute("searchmodel8") Searchmodel8 searchmodel8, Model model) {
       // model.addAttribute("pageTitle","Result");
    @PostMapping("/result8")
    public String result(Model model) {
        model.addAttribute("pageTitle", "search8");
        return "/views/responsive/thymeleaf/pages/search8";
    }

       
    }

