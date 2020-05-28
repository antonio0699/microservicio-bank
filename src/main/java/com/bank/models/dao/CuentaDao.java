package com.bank.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bank.models.entity.Cuentas;

public interface CuentaDao  extends CrudRepository<Cuentas,Long>{

}
