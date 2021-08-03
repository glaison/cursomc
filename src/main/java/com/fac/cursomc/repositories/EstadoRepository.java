package com.fac.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fac.cursomc.domain.Estado;


@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> { //igual ao DAO (Conversar com o banco de dados)
	
	
	
	

}
