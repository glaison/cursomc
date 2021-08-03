package com.fac.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fac.cursomc.domain.Cidade;


@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> { //igual ao DAO (Conversar com o banco de dados)
	
	
	
	

}
