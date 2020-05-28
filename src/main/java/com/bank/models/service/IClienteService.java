package com.bank.models.service;

import java.util.List;


public interface IClienteService {

	
	public List<?> findAll();
	public Object findById(Long id);
	public Object save(Object cliente);
	public void deleteById(Long id);
	
	
	
}
