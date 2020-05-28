package com.bank.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bank.models.dao.CuentaDao;
import com.bank.models.entity.Cuentas;

@Service("cuentasserv")
public class CuentasServiceImpl implements IClienteService {

	@Autowired
	private CuentaDao cuentadao;
	
	@Override
	public List<?> findAll() {
		// TODO Auto-generated method stub
		return (List<Cuentas>)cuentadao.findAll();
	}

	@Override
	public Object findById(Long id) {
		// TODO Auto-generated method stub
		return cuentadao.findById(id).orElse(null);
	}

	@Override
	public Object save(Object cliente) {
		// TODO Auto-generated method stub
		return cuentadao.save((Cuentas) cliente);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

}
