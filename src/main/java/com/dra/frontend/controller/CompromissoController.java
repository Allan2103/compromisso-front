package com.dra.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dra.frontend.service.CompromissoService;



@Controller
@RequestMapping("/compromisso")
public class CompromissoController {

    @Autowired
    CompromissoService compromissoService;
    
    @GetMapping("/")
	public String mostraCompromissos(Model model) {
		
		model.addAttribute("compromissos", compromissoService.getCompromissos());
		return "gerenciarCompromissos";
		
	}
}
