package mz.co.tedfernandes.tarefas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Teste {
	
	@RequestMapping("/olaSpring")
	public String testa(){
		return "teste";
	}
	
}
