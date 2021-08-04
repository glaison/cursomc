package com.fac.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fac.cursomc.domain.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> { //igual ao DAO (Conversar com o banco de dados)
	
	
	
	

}
