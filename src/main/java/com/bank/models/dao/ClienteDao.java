package com.bank.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bank.models.entity.Cliente;

public interface ClienteDao extends CrudRepository<Cliente,Long>{

}
