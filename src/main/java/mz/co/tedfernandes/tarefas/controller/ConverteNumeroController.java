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
		int resultado = converteNumero.converterNumeroRomano(numeroRomano);
		model.addAttribute("resultado", resultado);
		return "resultado";
	}
	
}
