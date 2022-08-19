package com.cespedes.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cespedes.modelo.Cliente;
import com.cespedes.repositorio.IClienteRepositorio;




@RestController
@RequestMapping("/clientes")
public class ApiController {
	
	@Autowired
	private IClienteRepositorio ClienteRepo;
	
	@GetMapping
	public List<Cliente>listar(){
		return ClienteRepo.findAll();
	}
	@PostMapping
	public void insertar(@RequestBody Cliente cliente){
		ClienteRepo.save(cliente);
	}
	@PutMapping
	public void modificar(@RequestBody Cliente cliente){
		ClienteRepo.save(cliente);
	}
	@DeleteMapping(value = "/{id}") 
 	public void eliminar(@PathVariable("id") Integer id){
		ClienteRepo.deleteById(id);
	}
}
