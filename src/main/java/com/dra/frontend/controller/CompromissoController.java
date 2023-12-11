package com.dra.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dra.frontend.model.Compromisso;
import com.dra.frontend.service.CompromissoService;



@Controller
@RequestMapping("/compromisso")
public class CompromissoController {
	public boolean createCompromisso;

    @Autowired
    CompromissoService compromissoService;
    
    @GetMapping("/")
	public String mostraCompromissos(Model model) {
    	createCompromisso = true;
    			
		model.addAttribute("compromissos", compromissoService.getCompromissos());
		model.addAttribute("createCompromisso", createCompromisso);
		return "gerenciarCompromissos";
		
	}
    
    @GetMapping("/criar")
	public String criaCompromissos(Model model) {
    	createCompromisso = false;
		
		model.addAttribute("createCompromisso", createCompromisso);
		return "gerenciarCompromissos";
		
	}
    
    @PutMapping("/editar/{id}")
	public String editarCompromissos(@PathVariable long id, @Validated Compromisso compromisso, BindingResult result, Model model) {
    	createCompromisso = false;
    	System.out.println(compromisso);
    	System.out.println(id);
    	
    	model.addAttribute("compromisso", compromisso);
		model.addAttribute("createCompromisso", createCompromisso);
		
		return "gerenciarCompromissos";
		
	}
}
