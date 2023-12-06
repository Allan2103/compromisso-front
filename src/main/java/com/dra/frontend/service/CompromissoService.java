package com.dra.frontend.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dra.frontend.model.Compromisso;

@Service
public class CompromissoService {
	private final String url = "http://localhost:8080/compromisso"; 

	public List<Compromisso> getCompromissos(){
		
		ArrayList<Compromisso> listaCompromissos = new ArrayList<>();


        for (int i=0;i<20;i++) {
        	listaCompromissos.add(new Compromisso("Reunião " + Integer.toString(i+1), "2023-01-01", "Sala de Conferência", "Pendente"));
        }
		
        return new ArrayList<Compromisso>(listaCompromissos);
        
		/*RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<Compromisso[]> response =  restTemplate.getForEntity(
			url , Compromisso[].class);
		return new ArrayList<Compromisso>(Arrays.asList(response.getBody()));*/
	}
    
}
