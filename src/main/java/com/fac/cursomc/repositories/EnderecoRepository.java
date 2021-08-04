package com.fac.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fac.cursomc.domain.Endereco;


@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> { //igual ao DAO (Conversar com o banco de dados)
	
	
	
	

}
