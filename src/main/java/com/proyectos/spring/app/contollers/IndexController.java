package com.proyectos.spring.app.contollers;


import com.proyectos.spring.app.models.domain.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private List<Producto> productos;

    //Get Mapping
    @GetMapping({"/index","/" , "/home" })
    public String index(Model model){
        model.addAttribute("productos",this.productos);
        model.addAttribute("titulo","DAC");
        return "index";
    }

    @PostMapping("/comprar")
    public String comprar(){
        return "pages/comprar";
    }
}