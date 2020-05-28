package com.bank.controller;

import java.util.List;

import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bank.models.entity.Cliente;
import com.bank.models.service.IClienteService;

@RestController
public class ClienteController {

	@Autowired
	private Environment env;
	
	@Autowired
	@Qualifier("clienteserv")
	private IClienteService clienteservice;
	
	
	@GetMapping("/listar")
	public List<Cliente> listar(){
		return  (List<Cliente>) clienteservice.findAll();
	}
	
	@GetMapping("/detalle")
	public Cliente detalle(@RequestParam Long id) throws Exception {
		Cliente client =(Cliente) clienteservice.findById(id);
		return client;
	}
	
	@PostMapping("/agregarCliente")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente agregar(@RequestBody Cliente cliente) {
		return (Cliente) clienteservice.save(cliente);
	}

	@PutMapping("/editarCliente/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente editar(@RequestBody Cliente cliente,@PathVariable Long id) {
		Cliente cl = (Cliente)clienteservice.findById(id);
		cl.setNombre(cliente.getNombre());
		cl.setApellidos(cliente.getApellidos());
		cl.setSexo(cliente.getSexo());
		return (Cliente)clienteservice.save(cl);
	}
	
	@DeleteMapping("/eliminarCliente/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminaCliente(@PathVariable Long id)
	{
		clienteservice.deleteById(id);
	}
	
}
