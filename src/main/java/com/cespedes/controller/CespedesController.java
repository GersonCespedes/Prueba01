package com.cespedes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cespedes.modelo.Cliente;
import com.cespedes.repositorio.IClienteRepositorio;

@Controller
public class CespedesController {

	@Autowired
	private IClienteRepositorio ClienteRepo;
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		
		Cliente c= new Cliente();
		c.setId_Cliente(2);
		c.setNombres("Julian");
		c.setApellidos("Cespedes");
		c.setNumerodni("05392162");
		c.setTelefono("993123145");
		c.setCorreo("gcespedes232@gmail.com");
		c.setAfp(1);
		ClienteRepo.save(c);
		
		model.addAttribute("name", name);
		return "greeting";
	}
}
