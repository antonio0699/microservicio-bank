package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bank.models.entity.Cuentas;
import com.bank.models.service.IClienteService;

@RestController
public class CuentasController {
	
	@Autowired
	@Qualifier("cuentasserv")
	private IClienteService clienteservice;
	
	@PostMapping("/agregarCuenta")
	@ResponseStatus(HttpStatus.CREATED)
	public Cuentas agregar(@RequestBody Cuentas cuentas) {
		return (Cuentas) clienteservice.save(cuentas);
	}
	
	@PutMapping("/editarCuenta/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Cuentas editar(@RequestBody Cuentas cuentas,@PathVariable Long id) {
		Cuentas cl = (Cuentas)clienteservice.findById(id);
		cl.setTipoProducto(cuentas.getTipoProducto());
		cl.setSaldo(cuentas.getSaldo());
		return (Cuentas) clienteservice.save(cl);
	}
}
