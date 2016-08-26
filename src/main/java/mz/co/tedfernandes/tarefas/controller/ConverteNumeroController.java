package mz.co.tedfernandes.tarefas.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mz.co.tedfernandes.tarefas.model.ConverteNumero;

@Controller
public class ConverteNumeroController {
	
	@RequestMapping("/olaSpring")
	public String testa(){
		return "teste";
	}
	
	@RequestMapping("/romanoToDecimal")
	public String romanoToDecimal() {
		return "romanoToDecimal";
	}
	
	@RequestMapping("converter")
	public String converter(HttpServletRequest request, Model model) {
		ConverteNumero converteNumero = new ConverteNumero();
		String numeroRomano = request.getParameter("numeroRomano");
		try{
			int resultado = converteNumero.executaOperacao(numeroRomano);
			model.addAttribute("resultado", resultado);
		}catch(IllegalArgumentException e){
			e.getMessage();
			model.addAttribute("resultado", "Argumento Inválido");
		}
		return "resultado";
	}
	
}
