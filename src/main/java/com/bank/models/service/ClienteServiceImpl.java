package com.bank.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.bank.models.dao.ClienteDao;
import com.bank.models.entity.Cliente;
import com.bank.models.entity.Cuentas;

import org.springframework.transaction.annotation.Transactional;

@Service("clienteserv")
@Primary
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private ClienteDao clientedao;

	@Override
	public List<?> findAll() {
		// TODO Auto-generated method stub
		return (List<Cliente>)clientedao.findAll();
	}

	@Override
	public Object findById(Long id) {
		// TODO Auto-generated method stub
		return clientedao.findById(id).orElse(null);
	}

	@Override
	public Object save(Object cliente) {
		return clientedao.save((Cliente)cliente);
	}

	@Override
	public void deleteById(Long id) {
		clientedao.deleteById(id);
	}
	
	


}
