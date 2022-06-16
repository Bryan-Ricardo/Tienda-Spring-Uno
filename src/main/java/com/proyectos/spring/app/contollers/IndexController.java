package com.proyectos.spring.app.contollers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class IndexController {

    //Get Mapping
    @GetMapping({"/index","/" , "/home" })
    public String index(Model model){
        model.addAttribute("titulo","DAC");
        return "index";
    }

}