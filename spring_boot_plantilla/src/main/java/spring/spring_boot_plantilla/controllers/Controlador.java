 package spring.spring_boot_plantilla.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {
	
	@Value("${application.controller.nombre}")
	private String nombre;
	
	@GetMapping("/")
	public String hola(Model modelo) {

		modelo.addAttribute("nombre", nombre);
		return "hola";
	}

}
